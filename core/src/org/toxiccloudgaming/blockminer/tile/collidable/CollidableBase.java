package org.toxiccloudgaming.blockminer.tile.collidable;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.TileComponentBase;
import org.toxiccloudgaming.blockminer.tile.TileLayer;

//Base class for Collidable TileComponents.
public abstract class CollidableBase extends TileComponentBase {

    //The type of Collidable TileComponent.
    protected CollidableType collidableType;

    public CollidableBase(int id) {
        super(id);
    }

    public CollidableBase(Tile tile, CollidableBase collidableBase) {
        super(tile, collidableBase);
    }

    //Set Collidable type.
    public abstract void setCollidableType();

    @Override
    public TileLayer getLayerType() {
        return TileLayer.COLLIDABLE;
    }
}
