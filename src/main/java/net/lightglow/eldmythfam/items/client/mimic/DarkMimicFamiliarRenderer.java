package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.items.familiars.DarkMimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class DarkMimicFamiliarRenderer extends GeoItemRenderer<DarkMimicFamiliar> {
    public DarkMimicFamiliarRenderer() {
        super(new DarkMimicFamiliarModel());
    }
}
