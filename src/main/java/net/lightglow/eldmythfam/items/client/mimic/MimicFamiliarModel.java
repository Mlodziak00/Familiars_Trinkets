package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.MimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MimicFamiliarModel extends AnimatedGeoModel<MimicFamiliar> {

    @Override
    public Identifier getModelResource(MimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(MimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/mimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(MimicFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}