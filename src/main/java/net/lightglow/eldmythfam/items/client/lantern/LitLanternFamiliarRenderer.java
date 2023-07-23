package net.lightglow.eldmythfam.items.client.lantern;

import net.lightglow.eldmythfam.items.client.eye.ConduitEyeFamiliarModel;
import net.lightglow.eldmythfam.items.familiars.ConduitEyeFamiliar;
import net.lightglow.eldmythfam.items.familiars.LitLanternFamiliar;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LitLanternFamiliarRenderer extends GeoItemRenderer<LitLanternFamiliar> {
    public LitLanternFamiliarRenderer() {
        super(new LitLanternFamiliarModel());
    }
}