package org.toxiccloudgaming.blockminer.tile.wall;

import com.badlogic.gdx.graphics.g2d.Sprite;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.world.Chunk;

//Walls are the background of Tiles in a Chunk.
public class Wall implements Tile {

    //Global position variables.
    protected Chunk wallChunk;
    protected int wallX;
    protected int wallY;

    //If a Wall is empty, it is considered 'air'.
    private boolean isEmpty;

    //Wall texture.
    protected Sprite texture;

    //Default Wall assumed to be air.
    public Wall() {
        this.isEmpty = true;
    }

    //Get Wall's x position in Chunk.
    @Override
    public int getChunkX() {
        return this.wallX;
    }

    //Get Wall's y position in Chunk.
    @Override
    public int getChunkY() {
        return this.wallY;
    }

    //Get Wall's x position in World.
    @Override
    public int getWorldX() {
        return this.wallChunk.getWorldX() + this.wallX;
    }

    //Get Wall's x position in World.
    @Override
    public int getWorldY() {
        return this.wallChunk.getWorldY() + this.wallY;
    }

    //Get Wall's identity string (Used to get Wall type).
    @Override
    public String toString() {
        return Walls.getWallString(this.wallID());
    }

    //Get a Tile's ID.
    @Override
    public int tileID() {
        return this.wallID();
    }

    //Get Wall's ID number.
    public int wallID() {
        return Walls.getWallID(this);
    }

    //Check if Wall is empty.
    @Override
    public boolean isEmpty() {
        return this.isEmpty;
    }

    //Update a Wall.
    public void update() {
        //TODO setup Wall update
    }

    //Render a Wall.
    public void render() {
        if(!this.isEmpty) {
            //TODO setup Wall render
            if(this.texture != null) {

            }
        }
    }
}
