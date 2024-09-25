package github.com.gengyoubo.Minecraft_Science.Tabs;

import github.com.gengyoubo.Minecraft_Science.Other.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

//化学
public class CHEMICAL_TAB {
    private static final CreativeModeTab CHEMICAL_TAB = new CreativeModeTab("chemical_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.Fe.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return CHEMICAL_TAB;
    }
}
