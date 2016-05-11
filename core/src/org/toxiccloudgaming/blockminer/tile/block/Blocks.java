package org.toxiccloudgaming.blockminer.tile.block;

import org.toxiccloudgaming.blockminer.resource.TextureManager;

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

        addBlock(BLOCK_AIR,         "AIR",          new Block());
        addBlock(BLOCK_DIRT,        "DIRT",         new org.toxiccloudgaming.blockminer.tile.block.basic.BlockBasic());
        addBlock(BLOCK_STONE,       "STONE",        new org.toxiccloudgaming.blockminer.tile.block.basic.BlockBasic());
    }

    //Used to add a new Block to the game.
    protected void addBlock(int blockID, String blockString, Block block) {
        blocks[blockID] = block;
        strings.put(blockID, blockString);
    }

    //Get Block identity string. If UNKNOWN is returned, Block was never added.
    public static String getBlockString(int blockID) {
        return "BLOCK." + strings.get(blockID);
    }

    //Get a Block's ID number.
    public static int getBlockID(Block block) {
        if(block.isEmpty()) return BLOCK_AIR;
        for(int i = 0; i < MAX_BLOCKS; i++) {
            if(blocks[i].getClass().equals(block.getClass())) {
                return i;
            }
        }

        return -1;
    }
}