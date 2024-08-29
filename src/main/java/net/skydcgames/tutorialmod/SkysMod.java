package net.skydcgames.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.skydcgames.tutorialmod.block.ModBlocks;
import net.skydcgames.tutorialmod.item.ModItem;
import net.skydcgames.tutorialmod.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkysMod implements ModInitializer {
	public static final String MOD_ID = "skys-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItem.registerModItems();
        ModBlocks.registerModBlocks();
	}
}