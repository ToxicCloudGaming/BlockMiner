package org.toxiccloudgaming.blockminer.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

//A World is a container for Chunks.
public class World {

    //TODO WORLD CHUNK SIZES
    public static int WORLD_HORIZ_CHUNKS = 64;
    public static int WORLD_VERT_CHUNKS = 64;

    //2D Array of Chunks in the World.
    private Chunk[][] chunks;

    //List of Chunks to render. //TODO add loadedChunks to Player class.
    private List<Chunk> loadedChunks;

    //World's origin position.
    int originX;
    int originY;

    public World() {
        this.chunks = new Chunk[WORLD_VERT_CHUNKS][WORLD_HORIZ_CHUNKS];
        this.originX = 0;
        this.originY = 0;
        this.chunks[originY][originX] = new Chunk();
        this.loadedChunks = new ArrayList<Chunk>();
        this.loadedChunks.add(this.chunks[originY][originX]);
    }

    //Render World's loaded Chunks.
    public void render(SpriteBatch batch) {
        for(Chunk chunk : this.loadedChunks) {
            chunk.render(batch);
        }
    }
}
