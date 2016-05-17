package org.toxiccloudgaming.blockminer.tile;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

//Base class for all TileComponents.
public abstract class TileComponentBase implements TileComponent {

    //Parent Tile.
    protected Tile tile;

    //TileComponent's ID.
    protected int id;

    //Texture to display for TileComponents.
    protected TextureRegion texture;

    //Constructor used only when registering a TileComponent.
    public TileComponentBase(int id) {
        this.id = id;
    }

    //Constructor used when setting TileComponent in world.
    public TileComponentBase(Tile tile, TileComponent tileComponent) {
        this.tile = tile;
        this.id = tileComponent.getID();
        this.initTexture();
    }

    //Base TileComponents are empty by default.
    @Override
    public boolean isEmpty() {
        return true;
    }

    //Render the texture for this component.
    @Override
    public void render(SpriteBatch batch) {
        System.out.println("HI");
        batch.draw(this.texture, this.tile.x, this.tile.y, PIXEL_WIDTH, PIXEL_HEIGHT);
    }

    @Override
    public int getID() {
        return this.id;
    }
}
