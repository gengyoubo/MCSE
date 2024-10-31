package github.com.gengyoubo.Minecraft_Science.procedures;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class FinalReactionProcess {

    private static final List<Reaction> reactions = new ArrayList<>();

    static {
        // 添加一个示例反应：2 NaHCO3 -> Na2CO3 + CO2 + H2O
        reactions.add(new ChemicalReaction("minecraft:nahco3", 2, "minecraft:na2co3", 1, "minecraft:co2", 1, "minecraft:h2o", 1));
    }

    public static void execute(Entity entity) {
        if (!(entity instanceof Player player) || !(player.containerMenu instanceof Supplier<?> supplier) || !(supplier.get() instanceof Map<?, ?> slots))
            return;

        // 遍历所有反应，逐个检查条件
        for (Reaction reaction : reactions) {
            if (reaction.check(slots)) {
                reaction.handle(slots, player);
                break; // 处理完反应后直接返回
            }
        }
    }

    public interface Reaction {
        boolean check(Map<?, ?> slots);
        void handle(Map<?, ?> slots, Player player);
    }

    private static class ChemicalReaction implements Reaction {
        private final String inputItem;
        private final int inputAmount;
        private final String resultItem1;
        private final int resultAmount1;
        private final String resultItem2;
        private final int resultAmount2;
        private final String resultItem3;
        private final int resultAmount3;

        public ChemicalReaction(String inputItem, int inputAmount, String resultItem1, int resultAmount1, String resultItem2, int resultAmount2, String resultItem3, int resultAmount3) {
            this.inputItem = inputItem;
            this.inputAmount = inputAmount;
            this.resultItem1 = resultItem1;
            this.resultAmount1 = resultAmount1;
            this.resultItem2 = resultItem2;
            this.resultAmount2 = resultAmount2;
            this.resultItem3 = resultItem3;
            this.resultAmount3 = resultAmount3;
        }

        @Override
        public boolean check(Map<?, ?> slots) {
            for (int i = 0; i <= 2; i++) {
                if (isItemAndAmount(slots, i, inputItem, inputAmount)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void handle(Map<?, ?> slots, Player player) {
            for (int i = 0; i <= 2; i++) {
                if (isItemAndAmount(slots, i, inputItem, inputAmount)) {
                    setSlotItem(slots, 3, resultItem1, resultAmount1, player);
                    setSlotItem(slots, 4, resultItem2, resultAmount2, player);
                    setSlotItem(slots, 5, resultItem3, resultAmount3, player);
                    removeSlotItem(slots, i, inputAmount, player);
                    break;
                }
            }
        }

        private static boolean isItemAndAmount(Map<?, ?> slots, int slotIndex, String itemName, int amount) {
            ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
            return stack.getItem() == ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)) && stack.getCount() >= amount;
        }

        private static void setSlotItem(Map<?, ?> slots, int slotIndex, String itemName, int count, Player player) {
            ItemStack stack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)));
            stack.setCount(count);
            ((Slot) slots.get(slotIndex)).set(stack);
            player.containerMenu.broadcastChanges();
        }

        private static void removeSlotItem(Map<?, ?> slots, int slotIndex, int count, Player player) {
            ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
            stack.shrink(count);
            player.containerMenu.broadcastChanges();
        }
    }
}
