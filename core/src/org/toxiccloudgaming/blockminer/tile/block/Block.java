package org.toxiccloudgaming.blockminer.tile.block;

import com.badlogic.gdx.graphics.g2d.Sprite;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.world.Chunk;

//Blocks are the foreground of Tiles in a Chunk.
public class Block extends Tile {

    //Default Block State.
    public static final int STATE_NONE = 0;

    //Create Block in World.
    private Block(Chunk blockChunk, int x, int y, int blockID, int blockState) {
        super(blockChunk, x, y, blockID, blockState);
    }

    //Create a new Block with state.
    public Block(int blockID, int blockState) {
        this(null, -1, -1, blockID, blockState);
        this.initTexture();
    }

    //Create a new Block.
    public Block(int blockID) {
        this(blockID, STATE_NONE);
    }

    //Copy Block from Blocks registry.
    public static void setBlockAt(Chunk blockChunk, int x, int y, int blockID) {
        setBlockAt(blockChunk, x, y, blockID, STATE_NONE);
    }

    //Copy Block from Blocks registry, with state.
    public static void setBlockAt(Chunk blockChunk, int x, int y, int blockID, int blockState) {
        if(x >= 0 && x < Chunk.CHUNK_WIDTH && y >= 0 && y < Chunk.CHUNK_HEIGHT) {
            blockChunk.setBlock(x, y, new Block(blockChunk, x, y, blockID, blockState));
        }
    }

    //Get Block's Bounds.
    public void getBounds() {
        //TODO setup Bounds
    }

    //Get Block's identity string (Used to get block type).
    public String blockString() {
        return Blocks.getBlockString(this.blockID);
    }

    //Get a Blocks's ID.
    @Override
    public int blockID() {
        return this.blockID;
    }

    //Get the Block's unique Texture.
    protected Sprite getTexture() {
        return this.blockTexture;
    }
}
