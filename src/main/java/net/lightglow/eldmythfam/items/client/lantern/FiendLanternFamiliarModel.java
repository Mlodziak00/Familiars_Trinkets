package net.lightglow.eldmythfam.items.client.lantern;

import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.FiendLanternFamiliar;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FiendLanternFamiliarModel extends AnimatedGeoModel<FiendLanternFamiliar> {
    @Override
    public Identifier getModelResource(FiendLanternFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "geo/lanternfamiliaritem.geo.json");
    }

    @Override
    public Identifier getTextureResource(FiendLanternFamiliar object) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "textures/item/fiendlanternfamiliaritem.png");
    }

    @Override
    public Identifier getAnimationResource(FiendLanternFamiliar animatable) {
        return new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "animations/lanternfamiliaritem.animation.json");
    }
}

