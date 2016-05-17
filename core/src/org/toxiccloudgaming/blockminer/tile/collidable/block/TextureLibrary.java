package org.toxiccloudgaming.blockminer.tile.collidable.block;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

//Library for mapping static Textures.
public class TextureLibrary {

    //List of TextureRegions.
    private TextureRegion[] regions;

    public TextureLibrary(int maxTextures) {
        this.regions = new TextureRegion[maxTextures];
    }

    //Initialize a TextureRegion.
    public void initTexture(int textureID, Texture texture, int x, int y, int width, int height) {
        this.regions[textureID] = new TextureRegion(texture, x, y, width, height);
    }

    public TextureRegion getTexture(int textureID) {
        return this.regions[textureID];
    }
}
