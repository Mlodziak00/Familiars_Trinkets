package net.lightglow.eldmythfam.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lightglow.eldmythfam.EldritchMythicFamiliarsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FamiliarItemGroup {
    public static final ItemGroup FAMILIARS = FabricItemGroupBuilder.build(new Identifier(EldritchMythicFamiliarsMod.MOD_ID, "familiars"),
            () -> new ItemStack(FamiliarItems.EYE_OF_FAMILIARITY));

}
