package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.DarkMimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DarkMimicFamiliarModel extends AnimatedGeoModel<DarkMimicFamiliar> {

    @Override
    public Identifier getModelResource(DarkMimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkMimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/darkmimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(DarkMimicFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}