package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.IceMimicFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceMimicFamiliarModel extends AnimatedGeoModel<IceMimicFamiliar> {

    @Override
    public Identifier getModelResource(IceMimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/mimicfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(IceMimicFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/icemimicfamiliar.png");
    }

    @Override
    public Identifier getAnimationResource(IceMimicFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/mimicfamiliaritem.animation.json");
    }
}