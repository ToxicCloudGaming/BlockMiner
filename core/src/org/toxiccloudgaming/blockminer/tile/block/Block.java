package org.toxiccloudgaming.blockminer.tile.block;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.world.Chunk;

//Blocks are the foreground of Tiles in a Chunk.
public class Block implements Tile {

    //Global position variables.
    protected Chunk blockChunk;
    protected int blockX;
    protected int blockY;

    //If a Block is empty, it is considered 'air'.
    private boolean isEmpty;

    //Shared Texture for Blocks.
    protected Texture textureSheet;

    //Block texture.
    protected Sprite texture;

    //Default Block assumed to be air.
    public Block() {
        this.isEmpty = true;
        this.initTexture();
    }

    //Create Block in World.
    public Block(int x, int y) {
        this.blockX = x;
        this.blockY = y;
        this.isEmpty = true;
    }

    //Override this class for Textures.
    protected void initTexture() {};

    //Get Block's x position in Chunk.
    @Override
    public int getChunkX() {
        return this.blockX;
    }

    //Get Block's y position in Chunk.
    @Override
    public int getChunkY() {
        return this.blockY;
    }

    //Get Block's x position in World.
    @Override
    public int getWorldX() {
        return this.blockChunk.getWorldX() + this.blockX;
    }

    //Get Block's x position in World.
    @Override
    public int getWorldY() {
        return this.blockChunk.getWorldY() + this.blockY;
    }

    //Checks if Block is empty.
    @Override
    public boolean isEmpty() {
        return this.isEmpty;
    }

    //Get Block's Bounds.
    public void getBounds() {
        //TODO setup Bounds
    }

    //Get Block's identity string (Used to get block type).
    @Override
    public String toString() {
        return Blocks.getBlockString(this.blockID());
    }

    //Get a Tile's ID.
    @Override
    public int tileID() {
        return this.blockID();
    }

    //Get Block's ID number.
    public int blockID() {
        return Blocks.getBlockID(this);
    }

    //Update a Block.
    public void update() {
        //TODO setup Block update
    }

    //Get the Block's unique Texture.
    protected Sprite getTexture() {
        return this.texture;
    }

    //Render a Block.
    public void render() {
        if(!this.isEmpty) {
            //TODO setup Block render
            if(this.texture != null) {

            }
        }
    }
}
