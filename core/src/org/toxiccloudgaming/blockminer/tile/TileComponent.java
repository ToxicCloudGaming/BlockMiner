package org.toxiccloudgaming.blockminer.tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//TileComponents are layers of Tile.
public interface TileComponent {

    /*
     * TileComponents have a layer type and ID that can be used for identification,
     * and naming.
     */

    //The default number of layers in a Tile.
    int TILE_LAYERS = 4;

    //Check if TileComponent's layer is empty.
    boolean isEmpty();

    //Get the TileLayer type of the component.
    TileLayer getLayerType();

    //Get a TileComponent's ID.
    int getID();

    //Initialize a component's texture.
    void initTexture();

    //Update a TileComponent.
    void update();

    //Render a TileComponent.
    void render(SpriteBatch batch);
}
