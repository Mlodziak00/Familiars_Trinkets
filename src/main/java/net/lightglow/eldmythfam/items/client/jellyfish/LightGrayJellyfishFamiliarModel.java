package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.LightGrayJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.YellowJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightGrayJellyfishFamiliarModel extends AnimatedGeoModel<LightGrayJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(LightGrayJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightGrayJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/lightgrayjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(LightGrayJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}