package github.com.gengyoubo.Minecraft_Science.world.features.ores;

import github.com.gengyoubo.Minecraft_Science.Minecraft_Science_Config;
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
        // 初始化自定义的 Feature
        FEATURE = new WordOreFeature();

        // 使用配置文件的值来动态设置矿石生成数量和高度
        int oreAmount = Minecraft_Science_Config.WordOreAmount.get();
        int heightMax = Minecraft_Science_Config.WordOreHeightMax.get();
        int heightMin = Minecraft_Science_Config.WordOreHeightMin.get();

        // 注册配置的矿石生成特征
        CONFIGURED_FEATURE = FeatureUtils.register(
                "mcse:wordore",
                FEATURE,
                new OreConfiguration(WordOreFeatureRuleTest.INSTANCE, ModEventSubscriber_Block.WORD_ORE.get().defaultBlockState(), oreAmount)
        );

        // 注册放置特征，使用配置文件的高度范围
        PLACED_FEATURE = PlacementUtils.register(
                "mcse:wordore",
                CONFIGURED_FEATURE,
                List.of(
                        CountPlacement.of(oreAmount),  // 使用配置文件的矿石生成数量
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(heightMin),
                                VerticalAnchor.absolute(heightMax)
                        ),
                        BiomeFilter.biome()
                )
        );

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
