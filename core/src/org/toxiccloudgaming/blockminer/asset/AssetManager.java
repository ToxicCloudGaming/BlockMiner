package org.toxiccloudgaming.blockminer.asset;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import org.toxiccloudgaming.blockminer.registry.Localizable;

//Manages all Assets for BlockMiner.
public class AssetManager {

    //Global AssetManager object.
    private static AssetManager globalAssetManager;

    //Sets the global AssetManager.
    public static void setAssetManager(AssetManager assetManager) {
        globalAssetManager = assetManager;
    }

    //Gets the global AssetManager.
    public static AssetManager getAssetManager() {
        return globalAssetManager;
    }

    //Parse type for different files.
    public static String parseType(AssetType assetType) {
        switch(assetType) {
            case TYPE_IMG_PNG:
                return Asset.IMG_SUFF_PNG;
            case TYPE_IMG_JPG:
                return Asset.IMG_SUFF_JPG;
            case TYPE_IMG_BMP:
                return Asset.IMG_SUFF_BMP;
            case TYPE_TEXT_TXT:
                return Asset.TEXT_SUFF_TXT;
            case TYPE_TEXT_BIN:
                return Asset.TEXT_SUFF_BIN;
            case TYPE_LANG:
                return Localizable.LANG_SUFF;
            default:
                return null;
        }
    }

    //Asset method for loading a texture.
    public Texture loadTexture(String file) {
        return new Texture(Gdx.files.internal(file));
    }
}
