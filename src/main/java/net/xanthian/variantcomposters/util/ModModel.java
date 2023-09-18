package net.xanthian.variantcomposters.util;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModel {

    public static final Model COMPOSTER;

    public static Identifier getBlockId(String id) {
        return new Identifier("variantcomposters", "block/" + id);
    }

    public static Model createModel(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(getBlockId(parent)), Optional.empty(), requiredTextures);
    }

    static {
        COMPOSTER = createModel("variantcomposter", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.INSIDE, TextureKey.PARTICLE);
    }
}