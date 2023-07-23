package net.lightglow.eldmythfam.items.client.jellyfish;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.GrayJellyfishFamiliar;
import net.lightglow.eldmythfam.items.familiars.WhiteJellyfishFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WhiteJellyfishFamiliarModel extends AnimatedGeoModel<WhiteJellyfishFamiliar> {

    @Override
    public Identifier getModelResource(WhiteJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/jellyfishfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(WhiteJellyfishFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/whitejellyfishfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(WhiteJellyfishFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/jellyfishfamiliaritem.animation.json");
    }
}