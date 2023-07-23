package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.GrayJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.LightGrayJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GrayJellyfishFamiliarModel extends AnimatedGeoModel<GrayJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(GrayJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(GrayJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/grayjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(GrayJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}