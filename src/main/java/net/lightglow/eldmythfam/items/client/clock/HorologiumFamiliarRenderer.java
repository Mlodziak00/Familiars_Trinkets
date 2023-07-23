package net.lightglow.eldmythfam.items.client.clock;

import net.lightglow.eldmythfam.items.familiars.ClockFamiliar;
import net.lightglow.eldmythfam.items.familiars.HorologiumFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HorologiumFamiliarRenderer extends GeoItemRenderer<HorologiumFamiliar> {
    public HorologiumFamiliarRenderer() {
        super(new HorologiumFamiliarModel());
    }
}
