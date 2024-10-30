package github.com.gengyoubo.Minecraft_Science.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import github.com.gengyoubo.Minecraft_Science.Minecraft_Science;
import github.com.gengyoubo.Minecraft_Science.network.ButtonMessageD;
import github.com.gengyoubo.Minecraft_Science.world.inventory.DualChemicalReactionTableMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class DualChemicalReactionTableScreen extends AbstractContainerScreen<DualChemicalReactionTableMenu> {
    private final static HashMap<String, Object> guistate = DualChemicalReactionTableMenu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    ImageButton imagebutton_img_202410266582_25x16;

    public DualChemicalReactionTableScreen(DualChemicalReactionTableMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 200;
        this.imageHeight = 166;
    }

    private static final ResourceLocation texture = new ResourceLocation("mcse:textures/screens/doble.png");

    @Override
    public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(ms);
        super.render(ms, mouseX, mouseY, partialTicks);
        this.renderTooltip(ms, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, texture);
        this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

        RenderSystem.setShaderTexture(0, new ResourceLocation("mcse:textures/screens/img_202410294298_20x21.png"));
        this.blit(ms, this.leftPos + 36, this.topPos + 41, 0, 0, 20, 21, 20, 21);

        RenderSystem.setShaderTexture(0, new ResourceLocation("mcse:textures/screens/img_202410294298_20x21.png"));
        this.blit(ms, this.leftPos + 138, this.topPos + 42, 0, 0, 20, 21, 20, 21);

        RenderSystem.disableBlend();
    }

    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(key, b, c);
    }

    @Override
    public void containerTick() {
        super.containerTick();
    }

    @Override
    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
        this.font.draw(poseStack, new TranslatableComponent("gui.test.double.label_text2"), 81, 9, -12829636);
    }

    @Override
    public void onClose() {
        super.onClose();
        Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
    }

    @Override
    public void init() {
        super.init();
        this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
        imagebutton_img_202410266582_25x16 = new ImageButton(this.leftPos + 85, this.topPos + 44, 25, 16, 0, 0, 16, new ResourceLocation("mcse:textures/screens/atlas/imagebutton_img_202410266582_25x16.png"), 25, 32, e -> {
            if (true) {
                Minecraft_Science.PACKET_HANDLER.sendToServer(new ButtonMessageD(0, x, y, z));
                ButtonMessageD.handleButtonAction(entity, 0, x, y, z);
            }
        });
        guistate.put("button:imagebutton_img_202410266582_25x16", imagebutton_img_202410266582_25x16);
        this.addRenderableWidget(imagebutton_img_202410266582_25x16);
    }

}
