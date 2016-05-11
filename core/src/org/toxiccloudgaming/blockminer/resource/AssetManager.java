package org.toxiccloudgaming.blockminer.resource;

//Manages all Assets for BlockMiner.
public class AssetManager {

    //Parent manager.
    private ResourceManager resourceManager;

    //Asset manager for Textures.
    private TextureManager textureManager;

    public AssetManager(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
        this.textureManager = new TextureManager(this);
    }

    //Get parent manager.
    public ResourceManager getManager() {
        return this.resourceManager;
    }

    //Get TextureManager.
    public TextureManager getTextureManager() {
        return this.textureManager;
    }
}
