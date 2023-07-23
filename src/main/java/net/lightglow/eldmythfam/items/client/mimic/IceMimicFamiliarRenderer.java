package net.lightglow.eldmythfam.items.client.mimic;

import net.lightglow.eldmythfam.items.familiars.IceMimicFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class IceMimicFamiliarRenderer extends GeoItemRenderer<IceMimicFamiliar> {
    public IceMimicFamiliarRenderer() {
        super(new IceMimicFamiliarModel());
    }
}
