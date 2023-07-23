package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.RedFishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedFishFamiliarModel extends AnimatedGeoModel<RedFishFamiliar> {
    @Override
    public Identifier getModelResource(RedFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/fishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(RedFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/redfishfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(RedFishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/fishfamiliaritem.animation.json");
    }
}