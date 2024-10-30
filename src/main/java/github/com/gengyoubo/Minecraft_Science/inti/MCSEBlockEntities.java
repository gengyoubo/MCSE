package github.com.gengyoubo.Minecraft_Science.inti;

import github.com.gengyoubo.Minecraft_Science.Block.entity.DualChemicalReactionTableBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber.ModEventSubscriber_Block;
import github.com.gengyoubo.Minecraft_Science.Block.entity.SingleChemicalReactionTableBlockEntity;


public class MCSEBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, "mcse");
    public static final RegistryObject<BlockEntityType<?>> SCRT = register("scrt", ModEventSubscriber_Block.SCRT, SingleChemicalReactionTableBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> DCRT = register("dcrt", ModEventSubscriber_Block.DCRT, DualChemicalReactionTableBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }

}
