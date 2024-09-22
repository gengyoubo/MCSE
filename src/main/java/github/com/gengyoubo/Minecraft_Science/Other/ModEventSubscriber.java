package github.com.gengyoubo.Minecraft_Science.Other;

import github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.*;
import github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.*;
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
        registerItem(event, new A(), "uppercase_a");
        registerItem(event, new B(), "uppercase_b");
        registerItem(event, new C(), "uppercase_c");
        registerItem(event, new D(), "uppercase_d");
        registerItem(event, new E(), "uppercase_e");
        registerItem(event, new F(), "uppercase_f");
        registerItem(event, new G(), "uppercase_g");
        registerItem(event, new H(), "uppercase_h");
        registerItem(event, new I(), "uppercase_i");
        registerItem(event, new J(), "uppercase_j");
        registerItem(event, new K(), "uppercase_k");
        registerItem(event, new L(), "uppercase_l");
        registerItem(event, new M(), "uppercase_m");
        registerItem(event, new N(), "uppercase_n");
        registerItem(event, new O(), "uppercase_o");
        registerItem(event, new P(), "uppercase_p");
        registerItem(event, new Q(), "uppercase_q");
        registerItem(event, new R(), "uppercase_r");
        registerItem(event, new S(), "uppercase_s");
        registerItem(event, new T(), "uppercase_t");
        registerItem(event, new U(), "uppercase_u");
        registerItem(event, new V(), "uppercase_v");
        registerItem(event, new W(), "uppercase_w");
        registerItem(event, new X(), "uppercase_x");
        registerItem(event, new Y(), "uppercase_y");
        registerItem(event, new Z(), "uppercase_z");
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

}