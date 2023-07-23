package net.lightglow.eldmythfam.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.lightglow.eldmythfam.items.familiars.*;
import net.lightglow.eldmythfam.items.functions.EyeOfFamiliarityItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FamiliarItems {


    public static final Item EYE_OF_FAMILIARITY = registerItem("eye_of_familiarity",
            new EyeOfFamiliarityItem(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item SUSPICIOUS_EYE_FAMILIAR = registerItem("suspiciouseyefamiliaritem",
            new SuspiciousEyeFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item CONDUIT_EYE_FAMILIAR = registerItem("conduiteyefamiliaritem",
            new ConduitEyeFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item MIMIC_FAMILIAR = registerItem("mimicfamiliaritem",
            new MimicFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item DARK_MIMIC_FAMILIAR = registerItem("darkmimicfamiliaritem",
            new DarkMimicFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item ICE_MIMIC_FAMILIAR = registerItem("icemimicfamiliaritem",
            new IceMimicFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item BLUE_JELLYFISH_FAMILIAR = registerItem("bluejellyfishfamiliaritem",
            new BlueJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item GREEN_JELLYFISH_FAMILIAR = registerItem("greenjellyfishfamiliaritem",
            new GreenJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item YELLOW_JELLYFISH_FAMILIAR = registerItem("yellowjellyfishfamiliaritem",
            new YellowJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item RED_JELLYFISH_FAMILIAR = registerItem("redjellyfishfamiliaritem",
            new RedJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item ORANGE_JELLYFISH_FAMILIAR = registerItem("orangejellyfishfamiliaritem",
            new OrangeJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item PINK_JELLYFISH_FAMILIAR = registerItem("pinkjellyfishfamiliaritem",
            new PinkJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item PURPLE_JELLYFISH_FAMILIAR = registerItem("purplejellyfishfamiliaritem",
            new PurpleJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item MAGENTA_JELLYFISH_FAMILIAR = registerItem("magentajellyfishfamiliaritem",
            new MagentaJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item LIGHTGRAY_JELLYFISH_FAMILIAR = registerItem("lightgrayjellyfishfamiliaritem",
            new LightGrayJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item LIGHTBLUE_JELLYFISH_FAMILIAR = registerItem("lightbluejellyfishfamiliaritem",
            new LightBlueJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item CYAN_JELLYFISH_FAMILIAR = registerItem("cyanjellyfishfamiliaritem",
            new CyanJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item GRAY_JELLYFISH_FAMILIAR = registerItem("grayjellyfishfamiliaritem",
            new GrayJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item WHITE_JELLYFISH_FAMILIAR = registerItem("whitejellyfishfamiliaritem",
            new WhiteJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item BLACK_JELLYFISH_FAMILIAR = registerItem("blackjellyfishfamiliaritem",
            new BlackJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item BROWN_JELLYFISH_FAMILIAR = registerItem("brownjellyfishfamiliaritem",
            new BrownJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item LIT_LANTERN = registerItem("litlanternfamiliaritem",
            new LitLanternFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item FIEND_LANTERN = registerItem("fiendlanternfamiliaritem",
            new FiendLanternFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item RED_FISH_FAMILIAR = registerItem("redfishfamiliaritem",
            new RedFishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item CYAN_FISH_FAMILIAR = registerItem("cyanfishfamiliaritem",
            new CyanFishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item PURPLE_FISH_FAMILIAR = registerItem("purplefishfamiliaritem",
            new PurpleFishFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item CLOCK_FAMILIAR = registerItem("clockfamiliaritem",
            new ClockFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));

    public static final Item HOROLOGIUM_FAMILIAR = registerItem("horologiumfamiliaritem",
            new HorologiumFamiliar(new FabricItemSettings().maxCount(1).group(FamiliarItemGroup.FAMILIARS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EldritchMythicFamiliarsMod.MOD_ID, name), item);
    }

    public static void registerFamiliarItems() {
        EldritchMythicFamiliarsMod.LOGGER.debug("Registering Familiar Items for " + EldritchMythicFamiliarsMod.MOD_ID);
    }
}
