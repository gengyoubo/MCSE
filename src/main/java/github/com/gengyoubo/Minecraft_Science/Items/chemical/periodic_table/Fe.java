package github.com.gengyoubo.Minecraft_Science.Items.chemical.periodic_table;

import github.com.gengyoubo.Minecraft_Science.Tabs.CHEMICAL_TAB;
import net.minecraft.world.item.Item;

public class Fe extends Item {
    public Fe(){
        super(new Item.Properties().tab(CHEMICAL_TAB.getInstance()));
    }
}
