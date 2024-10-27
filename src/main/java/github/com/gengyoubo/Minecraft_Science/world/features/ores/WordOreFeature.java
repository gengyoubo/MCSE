package github.com.gengyoubo.Minecraft_Science.world.features.ores;

import github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber.ModEventSubscriber_Block;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class WordOreFeature extends OreFeature {
    public static WordOreFeature FEATURE = null;
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;

    public static Feature<?> feature() {
        FEATURE = new WordOreFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("mcse:wordore", FEATURE, new OreConfiguration(WordOreFeatureRuleTest.INSTANCE, ModEventSubscriber_Block.WORD_ORE.get().defaultBlockState(), 32));
        PLACED_FEATURE = PlacementUtils.register("mcse:wordore", CONFIGURED_FEATURE, List.of(CountPlacement.of(32), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public static final Set<ResourceLocation> GENERATE_BIOMES = null;
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.NETHER, Level.END);

    public WordOreFeature() {
        super(OreConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generate_dimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class WordOreFeatureRuleTest extends RuleTest {
        static final WordOreFeatureRuleTest INSTANCE = new WordOreFeatureRuleTest();
        private static final com.mojang.serialization.Codec<WordOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        private static final RuleTestType<WordOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

        @SubscribeEvent
        public static void init(FMLCommonSetupEvent event) {
            Registry.register(Registry.RULE_TEST, new ResourceLocation("g:cc_match"), CUSTOM_MATCH);
        }

        public boolean test(BlockState blockstate, Random random) {
            return List.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.END_STONE, Blocks.NETHERRACK).contains(blockstate.getBlock());
        }

        protected RuleTestType<?> getType() {
            return CUSTOM_MATCH;
        }
    }

}
