package github.com.gengyoubo.Minecraft_Science.Other;

import github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.*;
import github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.*;
import github.com.gengyoubo.Minecraft_Science.Items.chemical.Reality_Ingot;
import github.com.gengyoubo.Minecraft_Science.Items.chemical.Reality_Powder;
import github.com.gengyoubo.Minecraft_Science.Items.chemical.periodic_table.Fe;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// 物品注册表
@Mod.EventBusSubscriber(modid = "mcse", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    // 注册物品
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        registerItem(event, new a(), "a");
        registerItem(event, new b(), "b");
        registerItem(event, new c(), "c");
        registerItem(event, new d(), "d");
        registerItem(event, new e(), "e");
        registerItem(event, new f(), "f");
        registerItem(event, new g(), "g");
        registerItem(event, new h(), "h");
        registerItem(event, new i(), "i");
        registerItem(event, new j(), "j");
        registerItem(event, new k(), "k");
        registerItem(event, new l(), "l");
        registerItem(event, new m(), "m");
        registerItem(event, new n(), "n");
        registerItem(event, new o(), "o");
        registerItem(event, new p(), "p");
        registerItem(event, new q(), "q");
        registerItem(event, new r(), "r");
        registerItem(event, new s(), "s");
        registerItem(event, new t(), "t");
        registerItem(event, new u(), "u");
        registerItem(event, new v(), "v");
        registerItem(event, new w(), "w");
        registerItem(event, new x(), "x");
        registerItem(event, new y(), "y");
        registerItem(event, new z(), "z");
        registerItem(event, new Uppercase_A(), "uppercase_a");
        registerItem(event, new Uppercase_B(), "uppercase_b");
        registerItem(event, new Uppercase_C(), "uppercase_c");
        registerItem(event, new Uppercase_D(), "uppercase_d");
        registerItem(event, new Uppercase_E(), "uppercase_e");
        registerItem(event, new Uppercase_F(), "uppercase_f");
        registerItem(event, new Uppercase_G(), "uppercase_g");
        registerItem(event, new Uppercase_H(), "uppercase_h");
        registerItem(event, new Uppercase_I(), "uppercase_i");
        registerItem(event, new Uppercase_J(), "uppercase_j");
        registerItem(event, new Uppercase_K(), "uppercase_k");
        registerItem(event, new Uppercase_L(), "uppercase_l");
        registerItem(event, new Uppercase_M(), "uppercase_m");
        registerItem(event, new Uppercase_N(), "uppercase_n");
        registerItem(event, new Uppercase_O(), "uppercase_o");
        registerItem(event, new Uppercase_P(), "uppercase_p");
        registerItem(event, new Uppercase_Q(), "uppercase_q");
        registerItem(event, new Uppercase_R(), "uppercase_r");
        registerItem(event, new Uppercase_S(), "uppercase_s");
        registerItem(event, new Uppercase_T(), "uppercase_t");
        registerItem(event, new Uppercase_U(), "uppercase_u");
        registerItem(event, new Uppercase_V(), "uppercase_v");
        registerItem(event, new Uppercase_W(), "uppercase_w");
        registerItem(event, new Uppercase_X(), "uppercase_x");
        registerItem(event, new Uppercase_Y(), "uppercase_y");
        registerItem(event, new Uppercase_Z(), "uppercase_z");
        registerItem(event, new Fe(), "fe");
        registerItem(event, new Reality_Powder(), "reality_powder");
        registerItem(event,new Reality_Ingot(),"reality_ingot");
        // 以registerItem的格式注册物品↑
    }
    //一键注册物品的属性
    private static void registerItem(RegistryEvent.Register<Item> event, Item item, String name) {
        item.setRegistryName("mcse", name);
        event.getRegistry().register(item);
    }
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "mcse");
    //需要用模组物品的图标，在这里注册↓
    public static final RegistryObject<Item> a = REGISTRY.register("a", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.a::new);
    public static final RegistryObject<Item> Fe = REGISTRY.register("fe", github.com.gengyoubo.Minecraft_Science.Items.chemical.periodic_table.Fe::new);

}