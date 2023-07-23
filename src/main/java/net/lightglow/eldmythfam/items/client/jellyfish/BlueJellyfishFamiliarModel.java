package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.BlueJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueJellyfishFamiliarModel extends AnimatedGeoModel<BlueJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(BlueJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlueJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/bluejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(BlueJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}