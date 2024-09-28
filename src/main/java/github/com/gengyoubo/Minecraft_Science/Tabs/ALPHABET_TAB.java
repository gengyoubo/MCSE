package github.com.gengyoubo.Minecraft_Science.Tabs;
//字母
import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ALPHABET_TAB {
    private static final CreativeModeTab ALPHABET_TAB = new CreativeModeTab("alphabet_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModEventSubscriber.a.get()); // 使用物品 a_Item 作为图标
        }
    };

    public static CreativeModeTab getInstance() {
        return ALPHABET_TAB;
    }
}
