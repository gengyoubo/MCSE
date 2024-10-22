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
        registerItem(event, new Lowercase_a(), "lowercase_a");
        registerItem(event, new Lowercase_b(), "lowercase_b");
        registerItem(event, new Lowercase_c(), "lowercase_c");
        registerItem(event, new Lowercase_d(), "lowercase_d");
        registerItem(event, new Lowercase_e(), "lowercase_e");
        registerItem(event, new Lowercase_f(), "lowercase_f");
        registerItem(event, new Lowercase_g(), "lowercase_g");
        registerItem(event, new Lowercase_h(), "lowercase_h");
        registerItem(event, new Lowercase_i(), "lowercase_i");
        registerItem(event, new Lowercase_j(), "lowercase_j");
        registerItem(event, new Lowercase_k(), "lowercase_k");
        registerItem(event, new Lowercase_l(), "lowercase_l");
        registerItem(event, new Lowercase_m(), "lowercase_m");
        registerItem(event, new Lowercase_n(), "lowercase_n");
        registerItem(event, new Lowercase_o(), "lowercase_o");
        registerItem(event, new Lowercase_p(), "lowercase_p");
        registerItem(event, new Lowercase_q(), "lowercase_q");
        registerItem(event, new Lowercase_r(), "lowercase_r");
        registerItem(event, new Lowercase_s(), "lowercase_s");
        registerItem(event, new Lowercase_t(), "lowercase_t");
        registerItem(event, new Lowercase_u(), "lowercase_u");
        registerItem(event, new Lowercase_v(), "lowercase_v");
        registerItem(event, new Lowercase_w(), "lowercase_w");
        registerItem(event, new Lowercase_x(), "lowercase_x");
        registerItem(event, new Lowercase_y(), "lowercase_y");
        registerItem(event, new Lowercase_z(), "lowercase_z");
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
    public static final RegistryObject<Item> Lowercase_a = REGISTRY.register("lowercase_a", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_a::new);
    public static final RegistryObject<Item> Lowercase_b = REGISTRY.register("lowercase_b", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_b::new);
    public static final RegistryObject<Item> Lowercase_c = REGISTRY.register("lowercase_c", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_c::new);
    public static final RegistryObject<Item> Lowercase_d = REGISTRY.register("lowercase_d", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_d::new);
    public static final RegistryObject<Item> Lowercase_e = REGISTRY.register("lowercase_e", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_e::new);
    public static final RegistryObject<Item> Lowercase_f = REGISTRY.register("lowercase_f", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_f::new);
    public static final RegistryObject<Item> Lowercase_g = REGISTRY.register("lowercase_g", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_g::new);
    public static final RegistryObject<Item> Lowercase_h = REGISTRY.register("lowercase_h", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_h::new);
    public static final RegistryObject<Item> Lowercase_i = REGISTRY.register("lowercase_i", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_i::new);
    public static final RegistryObject<Item> Lowercase_j = REGISTRY.register("lowercase_j", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_j::new);
    public static final RegistryObject<Item> Lowercase_k = REGISTRY.register("lowercase_k", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_k::new);
    public static final RegistryObject<Item> Lowercase_l = REGISTRY.register("lowercase_l", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_l::new);
    public static final RegistryObject<Item> Lowercase_m = REGISTRY.register("lowercase_m", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_m::new);
    public static final RegistryObject<Item> Lowercase_n = REGISTRY.register("lowercase_n", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_n::new);
    public static final RegistryObject<Item> Lowercase_o = REGISTRY.register("lowercase_o", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_o::new);
    public static final RegistryObject<Item> Lowercase_p = REGISTRY.register("lowercase_p", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_p::new);
    public static final RegistryObject<Item> Lowercase_q = REGISTRY.register("lowercase_q", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_q::new);
    public static final RegistryObject<Item> Lowercase_r = REGISTRY.register("lowercase_r", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_r::new);
    public static final RegistryObject<Item> Lowercase_s = REGISTRY.register("lowercase_s", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_s::new);
    public static final RegistryObject<Item> Lowercase_t = REGISTRY.register("lowercase_t", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_t::new);
    public static final RegistryObject<Item> Lowercase_u = REGISTRY.register("lowercase_u", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_u::new);
    public static final RegistryObject<Item> Lowercase_v = REGISTRY.register("lowercase_v", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_v::new);
    public static final RegistryObject<Item> Lowercase_w = REGISTRY.register("lowercase_w", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_w::new);
    public static final RegistryObject<Item> Lowercase_x = REGISTRY.register("lowercase_x", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_x::new);
    public static final RegistryObject<Item> Lowercase_y = REGISTRY.register("lowercase_y", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_y::new);
    public static final RegistryObject<Item> Lowercase_z = REGISTRY.register("lowercase_z", github.com.gengyoubo.Minecraft_Science.Items.Alphabet.Lowercase.Lowercase_z::new);
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