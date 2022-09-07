package net.mystery2099.glass_pane_connectables_mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistryInit;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GlassPaneConnectablesMod implements ModInitializer {
    public static final TagKey<Block> GLASS_PANE_CONNECTABLES_TAG_KEY = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "glass_pane_connectables"));

    @Override
    public void onInitialize() {

    }
}
