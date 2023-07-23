package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.items.client.eye.ConduitEyeFamiliarModel;
import net.lightglow.eldmythfam.items.familiars.ConduitEyeFamiliar;
import net.lightglow.eldmythfam.items.familiars.RedFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RedFishFamiliarRenderer extends GeoItemRenderer<RedFishFamiliar> {
    public RedFishFamiliarRenderer() {
        super(new RedFishFamiliarModel());
    }
}
