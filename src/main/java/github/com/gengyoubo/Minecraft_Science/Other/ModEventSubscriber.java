package github.com.gengyoubo.Minecraft_Science.Other;

import github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.*;
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
        registerItem(event, new Capital_A(), "capital_a");
        registerItem(event, new Capital_B(), "capital_b");
        registerItem(event, new Capital_C(), "capital_c");
        registerItem(event, new Capital_D(), "capital_d");
        registerItem(event, new Capital_E(), "capital_e");
        registerItem(event, new Capital_F(), "capital_f");
        registerItem(event, new Capital_G(), "capital_g");
        registerItem(event, new Capital_H(), "capital_h");
        registerItem(event, new Capital_I(), "capital_i");
        registerItem(event, new Capital_J(), "capital_j");
        registerItem(event, new Capital_K(), "capital_k");
        registerItem(event, new Capital_L(), "capital_l");
        registerItem(event, new Capital_M(), "capital_m");
        registerItem(event, new Capital_N(), "capital_n");
        registerItem(event, new Capital_O(), "capital_o");
        registerItem(event, new Capital_P(), "capital_p");
        registerItem(event, new Capital_Q(), "capital_q");
        registerItem(event, new Capital_R(), "capital_r");
        registerItem(event, new Capital_S(), "capital_s");
        registerItem(event, new Capital_T(), "capital_t");
        registerItem(event, new Capital_U(), "capital_u");
        registerItem(event, new Capital_V(), "capital_v");
        registerItem(event, new Capital_W(), "capital_w");
        registerItem(event, new Capital_X(), "capital_x");
        registerItem(event, new Capital_Y(), "capital_y");
        registerItem(event, new Capital_Z(), "capital_z");
        // 以registerItem的格式注册物品↑
    }
    //一键注册物品的属性
    private static void registerItem(RegistryEvent.Register<Item> event, Item item, String name) {
        item.setRegistryName("mcse", name);
        event.getRegistry().register(item);
    }
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "mcse");
    //需要用模组物品的图标时，在这里解开双斜杠注释↓
    public static final RegistryObject<Item> a = REGISTRY.register("a", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.a::new);
    //public static final RegistryObject<Item> b = REGISTRY.register("b", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.b::new);
    //public static final RegistryObject<Item> c = REGISTRY.register("c", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.c::new);
    //public static final RegistryObject<Item> d = REGISTRY.register("d", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.d::new);
    //public static final RegistryObject<Item> e = REGISTRY.register("e", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.e::new);
    //public static final RegistryObject<Item> f = REGISTRY.register("f", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.f::new);
    //public static final RegistryObject<Item> g = REGISTRY.register("g", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.g::new);
    //public static final RegistryObject<Item> h = REGISTRY.register("h", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.h::new);
    //public static final RegistryObject<Item> i = REGISTRY.register("i", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.i::new);
    //public static final RegistryObject<Item> j = REGISTRY.register("j", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.j::new);
    //public static final RegistryObject<Item> k = REGISTRY.register("k", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.k::new);
    //public static final RegistryObject<Item> l = REGISTRY.register("l", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.l::new);
    //public static final RegistryObject<Item> m = REGISTRY.register("m", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.m::new);
    //public static final RegistryObject<Item> n = REGISTRY.register("n", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.n::new);
    //public static final RegistryObject<Item> o = REGISTRY.register("o", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.o::new);
    //public static final RegistryObject<Item> p = REGISTRY.register("p", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.p::new);
    //public static final RegistryObject<Item> q = REGISTRY.register("q", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.q::new);
    //public static final RegistryObject<Item> r = REGISTRY.register("r", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.r::new);
    //public static final RegistryObject<Item> s = REGISTRY.register("s", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.s::new);
    //public static final RegistryObject<Item> t = REGISTRY.register("t", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.t::new);
    //public static final RegistryObject<Item> u = REGISTRY.register("u", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.u::new);
    //public static final RegistryObject<Item> v = REGISTRY.register("v", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.v::new);
    //public static final RegistryObject<Item> w = REGISTRY.register("w", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.w::new);
    //public static final RegistryObject<Item> x = REGISTRY.register("x", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.x::new);
    //public static final RegistryObject<Item> y = REGISTRY.register("y", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.y::new);
    //public static final RegistryObject<Item> z = REGISTRY.register("z", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.z::new);
    //public static final RegistryObject<Item> Capital_A = REGISTRY.register("capital_a", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_A::new);
    //public static final RegistryObject<Item> Capital_B = REGISTRY.register("capital_b", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_B::new);
    //public static final RegistryObject<Item> Capital_C = REGISTRY.register("capital_c", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_C::new);
    //public static final RegistryObject<Item> Capital_D = REGISTRY.register("capital_d", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_D::new);
    //public static final RegistryObject<Item> Capital_E = REGISTRY.register("capital_e", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_E::new);
    //public static final RegistryObject<Item> Capital_F = REGISTRY.register("capital_f", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_F::new);
    //public static final RegistryObject<Item> Capital_G = REGISTRY.register("capital_g", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_G::new);
    //public static final RegistryObject<Item> Capital_H = REGISTRY.register("capital_h", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_H::new);
    //public static final RegistryObject<Item> Capital_I = REGISTRY.register("capital_i", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_I::new);
    //public static final RegistryObject<Item> Capital_J = REGISTRY.register("capital_j", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_J::new);
    //public static final RegistryObject<Item> Capital_K = REGISTRY.register("capital_k", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_K::new);
    //public static final RegistryObject<Item> Capital_L = REGISTRY.register("capital_l", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_L::new);
    //public static final RegistryObject<Item> Capital_M = REGISTRY.register("capital_m", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_M::new);
    //public static final RegistryObject<Item> Capital_N = REGISTRY.register("capital_n", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_N::new);
    //public static final RegistryObject<Item> Capital_O = REGISTRY.register("capital_o", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_O::new);
    //public static final RegistryObject<Item> Capital_P = REGISTRY.register("capital_p", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_P::new);
    //public static final RegistryObject<Item> Capital_Q = REGISTRY.register("capital_q", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_Q::new);
    //public static final RegistryObject<Item> Capital_R = REGISTRY.register("capital_r", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_R::new);
    //public static final RegistryObject<Item> Capital_S = REGISTRY.register("capital_s", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_S::new);
    //public static final RegistryObject<Item> Capital_T = REGISTRY.register("capital_t", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_T::new);
    //public static final RegistryObject<Item> Capital_U = REGISTRY.register("capital_u", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_U::new);
    //public static final RegistryObject<Item> Capital_V = REGISTRY.register("capital_v", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_V::new);
    //public static final RegistryObject<Item> Capital_W = REGISTRY.register("capital_w", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_W::new);
    //public static final RegistryObject<Item> Capital_X = REGISTRY.register("capital_x", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_X::new);
    //public static final RegistryObject<Item> Capital_Y = REGISTRY.register("capital_y", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_Y::new);
    //public static final RegistryObject<Item> Capital_Z = REGISTRY.register("capital_z", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Capital.Capital_Z::new);

}