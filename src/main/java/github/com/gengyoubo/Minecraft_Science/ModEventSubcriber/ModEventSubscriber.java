package github.com.gengyoubo.Minecraft_Science.ModEventSubcriber;

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
    public static final RegistryObject<Item> b = REGISTRY.register("b", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.b::new);
    public static final RegistryObject<Item> c = REGISTRY.register("c", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.c::new);
    public static final RegistryObject<Item> d = REGISTRY.register("d", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.d::new);
    public static final RegistryObject<Item> e = REGISTRY.register("e", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.e::new);
    public static final RegistryObject<Item> f = REGISTRY.register("f", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.f::new);
    public static final RegistryObject<Item> g = REGISTRY.register("g", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.g::new);
    public static final RegistryObject<Item> h = REGISTRY.register("h", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.h::new);
    public static final RegistryObject<Item> i = REGISTRY.register("i", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.i::new);
    public static final RegistryObject<Item> j = REGISTRY.register("j", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.j::new);
    public static final RegistryObject<Item> k = REGISTRY.register("k", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.k::new);
    public static final RegistryObject<Item> l = REGISTRY.register("l", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.l::new);
    public static final RegistryObject<Item> m = REGISTRY.register("m", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.m::new);
    public static final RegistryObject<Item> n = REGISTRY.register("n", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.n::new);
    public static final RegistryObject<Item> o = REGISTRY.register("o", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.o::new);
    public static final RegistryObject<Item> p = REGISTRY.register("p", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.p::new);
    public static final RegistryObject<Item> q = REGISTRY.register("q", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.q::new);
    public static final RegistryObject<Item> r = REGISTRY.register("r", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.r::new);
    public static final RegistryObject<Item> s = REGISTRY.register("s", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.s::new);
    public static final RegistryObject<Item> t = REGISTRY.register("t", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.t::new);
    public static final RegistryObject<Item> u = REGISTRY.register("u", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.u::new);
    public static final RegistryObject<Item> v = REGISTRY.register("v", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.v::new);
    public static final RegistryObject<Item> w = REGISTRY.register("w", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.w::new);
    public static final RegistryObject<Item> x = REGISTRY.register("x", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.x::new);
    public static final RegistryObject<Item> y = REGISTRY.register("y", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.y::new);
    public static final RegistryObject<Item> z = REGISTRY.register("z", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.z::new);
    public static final RegistryObject<Item> Uppercase_A = REGISTRY.register("uppercase_a", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_A::new);
    public static final RegistryObject<Item> Uppercase_B = REGISTRY.register("uppercase_b", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_B::new);
    public static final RegistryObject<Item> Uppercase_C = REGISTRY.register("uppercase_c", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_C::new);
    public static final RegistryObject<Item> Uppercase_D = REGISTRY.register("uppercase_d", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_D::new);
    public static final RegistryObject<Item> Uppercase_E = REGISTRY.register("uppercase_e", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_E::new);
    public static final RegistryObject<Item> Uppercase_F = REGISTRY.register("uppercase_f", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_F::new);
    public static final RegistryObject<Item> Uppercase_G = REGISTRY.register("uppercase_g", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_G::new);
    public static final RegistryObject<Item> Uppercase_H = REGISTRY.register("uppercase_h", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_H::new);
    public static final RegistryObject<Item> Uppercase_I = REGISTRY.register("uppercase_i", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_I::new);
    public static final RegistryObject<Item> Uppercase_J = REGISTRY.register("uppercase_j", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_J::new);
    public static final RegistryObject<Item> Uppercase_K = REGISTRY.register("uppercase_k", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_K::new);
    public static final RegistryObject<Item> Uppercase_L = REGISTRY.register("uppercase_l", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_L::new);
    public static final RegistryObject<Item> Uppercase_M = REGISTRY.register("uppercase_m", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_M::new);
    public static final RegistryObject<Item> Uppercase_N = REGISTRY.register("uppercase_n", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_N::new);
    public static final RegistryObject<Item> Uppercase_O = REGISTRY.register("uppercase_o", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_O::new);
    public static final RegistryObject<Item> Uppercase_P = REGISTRY.register("uppercase_p", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_P::new);
    public static final RegistryObject<Item> Uppercase_Q = REGISTRY.register("uppercase_q", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_Q::new);
    public static final RegistryObject<Item> Uppercase_R = REGISTRY.register("uppercase_r", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_R::new);
    public static final RegistryObject<Item> Uppercase_S = REGISTRY.register("uppercase_s", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_S::new);
    public static final RegistryObject<Item> Uppercase_T = REGISTRY.register("uppercase_t", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_T::new);
    public static final RegistryObject<Item> Uppercase_U = REGISTRY.register("uppercase_u", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_U::new);
    public static final RegistryObject<Item> Uppercase_V = REGISTRY.register("uppercase_v", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_V::new);
    public static final RegistryObject<Item> Uppercase_W = REGISTRY.register("uppercase_w", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_W::new);
    public static final RegistryObject<Item> Uppercase_X = REGISTRY.register("uppercase_x", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_X::new);
    public static final RegistryObject<Item> Uppercase_Y = REGISTRY.register("uppercase_y", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_Y::new);
    public static final RegistryObject<Item> Uppercase_Z = REGISTRY.register("uppercase_z", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Uppercase.Uppercase_Z::new);
    public static final RegistryObject<Item> Fe = REGISTRY.register("fe", github.com.gengyoubo.Minecraft_Science.Items.chemical.periodic_table.Fe::new);
}