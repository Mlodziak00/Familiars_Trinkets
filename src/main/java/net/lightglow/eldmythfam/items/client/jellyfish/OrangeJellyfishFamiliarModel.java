package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.OrangeJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeJellyfishFamiliarModel extends AnimatedGeoModel<OrangeJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(OrangeJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(OrangeJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/orangejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(OrangeJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}