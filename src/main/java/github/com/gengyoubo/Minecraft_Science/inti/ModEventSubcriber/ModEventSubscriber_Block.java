package github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber;

import github.com.gengyoubo.Minecraft_Science.Block.DualChemicalReactionTableBlock;
import github.com.gengyoubo.Minecraft_Science.Block.SingleChemicalReactionTableBlock;
import github.com.gengyoubo.Minecraft_Science.Block.Word_Ore;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEventSubscriber_Block {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "mcse");
    public static final RegistryObject<Block> WORD_ORE = REGISTRY.register("word_ore", Word_Ore::new);
    public static final RegistryObject<Block> SCRT = REGISTRY.register("scrt", SingleChemicalReactionTableBlock::new);
    public static final RegistryObject<Block> DCRT = REGISTRY.register("dcrt", DualChemicalReactionTableBlock::new);

}
