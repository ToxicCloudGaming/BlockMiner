package org.toxiccloudgaming.blockminer.tile.collidable.block;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.block.BlockID;

import java.util.HashMap;
import java.util.Map;

//Static registry for all Block objects.
public abstract class BlockRegistry implements BlockID {

    //Max number of Block types game contains; increases as more Blocks added. ID must be lower than MAX_BLOCKS.
    public static final int MAX_BLOCKS = 16;

    //Base unlocalized name for Blocks.
    private static String unlocalizedBase;

    //Lists of all Blocks and their unlocalized names.
    private static Block[] blocks;
    private static Map<Integer, String> names;

    //Initialize all Blocks.
    public static void init() {
        blocks = new Block[MAX_BLOCKS];
        names = new HashMap<Integer, String>();

        registerBlock(new Block(BLOCK_AIR), "air");
        registerBlock(new Block(BLOCK_DIRT), "dirt");
        registerBlock(new Block(BLOCK_STONE), "stone");
    }

    //Register a Block.
    protected static void registerBlock(Block block, String unlocalizedName) {
        int blockID = block.getID();
        blocks[blockID] = block;
        names.put(blockID, unlocalizedBase + unlocalizedName);
    }

    //Copy a Block from registry.
    public static Block copy(Tile tile, int blockID) {
        return new Block(tile, blocks[blockID]);
    }
}
