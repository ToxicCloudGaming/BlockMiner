package org.toxiccloudgaming.blockminer.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.TileLayer;
import org.toxiccloudgaming.blockminer.tile.collidable.block.BlockRegistry;

//Chunks are a group of x by y Tiles.
public class Chunk {

    //All Chunks have equal width and height.
    public static final int CHUNK_WIDTH = 64;
    public static final int CHUNK_HEIGHT = 64;

    //Global position variables.
    private World world;
    private int chunkX;
    private int chunkY;

    //2D Arrays of the Tiles in a Chunk.
    private Tile[][] tiles;

    public Chunk() {
        this.tiles = new Tile[CHUNK_HEIGHT][CHUNK_WIDTH];

        this.clearChunk();
        //TODO setup Chunk Generation
    }

    //Clear the Chunk before Generation.
    private void clearChunk() {
        for(int y = 0; y < CHUNK_HEIGHT; y++) {
            for(int x = 0; x < CHUNK_WIDTH; x++) {
                this.clearTileAt(x, y);
            }
        }
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
    public void render(SpriteBatch batch) {
        for(int x = 0; x < CHUNK_WIDTH; x++) {
            for(int y = 0; y < CHUNK_HEIGHT; y++) {
                this.tiles[y][x].render(batch);
                //TODO render chunk.
            }
        }
    }

    //Get Tile at position in Chunk.
    public Tile getTileAt(int x, int y) {
        return this.tiles[y][x];
    }

    //Set all TileComponents in Tile to empty.
    public void clearTileAt(int x, int y) {
        this.tiles[y][x] = new Tile(this, x, y);
        //this.setFrameAt();
        this.setBlockAt(BlockRegistry.BLOCK_DIRT, this.tiles[y][x]);
    }

    //Set Frame at position in Chunk.
    public void setFrameAt(int frameID, Tile tile) {
        //TODO setFrameAt
    }

    //Set Block at position in Chunk.
    public void setBlockAt(int blockID, Tile tile) {
        tile.setTileComponent(BlockRegistry.copy(tile, blockID), TileLayer.COLLIDABLE);
    }
}
