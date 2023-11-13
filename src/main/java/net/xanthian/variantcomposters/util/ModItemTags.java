package net.xanthian.variantcomposters.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;

public class ModItemTags {

    public static final TagKey<Item> COMPOSTERS = register();

    private ModItemTags() {
    }

    private static TagKey<Item> register() {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Initialise.MOD_ID, "composters"));
    }
}