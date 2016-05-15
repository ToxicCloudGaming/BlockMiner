package org.toxiccloudgaming.blockminer.asset;

//Manager for all Texture Assets.
public class TextureManager {

    //Global TextureManager object.
    private static TextureManager globalTextureManager;

    //Texture base directories.
    public static final String DIR_TILE = Asset.BASE_TEXTURE + "tile/";
    public static final String DIR_ENTITY = Asset.BASE_TEXTURE + "entity/";

    //Sets the global TextureManager.
    public static void setTextureManager(TextureManager textureManager) {
        globalTextureManager = textureManager;
    }

    //Gets the global TextureManager.
    public static TextureManager getTextureManager() {
        return globalTextureManager;
    }

    //Initialize Texture lists.
    protected void loadTextures() {
        AssetManager assetManager = AssetManager.getAssetManager();

    }
}
