package net.lightglow.eldmythfam;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.lightglow.eldmythfam.items.FamiliarItems;
import net.lightglow.eldmythfam.items.client.clock.ClockFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.clock.HorologiumFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.eye.ConduitEyeFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.eye.SuspiciousEyeFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.fish.CyanFishFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.fish.PurpleFishFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.fish.RedFishFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.jellyfish.*;
import net.lightglow.eldmythfam.items.client.lantern.FiendLanternFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.lantern.LitLanternFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.mimic.DarkMimicFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.mimic.IceMimicFamiliarRenderer;
import net.lightglow.eldmythfam.items.client.mimic.MimicFamiliarRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class EldritchMythicFamiliarsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoItemRenderer.registerItemRenderer(FamiliarItems.SUSPICIOUS_EYE_FAMILIAR, new SuspiciousEyeFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.CONDUIT_EYE_FAMILIAR, new ConduitEyeFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.MIMIC_FAMILIAR, new MimicFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.DARK_MIMIC_FAMILIAR, new DarkMimicFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.ICE_MIMIC_FAMILIAR, new IceMimicFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.BLUE_JELLYFISH_FAMILIAR, new BlueJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.GREEN_JELLYFISH_FAMILIAR, new GreenJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.YELLOW_JELLYFISH_FAMILIAR, new YellowJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.RED_JELLYFISH_FAMILIAR, new RedJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.ORANGE_JELLYFISH_FAMILIAR, new OrangeJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.PINK_JELLYFISH_FAMILIAR, new PinkJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.PURPLE_JELLYFISH_FAMILIAR, new PurpleJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.MAGENTA_JELLYFISH_FAMILIAR, new MagentaJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.LIGHTGRAY_JELLYFISH_FAMILIAR, new LightGrayJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.LIGHTBLUE_JELLYFISH_FAMILIAR, new LightBlueJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.CYAN_JELLYFISH_FAMILIAR, new CyanJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.GRAY_JELLYFISH_FAMILIAR, new GrayJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.WHITE_JELLYFISH_FAMILIAR, new WhiteJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.BLACK_JELLYFISH_FAMILIAR, new BlackJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.BROWN_JELLYFISH_FAMILIAR, new BrownJellyfishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.LIT_LANTERN, new LitLanternFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.FIEND_LANTERN, new FiendLanternFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.RED_FISH_FAMILIAR, new RedFishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.CYAN_FISH_FAMILIAR, new CyanFishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.PURPLE_FISH_FAMILIAR, new PurpleFishFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.CLOCK_FAMILIAR, new ClockFamiliarRenderer());
        GeoItemRenderer.registerItemRenderer(FamiliarItems.HOROLOGIUM_FAMILIAR, new HorologiumFamiliarRenderer());


        TrinketRendererRegistry.registerRenderer(FamiliarItems.CONDUIT_EYE_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.5F, 0.5F, 0.5F);
                        matrices.translate(1.0F, -0.85F, 0.0F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.SUSPICIOUS_EYE_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.5F, 0.5F, 0.5F);
                        matrices.translate(1.0F, -0.85F, 0.0F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.MIMIC_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.0F, -0.4F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.DARK_MIMIC_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.0F, -0.4F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.ICE_MIMIC_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.0F, -0.4F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.BLUE_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.GREEN_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.YELLOW_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.RED_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.ORANGE_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.PINK_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.PURPLE_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.MAGENTA_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.LIGHTGRAY_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.LIGHTBLUE_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.CYAN_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.GRAY_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.WHITE_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.BLACK_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.BROWN_JELLYFISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.LIT_LANTERN,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.FIEND_LANTERN,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.65F, 0.65F, 0.65F);
                        matrices.translate(0.85F, 0.2F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.RED_FISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.75F, 0.75F, 0.75F);
                        matrices.translate(0.85F, 0.15F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.CYAN_FISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.75F, 0.75F, 0.75F);
                        matrices.translate(0.85F, 0.15F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.PURPLE_FISH_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.75F, 0.75F, 0.75F);
                        matrices.translate(0.85F, 0.15F, 0.5F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.CLOCK_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.75F, 0.75F, 0.75F);
                        matrices.translate(0.7F, -0.25F, 0.6F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
        TrinketRendererRegistry.registerRenderer(FamiliarItems.HOROLOGIUM_FAMILIAR,
                (stack, slotReference, contextModel, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch) -> {
                    if (entity instanceof AbstractClientPlayerEntity player) {
                        TrinketRenderer.translateToFace(matrices,
                                (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, player, headYaw, headPitch);
                        matrices.scale(0.75F, 0.75F, 0.75F);
                        matrices.translate(0.7F, -0.25F, 0.6F);
                        MinecraftClient.getInstance().getItemRenderer()
                                .renderItem(stack, ModelTransformation.Mode.HEAD, light, OverlayTexture.DEFAULT_UV, matrices,
                                        vertexConsumers, 0);
                    }
                });
    }
}
