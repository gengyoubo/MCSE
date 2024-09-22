package github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase;

import github.com.gengyoubo.Minecraft_Science.Tabs.GENERIC_TAB;
import net.minecraft.world.item.Item;

public class T extends Item {
    public T() {
        super(new Item.Properties().tab(GENERIC_TAB.getInstance())); // 设置创造模式物品栏
    }
}