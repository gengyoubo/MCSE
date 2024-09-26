package github.com.gengyoubo.Minecraft_Science;

import com.mojang.logging.LogUtils;
import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber_Block;
import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber_BlockItem;
import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber_Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("mcse")
public class Minecraft_Science
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public Minecraft_Science() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEventSubscriber_Block.REGISTRY.register(bus);
        ModEventSubscriber_BlockItem.REGISTRY.register(bus);
        ModEventSubscriber_Feature.REGISTRY.register(bus);
    }
}
