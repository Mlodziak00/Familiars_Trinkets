package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.items.familiars.MimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MimicFamiliarRenderer extends GeoItemRenderer<MimicFamiliar> {
    public MimicFamiliarRenderer() {
        super(new MimicFamiliarModel());
    }
}
