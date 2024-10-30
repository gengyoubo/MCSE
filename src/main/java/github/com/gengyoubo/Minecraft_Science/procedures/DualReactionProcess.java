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
        addReaction(new ChemicalReaction("mcse:hcl", "mcse:naoh", "mcse:nacl", "mcse:h2o", 1, 1));
        // 添加水的电解反应
        addReaction(new ChemicalReaction("mcse:h2o", null, "mcse:h2", "mcse:o2", 1, 0)); // null 表示没有第二个物品
    }

    public void execute(Entity entity) {
        if (!(entity instanceof Player player) || !(player.containerMenu instanceof Supplier<?> supplier)) return;

        Map<?, ?> slots = (Map<?, ?>) supplier.get();
        ItemStack slot0Item = getSlotItem(slots, 0);
        ItemStack slot1Item = getSlotItem(slots, 1);

        for (Reaction reaction : reactions) {
            if (reaction.check(slots, slot0Item, slot1Item)) {
                reaction.handle(slots, player);
                return; // 处理完反应后直接返回
            }
        }
    }

    public void addReaction(Reaction reaction) {
        reactions.add(reaction);
    }

    public interface Reaction {
        boolean check(Map<?, ?> slots, ItemStack slot0Item, ItemStack slot1Item);
        void handle(Map<?, ?> slots, Player player);
    }

    private static class ChemicalReaction implements Reaction {
        private final String item0;
        private final String item1;
        private final String resultItem0;
        private final String resultItem1;
        private final int amount0;
        private final int amount1;

        // 构造函数
        public ChemicalReaction(String item0, String item1, String resultItem0, String resultItem1, int amount0, int amount1) {
            this.item0 = item0;
            this.item1 = item1;
            this.resultItem0 = resultItem0;
            this.resultItem1 = resultItem1;
            this.amount0 = amount0;
            this.amount1 = amount1;
        }

        @Override
        public boolean check(Map<?, ?> slots, ItemStack slot0Item, ItemStack slot1Item) {
            boolean condition1 = isItemEqual(slot0Item, item0) && getSlotAmount(slots, 0) >= amount0 &&
                    isItemEqual(slot1Item, item1) && getSlotAmount(slots, 1) >= amount1;

            // 添加反向检查
            boolean condition2 = isItemEqual(slot0Item, item1) && getSlotAmount(slots, 0) >= amount1 &&
                    isItemEqual(slot1Item, item0) && getSlotAmount(slots, 1) >= amount0;

            return condition1 || condition2;
        }

        @Override
        public void handle(Map<?, ?> slots, Player player) {
            setSlotItem(slots, 3, resultItem0, amount0, player); // 生成结果物品0
            setSlotItem(slots, 4, resultItem1, amount1, player); // 生成结果物品1
        }
    }

    // 现有的辅助方法
    private static ItemStack getSlotItem(Map<?, ?> slots, int slotIndex) {
        return ((Slot) slots.get(slotIndex)).getItem();
    }

    private static boolean isItemEqual(ItemStack item, String registryName) {
        return item.getItem() == ForgeRegistries.ITEMS.getValue(new ResourceLocation(registryName));
    }

    private static int getSlotAmount(Map<?, ?> slots, int slotIndex) {
        ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
        return stack.getCount();
    }

    private static void setSlotItem(Map<?, ?> slots, int slotIndex, String registryName, int count, Player player) {
        ItemStack stack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(registryName)));
        stack.setCount(count);
        ((Slot) slots.get(slotIndex)).set(stack);
        player.containerMenu.broadcastChanges();
    }
}
