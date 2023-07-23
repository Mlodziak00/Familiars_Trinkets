package net.lightglow.eldmythfam.items.client.lantern;

import net.lightglow.eldmythfam.items.familiars.FiendLanternFamiliar;
import net.lightglow.eldmythfam.items.familiars.LitLanternFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class FiendLanternFamiliarRenderer extends GeoItemRenderer<FiendLanternFamiliar> {
    public FiendLanternFamiliarRenderer() {
        super(new FiendLanternFamiliarModel());
    }
}