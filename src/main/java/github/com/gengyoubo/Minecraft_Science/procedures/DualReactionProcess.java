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

public class DualReactionProcess {
    private final List<Reaction> reactions = new ArrayList<>();

    public DualReactionProcess() {
        // 添加 NaCl 反应
        addReaction(new ChemicalReaction("mcse:hcl", 1, "mcse:naoh", 1, "mcse:nacl", 1, "mcse:h2o", 1));
        // 添加水的电解反应
        addReaction(new ChemicalReaction("mcse:h2o", 1, null, 0, "mcse:h2", 2, "mcse:o2", 1)); // null 表示没有第二个物品
    }

    public void execute(Entity entity) {
        if (!(entity instanceof Player player) || !(player.containerMenu instanceof Supplier<?> supplier)) return;

        Map<?, ?> slots = (Map<?, ?>) supplier.get();

        for (Reaction reaction : reactions) {
            if (reaction.check(slots)) { // 不再需要 slot0Item 和 slot1Item
                reaction.handle(slots, player);
                return; // 处理完反应后直接返回
            }
        }
    }

    public void addReaction(Reaction reaction) {
        reactions.add(reaction);
    }

    public interface Reaction {
        boolean check(Map<?, ?> slots);
        void handle(Map<?, ?> slots, Player player);
    }

    public static class ChemicalReaction implements Reaction {
        private final String inputItem1;
        private final int inputAmount1;
        private final String inputItem2;
        private final int inputAmount2;
        private final String resultItem1;
        private final int resultAmount1;
        private final String resultItem2;
        private final int resultAmount2;

        public ChemicalReaction(String inputItem1, int inputAmount1, String inputItem2, int inputAmount2,
                                String resultItem1, int resultAmount1, String resultItem2, int resultAmount2) {
            this.inputItem1 = inputItem1;
            this.inputAmount1 = inputAmount1;
            this.inputItem2 = inputItem2;
            this.inputAmount2 = inputAmount2;
            this.resultItem1 = resultItem1;
            this.resultAmount1 = resultAmount1;
            this.resultItem2 = resultItem2;
            this.resultAmount2 = resultAmount2;
        }

        public boolean check(Map<?, ?> slots) {
            boolean condition1 = isItemAndAmount(slots, 0, inputItem1, inputAmount1) || isItemAndAmount(slots, 1, inputItem1, inputAmount1) || isItemAndAmount(slots, 2, inputItem1, inputAmount1);
            boolean condition2 = inputItem2 != null && (isItemAndAmount(slots, 0, inputItem2, inputAmount2) || isItemAndAmount(slots, 1, inputItem2, inputAmount2) || isItemAndAmount(slots, 2, inputItem2, inputAmount2));

            return condition1 && (inputItem2 == null || condition2);
        }

        public void handle(Map<?, ?> slots, Player player) {
            for (int i = 0; i <= 2; i++) {
                if (isItemAndAmount(slots, i, inputItem1, inputAmount1)) {
                    // 处理输入物品
                    removeSlotItem(slots, i, inputAmount1, player);
                    break; // 只需处理一个输入物品
                }
            }

            // 生成结果物品（仅当 resultItem 不为空时）
            if (resultItem1 != null) {
                setSlotItem(slots, 3, resultItem1, resultAmount1, player);
            }
            if (resultItem2 != null) {
                setSlotItem(slots, 4, resultItem2, resultAmount2, player);
            }
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
