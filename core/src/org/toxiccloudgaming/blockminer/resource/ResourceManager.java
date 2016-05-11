package org.toxiccloudgaming.blockminer.resource;

import org.toxiccloudgaming.blockminer.tile.block.Blocks;
import org.toxiccloudgaming.blockminer.tile.wall.Walls;

//Manages all resources in BlockMiner.
public class ResourceManager {

    //Various managers for the game.
    private AssetManager assetManager;

    //Initializes object libraries.
    Blocks blocks;
    Walls walls;

    public ResourceManager() {
        this.preInitialization();
    }

    //Initalize all game assets, then all objects.
    private void preInitialization() {
        this.assetManager = new AssetManager(this);

        this.blocks = new Blocks(this.assetManager.getTextureManager());
        this.walls = new Walls(this.assetManager.getTextureManager());
    }

    //Get AssetManager.
    public AssetManager getAssetManager() {
        return this.assetManager;
    }
}
