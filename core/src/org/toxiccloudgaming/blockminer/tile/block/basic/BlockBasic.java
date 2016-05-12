package org.toxiccloudgaming.blockminer.tile.block.basic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import org.toxiccloudgaming.blockminer.tile.block.Block;

//A Block that is purely aesthetic.
public abstract class BlockBasic extends Block {

    //Array of randomized textures for BlockBasic.
    protected Sprite[] blockTextures;

    public BlockBasic(int blockID) {
        super(blockID);
    }

    //Set blockTexure images with starting coordinates and Texture sheet.
    protected abstract void setBlockTextures(Texture textureSheet, int beginX, int beginY);

    @Override
    public void update() {
        if(this.blockTextures != null) {

        }
    }
}
