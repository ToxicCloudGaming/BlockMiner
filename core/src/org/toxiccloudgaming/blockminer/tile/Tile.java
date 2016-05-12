package org.toxiccloudgaming.blockminer.tile;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.toxiccloudgaming.blockminer.language.LanguageEntry;
import org.toxiccloudgaming.blockminer.tile.block.Blocks;
import org.toxiccloudgaming.blockminer.world.Chunk;

//Tiles include Blocks/Walls contained in a Chunk.
public abstract class Tile extends LanguageEntry {

    //Width and height of Tile in pixels.
    public static final int PIXEL_WIDTH = 16;
    public static final int PIXEL_HEIGHT = 16;

    //Tile position variables. X and Y are the position relative to the chunk.
    protected Chunk chunk;
    protected int x;
    protected int y;

    //Tile's id and state.
    protected int tileID;
    protected int tileState;

    //If a Tile is empty, it is considered 'air'.
    protected boolean isEmpty = false;

    //If a Tile's neighbor changed state, update it.
    protected boolean neighborStateChange = false;

    //Tile's texture.
    protected Sprite texture;

    protected Tile(Chunk chunk, int x, int y, int tileID, int tileState) {
        this.chunk = chunk;
        this.x = x;
        this.y = y;
        this.tileID = tileID;
        if(tileID == Blocks.BLOCK_AIR) this.isEmpty = true;
        this.neighborStateChange = true;
        this.update();
    }

    //Register a LanguageEntry for this Tile.
    protected void registerTile(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.registerEntry();
    }

    //When a new Tile is registered, this method is called.
    protected abstract void initTexture();

    //Get the Chunk a Tile is contained in.
    public Chunk getChunk() {
        return this.chunk;
    }

    //Get Tile's x position in Chunk.
    public int getChunkX() {
        return this.x;
    }

    //Get Tile's y position in Chunk.
    public int getChunkY() {
        return this.y;
    }

    //Get Tile's x position in World.
    public int getWorldX() {
        return this.chunk.getWorldX() + this.x;
    }

    //Get Block's x position in World.
    public int getWorldY() {
        return this.chunk.getWorldY() + this.y;
    }

    //Checks if Tile is empty.
    public boolean isEmpty() {
        return this.isEmpty;
    }

    //Get Tile's ID.
    public abstract int tileID();

    //Update a Tile. Occurs once per tick.
    public abstract void update();

    //If neighbor Tile was updated, this method is called. Used for changing a Tile's texture, etc.
    protected abstract void onNeighborStateChange();

    //When a Tile is set in the world, this method is called.
    protected abstract void onTileCreate();

    //Render the Tile.
    public void render(SpriteBatch batch) {
        if(!this.isEmpty) {
            if(this.texture != null) {
                batch.draw(this.texture, this.x, this.y);
            }
        }
    }
}
