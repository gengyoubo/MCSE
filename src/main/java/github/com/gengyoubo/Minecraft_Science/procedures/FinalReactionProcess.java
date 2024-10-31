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

    private static final List<ChemicalReaction> reactions = new ArrayList<>();

    static {
        // 添加反应：将 nahco3 转换为 na2co3、co2 和 h2o
        reactions.add(new ChemicalReaction("minecraft:nahco3", 2, null, 0, null, 0, "minecraft:na2co3", 1, "minecraft:co2", 1, "minecraft:h2o", 1));
    }

    public static void execute(Entity entity) {
        if (!(entity instanceof Player player) || !(player.containerMenu instanceof Supplier<?> supplier) || !(supplier.get() instanceof Map<?, ?> slots))
            return;

        // 遍历所有反应，逐个检查条件
        for (ChemicalReaction reaction : reactions) {
            if (reaction.check(slots)) {
                reaction.handle(slots, player);
                break; // 处理完反应后直接返回
            }
        }
    }

    private static class ChemicalReaction {
        private final String inputItem1;
        private final int inputAmount1;
        private final String inputItem2;
        private final int inputAmount2;
        private final String inputItem3;
        private final int inputAmount3;
        private final String resultItem1;
        private final int resultAmount1;
        private final String resultItem2;
        private final int resultAmount2;
        private final String resultItem3;
        private final int resultAmount3;

        public ChemicalReaction(String inputItem1, int inputAmount1, String inputItem2, int inputAmount2, String inputItem3, int inputAmount3,
                                String resultItem1, int resultAmount1, String resultItem2, int resultAmount2, String resultItem3, int resultAmount3) {
            this.inputItem1 = inputItem1;
            this.inputAmount1 = inputAmount1;
            this.inputItem2 = inputItem2;
            this.inputAmount2 = inputAmount2;
            this.inputItem3 = inputItem3;
            this.inputAmount3 = inputAmount3;
            this.resultItem1 = resultItem1;
            this.resultAmount1 = resultAmount1;
            this.resultItem2 = resultItem2;
            this.resultAmount2 = resultAmount2;
            this.resultItem3 = resultItem3;
            this.resultAmount3 = resultAmount3;
        }

        public boolean check(Map<?, ?> slots) {
            boolean condition1 = isItemAndAmount(slots, 0, inputItem1, inputAmount1) || isItemAndAmount(slots, 1, inputItem1, inputAmount1) || isItemAndAmount(slots, 2, inputItem1, inputAmount1);
            boolean condition2 = inputItem2 != null && (isItemAndAmount(slots, 0, inputItem2, inputAmount2) || isItemAndAmount(slots, 1, inputItem2, inputAmount2) || isItemAndAmount(slots, 2, inputItem2, inputAmount2));
            boolean condition3 = inputItem3 != null && (isItemAndAmount(slots, 0, inputItem3, inputAmount3) || isItemAndAmount(slots, 1, inputItem3, inputAmount3) || isItemAndAmount(slots, 2, inputItem3, inputAmount3));

            return condition1 && (!(inputItem2 != null) || condition2) && (!(inputItem3 != null) || condition3);
        }

        public void handle(Map<?, ?> slots, Player player) {
            for (int i = 0; i <= 2; i++) {
                if (isItemAndAmount(slots, i, inputItem1, inputAmount1)) {
                    // 处理输入物品
                    removeSlotItem(slots, i, inputAmount1, player);
                    break; // 只需处理一个输入物品
                }
            }
            // 生成结果物品
            setSlotItem(slots, 3, resultItem1, resultAmount1, player);
            setSlotItem(slots, 4, resultItem2, resultAmount2, player);
            setSlotItem(slots, 5, resultItem3, resultAmount3, player);
        }

        private boolean isItemAndAmount(Map<?, ?> slots, int slotIndex, String itemName, int amount) {
            ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
            return stack.getItem() == ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)) && stack.getCount() >= amount;
        }

        private void setSlotItem(Map<?, ?> slots, int slotIndex, String itemName, int count, Player player) {
            ItemStack stack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)));
            stack.setCount(count);
            ((Slot) slots.get(slotIndex)).set(stack);
            player.containerMenu.broadcastChanges();
        }

        private void removeSlotItem(Map<?, ?> slots, int slotIndex, int count, Player player) {
            ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
            stack.shrink(count);
            player.containerMenu.broadcastChanges();
        }
    }
}
