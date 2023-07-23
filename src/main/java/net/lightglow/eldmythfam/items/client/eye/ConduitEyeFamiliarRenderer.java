package net.lightglow.eldmythfam.items.client.eye;

import net.lightglow.eldmythfam.items.familiars.ConduitEyeFamiliar;
import net.lightglow.eldmythfam.items.familiars.SuspiciousEyeFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ConduitEyeFamiliarRenderer extends GeoItemRenderer<ConduitEyeFamiliar> {
    public ConduitEyeFamiliarRenderer() {
        super(new ConduitEyeFamiliarModel());
    }
}
