package org.toxiccloudgaming.blockminer.tile.block.basic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import org.toxiccloudgaming.blockminer.resource.TextureManager;
import org.toxiccloudgaming.blockminer.tile.block.Blocks;

//Soil is a basic ground Block.
public class BlockSoil extends BlockBasic {

    //Number of possible Block textures to pick from.
    private final static int RANDOMIZED_TEXTURES = 4;

    //Initialize Textures for BlockSoil.
    @Override
    protected void initTexture() {
        Texture textureSheet = TextureManager.getTextureManager().blockTexture(Blocks.TEXTURE_BLOCK_SOIL);
        this.blockTextures = new Sprite[RANDOMIZED_TEXTURES];

        switch(this.blockID()) {
            case Blocks.BLOCK_DIRT:
                this.setBlockTextures(textureSheet, 112, 0);
                break;
            case Blocks.BLOCK_STONE:
                this.setBlockTextures(textureSheet, 112, 32);
                break;
            default:
                break;
        }
        //TODO setup Block-specific textures for all blocks. (Then do the same for Walls).
    }

    //Set BlockSoil randomized textures.
    @Override
    protected void setBlockTextures(Texture textureSheet, int beginX, int beginY) {
        this.blockTextures[0] = new Sprite(textureSheet, beginX, beginY, PIXEL_WIDTH, PIXEL_HEIGHT);
        this.blockTextures[1] = new Sprite(textureSheet, beginX + PIXEL_WIDTH, beginY, PIXEL_WIDTH, PIXEL_HEIGHT);
        this.blockTextures[2] = new Sprite(textureSheet, beginX, beginY + PIXEL_HEIGHT, PIXEL_WIDTH, PIXEL_HEIGHT);
        this.blockTextures[3] = new Sprite(textureSheet, beginX + PIXEL_WIDTH, beginY + PIXEL_HEIGHT, PIXEL_WIDTH, PIXEL_HEIGHT);
    }
}
