package github.com.gengyoubo.Minecraft_Science.Tabs;
//通用
import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GENERIC_TAB {
    private static final CreativeModeTab GENERIC_TAB = new CreativeModeTab("generic_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.Lowercase_a.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return GENERIC_TAB;
    }
}
