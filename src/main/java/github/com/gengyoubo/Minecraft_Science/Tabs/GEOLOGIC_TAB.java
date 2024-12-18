package github.com.gengyoubo.Minecraft_Science.Tabs;

import github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

//地质
public class GEOLOGIC_TAB {
    private static final CreativeModeTab GEOLOGIC_TAB = new CreativeModeTab("generic_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.Lowercase_a.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return GEOLOGIC_TAB;
    }
}
