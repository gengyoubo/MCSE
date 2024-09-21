package github.com.gengyoubo.Minecraft_Science.Tabs;
//物理
import github.com.gengyoubo.Minecraft_Science.Other.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PHYSICS_TAB {
    private static final CreativeModeTab PHYSICS_TAB = new CreativeModeTab("physics_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.a.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return PHYSICS_TAB;
    }
}
