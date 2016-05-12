package org.toxiccloudgaming.blockminer.resource;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
import java.util.List;

//Manager for all Texture Assets.
public class TextureManager {

    //Global TextureManager object.
    private static TextureManager globalTextureManager;

    //Texture directories.
    public static final String DIR_TILE = Asset.DIR_TEXTURE + "tile/";
    public static final String DIR_ENTITY = Asset.DIR_TEXTURE + "entity/";

    //Tile-texture directories.
    public static final String DIR_BLOCK = DIR_TILE + "block/";
    public static final String DIR_WALL = DIR_TILE + "wall/";

    //Entity-texture directories.
    public static final String DIR_ITEM = DIR_ENTITY + "item/";

    private List<Texture> blockTextures;
    private List<Texture> wallTextures;

    //Parent manager.
    private AssetManager assetManager;

    public TextureManager() {
        this.assetManager = assetManager;
        this.initTextures();
    }

    //Sets the global TextureManager.
    public static void setTextureManager(TextureManager textureManager) {
        globalTextureManager = textureManager;
    }

    //Gets the global TextureManager.
    public static TextureManager getTextureManager() {
        return globalTextureManager;
    }

    //Get parent manager.
    public AssetManager getAssetManager() {
        return this.assetManager;
    }

    //Initialize Texture lists.
    protected void initTextures() {
        this.blockTextures = new ArrayList<Texture>();
        this.wallTextures = new ArrayList<Texture>();
    }

    //Load Block textures (Defaults to png).
    public void loadBlockTexture(int textureID, String img) {
        this.blockTextures.add(textureID, Asset.loadTexture(DIR_BLOCK + img + Asset.IMG_SUFF_PNG));
    }

    //Load Block textures.
    public void loadBlockTexture(int textureID, String img, Asset.FileType fileType) {
        this.blockTextures.add(textureID, Asset.loadTexture(DIR_BLOCK + Asset.parseType(fileType)));
    }

    //Load wall textures (Defaults to png).
    public void loadWallTexture(int textureID, String img) {
        this.wallTextures.add(textureID, Asset.loadTexture(DIR_WALL + img + Asset.IMG_SUFF_PNG));
    }

    //Load Wall textures.
    public void loadWallTexture(int textureID, String img, Asset.FileType fileType) {
        this.wallTextures.add(Asset.loadTexture(DIR_WALL + Asset.parseType(fileType)));
    }

    //Get Block Texture from manager.
    public Texture blockTexture(int textureID) {
        return this.blockTextures.get(textureID);
    }

    //Get Wall Texture from manager.
    public Texture wallTexture(int textureID) {
        return this.wallTextures.get(textureID);
    }
}
