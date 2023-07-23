package net.lightglow.eldmythfam.items.client.fish;

import net.lightglow.eldmythfam.items.familiars.CyanFishFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CyanFishFamiliarRenderer extends GeoItemRenderer<CyanFishFamiliar> {
    public CyanFishFamiliarRenderer() {
        super(new CyanFishFamiliarModel());
    }
}
