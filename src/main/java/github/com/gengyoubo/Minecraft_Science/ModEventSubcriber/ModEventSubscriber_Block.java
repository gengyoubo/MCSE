package github.com.gengyoubo.Minecraft_Science.ModEventSubcriber;

import github.com.gengyoubo.Minecraft_Science.Items.chemical.Word_Ore;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEventSubscriber_Block {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "mcse");
    public static final RegistryObject<Block> WORD_ORE = REGISTRY.register("word_ore", Word_Ore::new);

}
