package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.PurpleJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.RedJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PurpleJellyfishFamiliarModel extends AnimatedGeoModel<PurpleJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(PurpleJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(PurpleJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/purplejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(PurpleJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}