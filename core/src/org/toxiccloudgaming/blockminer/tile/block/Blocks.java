package org.toxiccloudgaming.blockminer.tile.block;

import org.toxiccloudgaming.blockminer.resource.TextureManager;
import org.toxiccloudgaming.blockminer.tile.block.basic.BlockSoil;

import java.util.HashMap;
import java.util.Map;

//Static context for all Block objects.
public class Blocks implements BlockID {

    /*
     *
     *  TO ADD A NEW BLOCK:
     *      1)Create a unique ID in BlockID.
     *      3)Add to initBlocks method.
     *      3)Extend necessary Block class.
     *
     */

    //Max number of Block types game may have. ID must be lower than MAX_BLOCKS.
    public static final int MAX_BLOCKS = 256;

    //Lists of all Blocks and strings.
    private static Block[] blocks;
    private static Map<Integer, String> strings;

    public Blocks(TextureManager textureManager) {
        this.initBlockTextures();
        this.initBlocks();
    }

    //Setup textures for all Blocks.
    protected void initBlockTextures() {
        TextureManager textureManager = TextureManager.getTextureManager();

        textureManager.loadBlockTexture(TEXTURE_BLOCK_SOIL, "blocks_soil");
    }

    //Blocks contains an array of all game Blocks, et as initial states.
    protected void initBlocks() {
        blocks = new Block[MAX_BLOCKS];
        strings = new HashMap<Integer, String>();
        strings.put(BLOCK_UNKNOWN, "UNKNOWN");

        registerBlock(new Block(BLOCK_AIR), "air");
        registerBlock(new BlockSoil(BLOCK_DIRT), "dirt");
        registerBlock(new BlockSoil(BLOCK_STONE), "stone");
    }

    //Add a new Block to the game.
    protected void registerBlock(Block block, String unlocalizedName) {
        this.registerTile(unlocalizedName);
        int blockID = block.tileID();
        blocks[blockID] = block;
        block.setUnlocalizedName(unlocalizedName);
        strings.put(blockID, unlocalizedName);
    }
}