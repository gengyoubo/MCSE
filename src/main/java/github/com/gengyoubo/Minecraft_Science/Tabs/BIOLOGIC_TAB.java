package github.com.gengyoubo.Minecraft_Science.Tabs;

import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

//生物
public class BIOLOGIC_TAB {
    private static final CreativeModeTab BIOLOGIC_TAB = new CreativeModeTab("biologic_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.a.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return BIOLOGIC_TAB;
    }
}
