package github.com.gengyoubo.Minecraft_Science.Other;

import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber_Block;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration;
import net.minecraft.world.level.levelgen.feature.ReplaceBlobsFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import java.util.Set;
import java.util.List;

public class ModWorldGeneration extends ReplaceBlobsFeature {
    public static ModWorldGeneration FEATURE = null;
    public static Holder<ConfiguredFeature<ReplaceSphereConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;

    public static Feature<?> feature() {
        FEATURE = new ModWorldGeneration();
        CONFIGURED_FEATURE = FeatureUtils.register("g:mwg", FEATURE, new ReplaceSphereConfiguration(ModEventSubscriber_Block.WORD_ORE.get().defaultBlockState(), ModEventSubscriber_Block.WORD_ORE.get().defaultBlockState(), UniformInt.of(3, 7)));
        PLACED_FEATURE = PlacementUtils.register("g:mwg", CONFIGURED_FEATURE,
                List.of(CountPlacement.of(ConstantInt.of(25)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()), BiomeFilter.biome()));
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public static final Set<ResourceLocation> GENERATE_BIOMES = null;
    private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

    public ModWorldGeneration() {
        super(ReplaceSphereConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<ReplaceSphereConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generateDimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }
}
