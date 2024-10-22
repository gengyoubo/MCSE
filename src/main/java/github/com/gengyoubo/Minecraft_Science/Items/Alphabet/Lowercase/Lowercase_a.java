package github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase;


import github.com.gengyoubo.Minecraft_Science.Tabs.ALPHABET_TAB;
import net.minecraft.world.item.Item;

public class Lowercase_a extends Item {
    public Lowercase_a() {
        super(new Item.Properties().tab(ALPHABET_TAB.getInstance())); // 设置创造模式物品栏
    }
}