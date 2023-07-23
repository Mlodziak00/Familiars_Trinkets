package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.LightBlueJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.LightGrayJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightBlueJellyfishFamiliarModel extends AnimatedGeoModel<LightBlueJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(LightBlueJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightBlueJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/lightbluejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(LightBlueJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}