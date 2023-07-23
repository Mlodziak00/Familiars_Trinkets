package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.items.familiars.PurpleFishFamiliar;
import net.lightglow.eldmythfam.items.familiars.RedFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PurpleFishFamiliarRenderer extends GeoItemRenderer<PurpleFishFamiliar> {
    public PurpleFishFamiliarRenderer() {
        super(new PurpleFishFamiliarModel());
    }
}
