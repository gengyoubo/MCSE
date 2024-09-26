package github.com.gengyoubo.Minecraft_Science.ModEventSubcriber;

import github.com.gengyoubo.Minecraft_Science.Other.ModWorldGeneration;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModEventSubscriber_Feature {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "mcse");
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
    public static final RegistryObject<Feature<?>> AAA = register("mwg", ModWorldGeneration::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ModWorldGeneration.GENERATE_BIOMES, ModWorldGeneration::placedFeature));

    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return REGISTRY.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
            if (registration.biomes() == null || registration.biomes().contains(event.getName()))
                event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
        }
    }

    private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
    }

}
