package net.xanthian.variantcomposters;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.SharedConstants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.blocks.Composters;
import net.xanthian.variantcomposters.util.ModPOITypes;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "variantcomposters";

	public static Identifier ID(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup VARIANT_COMPOSTERS = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "variant_composters"),
			() -> new ItemStack(Items.COMPOSTER));
	public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();

	@Override
	public void onInitialize() {

			woodTypes.add(Pair.of("acacia", new String[0]));
			woodTypes.add(Pair.of("birch", new String[0]));
			woodTypes.add(Pair.of("dark_oak", new String[0]));
			woodTypes.add(Pair.of("jungle", new String[0]));
			woodTypes.add(Pair.of("oak", new String[0]));
			Composters.addVanillaComposters();

		if (SharedConstants.getGameVersion().getName().startsWith("1.19")) {
			woodTypes.add(Pair.of("mangrove", new String[0]));
			Composters.addVanilla119Composter();
		}
		if (!FabricLoader.getInstance().isModLoaded("betternether")) {
			woodTypes.add(Pair.of("crimson", new String[0]));
			woodTypes.add(Pair.of("warped", new String[0]));
			Composters.addNetherComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
			Composters.addTechRebornComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("arclight")) {
			woodTypes.add(Pair.of("jade", new String[]{"arclight"}));
			woodTypes.add(Pair.of("moon", new String[]{"arclight"}));
			woodTypes.add(Pair.of("shadow", new String[]{"arclight"}));
			Composters.addEpicPaladinsComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("simplemango")) {
			woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
			Composters.addSimpleMangoComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			woodTypes.add(Pair.of("fir", new String[]{"traverse"}));
			Composters.addTraverseComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("terrestria")) {
			woodTypes.add(Pair.of("cypress", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("hemlock", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("japanese_maple", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("rainbow_eucalyptus", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("redwood", new String[]{"terrestria"}));
			//woodTypes.add(Pair.of("rubber", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("sakura", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("willow", new String[]{"terrestria"}));
			woodTypes.add(Pair.of("yucca_palm", new String[]{"terrestria"}));
			Composters.addTerrestriaComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
			woodTypes.add(Pair.of("scorched", new String[]{"cinderscapes"}));
			woodTypes.add(Pair.of("umbral", new String[]{"cinderscapes"}));
			Composters.addCinderscapesComposters();
		}
		if (FabricLoader.getInstance().isModLoaded("colorful-azaleas")) {
			woodTypes.add(Pair.of("azule_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("bright_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("fiss_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("roze_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("tecal_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("titanium_azalea", new String[]{"colorful-azaleas"}));
			woodTypes.add(Pair.of("walnut_azalea", new String[]{"colorful-azaleas"}));
			Composters.addColorfulAzaleasComposters();
		}

		ModPOITypes.init();
	}
}