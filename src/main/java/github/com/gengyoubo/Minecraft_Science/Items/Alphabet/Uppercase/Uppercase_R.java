package github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase;

import github.com.gengyoubo.Minecraft_Science.Tabs.ALPHABET_TAB;
import net.minecraft.world.item.Item;

public class Uppercase_R extends Item {
    public Uppercase_R() {
        super(new Item.Properties().tab(ALPHABET_TAB.getInstance())); // 设置创造模式物品栏
    }
}