package org.toxiccloudgaming.blockminer.tile.frame;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.TileComponentBase;
import org.toxiccloudgaming.blockminer.tile.TileLayer;

//Base class for Frame TileComponents.
public abstract class FrameBase extends TileComponentBase {

    public FrameBase(Tile tile, FrameBase frameBase) {
        super(tile, frameBase);
    }

    @Override
    public TileLayer getLayerType() {
        return TileLayer.FRAME;
    }
}
