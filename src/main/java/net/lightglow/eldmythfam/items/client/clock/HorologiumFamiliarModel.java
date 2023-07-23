package net.lightglow.eldmythfam.items.client.clock;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.ClockFamiliar;
import net.lightglow.eldmythfam.items.familiars.HorologiumFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HorologiumFamiliarModel extends AnimatedGeoModel<HorologiumFamiliar> {
    @Override
    public Identifier getModelResource(HorologiumFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/clockfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(HorologiumFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/horologiumfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(HorologiumFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/clockfamiliaritem.animation.json");
    }
}
