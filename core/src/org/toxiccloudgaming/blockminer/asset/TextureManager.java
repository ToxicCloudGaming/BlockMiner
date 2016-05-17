package org.toxiccloudgaming.blockminer.asset;

import com.badlogic.gdx.graphics.Texture;

//Manager for all Texture Assets.
public class TextureManager {

    //Global TextureManager object.
    private static TextureManager globalTextureManager;

    //Texture base directories.
    public static final String DIR_TILE = Asset.BASE_TEXTURE + "tile/";
    public static final String DIR_ENTITY = Asset.BASE_TEXTURE + "entity/";

    public static final String DIR_BLOCK = DIR_TILE + "block/";

    //Sets the global TextureManager.
    public static void setTextureManager(TextureManager textureManager) {
        globalTextureManager = textureManager;
    }

    //Gets the global TextureManager.
    public static TextureManager getTextureManager() {
        return globalTextureManager;
    }

    //Load Texture file.
    public Texture loadTexture(String path) {
        return AssetManager.getAssetManager().loadTexture(path);
    }
}
