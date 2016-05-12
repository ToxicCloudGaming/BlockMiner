package org.toxiccloudgaming.blockminer.world;

import org.toxiccloudgaming.blockminer.tile.wall.Wall;
import org.toxiccloudgaming.blockminer.tile.block.Block;

//Chunks are a group of x by y Blocks/Walls.
public class Chunk {

    //All Chunks have equal width and height.
    public static final int CHUNK_WIDTH = 256;
    public static final int CHUNK_HEIGHT = 256;

    //Global position variables.
    private World world;
    private int chunkX;
    private int chunkY;

    //2D Arrays of the Blocks/Walls in a Chunk.
    private Block[][] blocks;
    private Wall[][] walls;

    public Chunk() {
        this.blocks = new Block[CHUNK_HEIGHT][CHUNK_WIDTH];
        this.walls = new Wall[CHUNK_HEIGHT][CHUNK_WIDTH];
    }

    //Get Chunk's x position in World.
    public int getWorldX() {
        return this.chunkX;
    }

    //Get Chunk's y position in World.
    public int getWorldY() {
        return this.chunkY;
    }

    //Render a Chunk.
    public void render() {
        for(int x = 0; x < CHUNK_WIDTH; x++) {
            for(int y = 0; y < CHUNK_HEIGHT; y++) {
                //this.walls[y][x].render();
                //this.blocks[y][x].render();
                //TODO render chunk.
            }
        }
    }

    //Set Block at Position in Chunk.
    public void setBlock(int x, int y, Block block) {
        this.blocks[x][y] = block;
    }
}
