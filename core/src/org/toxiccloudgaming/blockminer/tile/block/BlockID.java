package org.toxiccloudgaming.blockminer.tile.block;

//ID numbers for Blocks and Textures.
public interface BlockID {

    //Block Texture IDs
    int TEXTURE_BLOCK_SOIL = 0;

    //Keep all Block IDs Unique! Must be less than MAX_BLOCKS.
    int BLOCK_UNKNOWN = -1;

    int BLOCK_AIR = 0;
    int BLOCK_DIRT = 1;
    int BLOCK_STONE = 2;
}
