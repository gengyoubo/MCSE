package github.com.gengyoubo.Minecraft_Science;

import net.minecraftforge.common.ForgeConfigSpec;

public class Minecraft_Science_Config {
    // 声明配置文件和配置项
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    public static ForgeConfigSpec.IntValue WordOreAmount;
    public static ForgeConfigSpec.IntValue WordOreHeightMax;
    public static ForgeConfigSpec.IntValue WordOreHeightMin;


    static {
        BUILDER.comment("Minecraft Science Config").push("Minecraft Science");

        // 定义配置项
        WordOreAmount = BUILDER.comment("Setting the number of generation")
                .defineInRange("Amount", 32, 0, 32);

        WordOreHeightMax = BUILDER.comment("Setting up mineral generation online")
                .defineInRange("HightMax", 128, -64, 128);

        WordOreHeightMin = BUILDER.comment("Setting up a mineral generation downline")
                .defineInRange("HightMin", 128, -64, 128);
        CONFIG = BUILDER.build();
    }
}
