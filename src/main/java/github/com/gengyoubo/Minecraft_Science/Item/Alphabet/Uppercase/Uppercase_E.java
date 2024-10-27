package github.com.gengyoubo.Minecraft_Science.Item.Alphabet.Uppercase;


import github.com.gengyoubo.Minecraft_Science.Tabs.ALPHABET_TAB;
import net.minecraft.world.item.Item;

public class Uppercase_E extends Item {
    public Uppercase_E() {
        super(new Item.Properties().tab(ALPHABET_TAB.getInstance())); // 设置创造模式物品栏
    }
}