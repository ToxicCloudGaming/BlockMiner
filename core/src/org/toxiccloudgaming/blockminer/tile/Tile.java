package org.toxiccloudgaming.blockminer.tile;

//Tiles are Blocks/Walls contained in a Chunk.
public interface Tile {

    //Width and height of Tile in pixels.
    int PIXEL_WIDTH = 16;
    int PIXEL_HEIGHT = 16;

    //Checks if Tile is empty.
    boolean isEmpty();

    //Gets a Tile's X/Y position in Chunk.
    abstract int getChunkX();
    abstract int getChunkY();

    //Gets a Tile's X/Y position in World.
    abstract int getWorldX();
    abstract int getWorldY();

    //Get a Tile's ID.
    int tileID();

    //Update a Tile.
    void update();

    //Render a Tile.
    void render();
}