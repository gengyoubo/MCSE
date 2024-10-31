package github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber;

import github.com.gengyoubo.Minecraft_Science.Tabs.CHEMICAL_TAB;
import github.com.gengyoubo.Minecraft_Science.Tabs.GENERIC_TAB;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEventSubscriber_BlockItem {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "mcse");
    public static final RegistryObject<Item> WORD_ORE = block(ModEventSubscriber_Block.WORD_ORE, GENERIC_TAB.getInstance());
    public static final RegistryObject<Item> SCRT = block(ModEventSubscriber_Block.SCRT, CHEMICAL_TAB.getInstance());
    public static final RegistryObject<Item> DCRT = block(ModEventSubscriber_Block.DCRT, CHEMICAL_TAB.getInstance());
    public static final RegistryObject<Item> CRTF = block(ModEventSubscriber_Block.CRTF, CHEMICAL_TAB.getInstance());

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
