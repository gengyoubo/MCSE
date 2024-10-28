package github.com.gengyoubo.Minecraft_Science.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import github.com.gengyoubo.Minecraft_Science.Minecraft_Science;
import github.com.gengyoubo.Minecraft_Science.network.MCSEButtonMessage;
import github.com.gengyoubo.Minecraft_Science.world.inventory.SingleChemistryReactionDeskMenu;
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

public class SingleChemistryReactionDeskScreen extends AbstractContainerScreen<SingleChemistryReactionDeskMenu> {
    private final static HashMap<String, Object> guistate = SingleChemistryReactionDeskMenu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    ImageButton imagebutton_img_202410266582_25x16;

    public SingleChemistryReactionDeskScreen(SingleChemistryReactionDeskMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 190;
        this.imageHeight = 166;
    }

    private static final ResourceLocation texture =
            new ResourceLocation("mcse:textures/screens/arrow.png");

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
        this.font.draw(poseStack,
                new TranslatableComponent("gui.mcse.label_text"), 70, 5, -12829636);
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
        imagebutton_img_202410266582_25x16 = new ImageButton(this.leftPos + 78,
                this.topPos + 36, 25, 16, 0, 0, 16,
                new ResourceLocation("mcse:textures/screens/atlas/imagebutton_img_202410266582_25x16.png"), 25, 32, e -> {
            try {
                Minecraft_Science.PACKET_HANDLER.sendToServer(new MCSEButtonMessage(0, x, y, z));
            }catch (IllegalArgumentException e1){
                System.out.println("这是");
            }
            MCSEButtonMessage.handleButtonAction(entity, 0, x, y, z);
        });
        guistate.put("button:imagebutton_img_202410266582_25x16", imagebutton_img_202410266582_25x16);
        this.addRenderableWidget(imagebutton_img_202410266582_25x16);
    }
}
