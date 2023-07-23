package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.CyanFishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CyanFishFamiliarModel extends AnimatedGeoModel<CyanFishFamiliar> {
    @Override
    public Identifier getModelResource(CyanFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/fishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(CyanFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/cyanfishfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(CyanFishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/fishfamiliaritem.animation.json");
    }
}