package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.GreenJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GreenJellyfishFamiliarModel extends AnimatedGeoModel<GreenJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(GreenJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(GreenJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/greenjellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(GreenJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}