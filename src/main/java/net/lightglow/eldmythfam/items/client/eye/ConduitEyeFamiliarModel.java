package net.lightglow.eldmythfam.items.client.eye;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.ConduitEyeFamiliar;
import net.lightglow.eldmythfam.items.familiars.SuspiciousEyeFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConduitEyeFamiliarModel extends AnimatedGeoModel<ConduitEyeFamiliar> {
    @Override
    public Identifier getModelResource(ConduitEyeFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/eyefamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(ConduitEyeFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/conduiteyefamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(ConduitEyeFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/eyefamiliaritem.animation.json");
    }
}
