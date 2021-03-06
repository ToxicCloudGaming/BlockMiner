package org.toxiccloudgaming.blockminer.init;

import org.toxiccloudgaming.blockminer.asset.AssetManager;
import org.toxiccloudgaming.blockminer.asset.TextureManager;
import org.toxiccloudgaming.blockminer.render.RenderEngine;
import org.toxiccloudgaming.blockminer.tile.TileComponentRegistry;

//BlockMiner game initializations.
public class Startup {

    //BlockMiner Pre-Initialization
    public static void preInitialization() {
        AssetManager.setAssetManager(new AssetManager());
        TextureManager.setTextureManager(new TextureManager());
    }

    //BlockMiner Initializaion
    public static void initialization() {
        TileComponentRegistry.initTileComponents();
    }

    //BlockMiner Post-Initialization
    public static void postInitialization() {
        RenderEngine.setRenderEngine(new RenderEngine());
    }
}
