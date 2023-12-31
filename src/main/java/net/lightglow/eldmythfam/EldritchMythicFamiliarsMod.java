package net.lightglow.eldmythfam;

import net.fabricmc.api.ModInitializer;

import net.lightglow.eldmythfam.items.FamiliarItems;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class EldritchMythicFamiliarsMod implements ModInitializer {
	public static final String MOD_ID = "eldmythfam";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		FamiliarItems.registerFamiliarItems();


	}

	public static void headFamiliarTrinket(MatrixStack matrices, EntityModel<? extends LivingEntity> model,
									   LivingEntity entity, float headYaw, float headPitch) {

		if (entity.isInSwimmingPose() || entity.isFallFlying()) {
			if(model instanceof PlayerEntityModel)
			{
				PlayerEntityModel<AbstractClientPlayerEntity> ctx = (PlayerEntityModel<AbstractClientPlayerEntity>) model;
				matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(ctx.head.roll));
			}
			matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(headYaw));
			matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-45.0F));
		} else {

			if (entity.isInSneakingPose() && !model.riding) {
				matrices.translate(0.0F, 0.25F, 0.0F);
			}
			matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(headYaw));
			matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(headPitch));
		}
		matrices.translate(0.0F, -0.25F, -0.3F);
	}
}