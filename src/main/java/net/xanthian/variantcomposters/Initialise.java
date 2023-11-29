package net.xanthian.variantcomposters;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;
import net.xanthian.variantcomposters.util.ModCreativeTab;
import net.xanthian.variantcomposters.util.ModPOITypes;
import net.xanthian.variantcomposters.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcomposters";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaComposters();

        ifModLoaded("ad_astra", AdAstra::registerComposters);

        ifModLoaded("beachparty", BeachParty::registerComposters);

        ifModLoaded("betterarcheology", BetterArcheology::registerComposters);

        ifModLoaded("bewitchment", Bewitchment::registerComposters);

        ifModLoaded("biomemakeover", BiomeMakeover::registerComposters);

        ifModLoaded("blockus", Blockus::registerComposters);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerComposters);

        ifModLoaded("eldritch_end", EldritchEnd::registerComposters);

        ifModLoaded("minecells", MineCells::registerComposters);

        ifModLoaded("natures_spirit", NaturesSpirit::registerComposters);

        ifModLoaded("promenade", Promenade::registerComposters);

        ifModLoaded("regions_unexplored", RegionsUnexplored::registerComposters);

        ifModLoaded("snifferplus", SnifferPlus::registerComposters);

        ifModLoaded("techreborn", TechReborn::registerComposters);

        ifModLoaded("vinery", Vinery::registerComposters);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
        ModPOITypes.init();

        // Datagen Block - disable for client run
        //SnifferPlus.registerComposters();

    }
}