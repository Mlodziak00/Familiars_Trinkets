package net.lightglow.eldmythfam.items.client.eye;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.SuspiciousEyeFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SuspiciousEyeFamiliarModel extends AnimatedGeoModel<SuspiciousEyeFamiliar> {
    @Override
    public Identifier getModelResource(SuspiciousEyeFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/eyefamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(SuspiciousEyeFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/suspiciouseyefamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(SuspiciousEyeFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/eyefamiliaritem.animation.json");
    }
}
