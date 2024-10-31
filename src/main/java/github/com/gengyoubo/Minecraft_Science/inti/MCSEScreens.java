package github.com.gengyoubo.Minecraft_Science.inti;

import github.com.gengyoubo.Minecraft_Science.gui.ChemicalReactionTablefinaltypeScreen;
import github.com.gengyoubo.Minecraft_Science.gui.DualChemicalReactionTableScreen;
import github.com.gengyoubo.Minecraft_Science.gui.SingleChemistryReactionDeskScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(modid = "mcse", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MCSEScreens {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(MCSEMenus.SC, SingleChemistryReactionDeskScreen::new);
            MenuScreens.register(MCSEMenus.DC, DualChemicalReactionTableScreen::new);
            MenuScreens.register(MCSEMenus.FT, ChemicalReactionTablefinaltypeScreen::new);
        });
    }
}
