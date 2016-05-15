package org.toxiccloudgaming.blockminer.tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.toxiccloudgaming.blockminer.world.Chunk;

//Tiles are a section of chunk which includes several layers.
public class Tile {

    //Tile position variables. X and Y are the position in parent chunk.
    protected Chunk chunk;
    protected int x;
    protected int y;

    //Container for all the layers of a Tile.
    protected TileComponent[] tileLayers;

    public Tile(Chunk chunk, int x, int y) {
        this.tileLayers = new TileComponent[TileComponent.TILE_LAYERS];
        this.chunk = chunk;
        this.x = x;
        this.y = y;
    }

    //Update a Tile's components.
    public void update() {
        for(int layer = 0; layer < TileComponent.TILE_LAYERS; layer++) {
            TileComponent component = tileLayers[layer];
            component.update();
        }
    }

    //Render a Tile's components.
    public void render(SpriteBatch batch) {
        for(int layer = 0; layer < TileComponent.TILE_LAYERS; layer++) {
            TileComponent component = tileLayers[layer];
            if(component != null) { //TODO TEMPORARY REMOVE WHEN FIXED.
                if (!component.isEmpty()) {
                    component.render(batch);
                }
            }
        }
    }

    //Set TileComponent in layer.
    public void setTileComponent(TileComponent component, TileLayer layer) {
        this.tileLayers[TileComponentRegistry.parseLayer(layer)] = component;
    }
}
