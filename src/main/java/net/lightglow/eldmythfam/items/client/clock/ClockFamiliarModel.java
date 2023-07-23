package net.lightglow.eldmythfam.items.client.clock;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.ClockFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClockFamiliarModel extends AnimatedGeoModel<ClockFamiliar> {
    @Override
    public Identifier getModelResource(ClockFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/clockfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(ClockFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/clockfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(ClockFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/clockfamiliaritem.animation.json");
    }
}
