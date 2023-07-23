package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.PurpleFishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PurpleFishFamiliarModel extends AnimatedGeoModel<PurpleFishFamiliar> {
    @Override
    public Identifier getModelResource(PurpleFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/fishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(PurpleFishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/purplefishfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(PurpleFishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/fishfamiliaritem.animation.json");
    }
}