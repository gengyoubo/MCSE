package github.com.gengyoubo.Minecraft_Science.inti;

import github.com.gengyoubo.Minecraft_Science.world.inventory.SingleChemistryReactionDeskMenu;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.network.IContainerFactory;

@Mod.EventBusSubscriber(modid = "mcse", bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCSEMenus {

    public static MenuType<SingleChemistryReactionDeskMenu> SC;

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
        SC = new MenuType<>((IContainerFactory<SingleChemistryReactionDeskMenu>) SingleChemistryReactionDeskMenu::new);
        SC.setRegistryName("mcse", "single_chemical_reaction_table");
        event.getRegistry().register(SC);
    }
}
