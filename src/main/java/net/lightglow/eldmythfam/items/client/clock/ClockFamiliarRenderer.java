package net.lightglow.eldmythfam.items.client.clock;

import net.lightglow.eldmythfam.items.client.eye.ConduitEyeFamiliarModel;
import net.lightglow.eldmythfam.items.familiars.ClockFamiliar;
import net.lightglow.eldmythfam.items.familiars.ConduitEyeFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ClockFamiliarRenderer extends GeoItemRenderer<ClockFamiliar> {
    public ClockFamiliarRenderer() {
        super(new ClockFamiliarModel());
    }
}
