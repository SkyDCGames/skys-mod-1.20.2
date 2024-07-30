package net.skydcgames.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skydcgames.tutorialmod.SkysMod;
import net.minecraft.item.ItemGroup;

public class ModItemGroups {
    public static final ItemGroup CAT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SkysMod.MOD_ID, "cat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cat"))
                    .icon(() -> new ItemStack(ModItem.CAT)).entries((displayContext, entries) -> {
                        entries.add(ModItem.CAT);
                    }).build());

    public static void registerItemGroups(){



        SkysMod.LOGGER.info("Registering Item Groups for " + SkysMod.MOD_ID);
    }
}
