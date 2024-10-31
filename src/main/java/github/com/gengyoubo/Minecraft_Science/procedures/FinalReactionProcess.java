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

public class FinalReactionProcess {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())
                && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                && (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
            if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ForgeRegistries.ITEMS
                    .getValue(new ResourceLocation("minecraft:nahco3")) && new Object() {
                public int getAmount(int sltid) {
                    if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                        ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
                        if (stack != null)
                            return stack.getCount();
                    }
                    return 0;
                }
            }.getAmount(0) == 2) {
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:na2co3")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(3)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(4)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(5)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(0)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
            } else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == ForgeRegistries.ITEMS
                    .getValue(new ResourceLocation("minecraft:nahco3")) && new Object() {
                public int getAmount(int sltid) {
                    if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                        ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
                        if (stack != null)
                            return stack.getCount();
                    }
                    return 0;
                }
            }.getAmount(1) == 2) {
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:na2co3")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(3)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(4)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(5)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(1)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
            } else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == ForgeRegistries.ITEMS
                    .getValue(new ResourceLocation("minecraft:nahco3")) && new Object() {
                public int getAmount(int sltid) {
                    if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                        ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
                        if (stack != null)
                            return stack.getCount();
                    }
                    return 0;
                }
            }.getAmount(2) == 2) {
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:na2co3")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(3)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(4)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:h2o")));
                    _setstack.setCount(1);
                    ((Slot) _slots.get(5)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(2)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
            }
        }
    }

}
