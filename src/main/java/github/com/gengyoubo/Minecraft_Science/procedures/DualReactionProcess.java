package github.com.gengyoubo.Minecraft_Science.procedures;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.function.Supplier;

public class DualReactionProcess {
    public static void execute(Entity entity) {
        if (!(entity instanceof Player player) || !(player.containerMenu instanceof Supplier<?> supplier)) return;

        Map<?, ?> slots = (Map<?, ?>) supplier.get();
        ItemStack slot0Item = getSlotItem(slots, 0);
        ItemStack slot1Item = getSlotItem(slots, 1);

        if (isSlotEmpty(slot0Item) || isSlotEmpty(slot1Item)) return;

        if (isItemEqual(slot0Item, "mcse:h2o") && getSlotAmount(slots, 0) == 2) {
            setSlotItem(slots, 3, "mcse:h2", 2, player);
            setSlotItem(slots, 4, "mcse:o2", 2, player);
        } else if (isItemEqual(slot1Item, "mcse:h2o") && getSlotAmount(slots, 1) == 2) {
            setSlotItem(slots, 3, "mcse:h2", 2, player);
            setSlotItem(slots, 4, "mcse:o2", 2, player);
        }
    }

    private static ItemStack getSlotItem(Map<?, ?> slots, int slotIndex) {
        return ((Slot) slots.get(slotIndex)).getItem();
    }

    private static boolean isSlotEmpty(ItemStack item) {
        return item.getItem() == Blocks.AIR.asItem();
    }

    private static boolean isItemEqual(ItemStack item, String registryName) {
        return item.getItem() == ForgeRegistries.ITEMS.getValue(new ResourceLocation(registryName));
    }

    private static int getSlotAmount(Map<?, ?> slots, int slotIndex) {
        ItemStack stack = ((Slot) slots.get(slotIndex)).getItem();
        return stack != null ? stack.getCount() : 0;
    }

    private static void setSlotItem(Map<?, ?> slots, int slotIndex, String registryName, int count, Player player) {
        ItemStack stack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(registryName)));
        stack.setCount(count);
        ((Slot) slots.get(slotIndex)).set(stack);
        player.containerMenu.broadcastChanges();
    }
}
