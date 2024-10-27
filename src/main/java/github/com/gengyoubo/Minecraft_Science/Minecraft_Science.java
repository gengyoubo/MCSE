package github.com.gengyoubo.Minecraft_Science;

import com.mojang.logging.LogUtils;
import github.com.gengyoubo.Minecraft_Science.inti.MCSEBlockEntities;
import github.com.gengyoubo.Minecraft_Science.inti.MCSEFeatures;
import github.com.gengyoubo.Minecraft_Science.inti.MCSEMenus;
import github.com.gengyoubo.Minecraft_Science.inti.MCSEScreens;
import github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber.ModEventSubscriber_Block;
import github.com.gengyoubo.Minecraft_Science.inti.ModEventSubcriber.ModEventSubscriber_BlockItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.slf4j.Logger;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.antlr.runtime.debug.DebugEventListener.PROTOCOL_VERSION;

@Mod("mcse")
public class Minecraft_Science {
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("mcse","mcse" ), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    private static final Logger LOGGER = LogUtils.getLogger();
    public Minecraft_Science() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册其他内容
        ModEventSubscriber_Block.REGISTRY.register(bus);
        ModEventSubscriber_BlockItem.REGISTRY.register(bus);
        MCSEFeatures.REGISTRY.register(bus);
        MCSEBlockEntities.REGISTRY.register(bus);

        // 注册客户端事件
        bus.addListener(MCSEScreens::clientSetup);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }

}
