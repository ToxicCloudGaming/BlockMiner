package org.toxiccloudgaming.blockminer.tile;

import org.toxiccloudgaming.blockminer.tile.collidable.block.BlockRegistry;

//Static registry for all TileComponents.
public abstract class TileComponentRegistry {

    //Initialize all TileComponents.
    public static void initTileComponents() {
        BlockRegistry.init();
    }

    //Parse int for TileLayer.
    public static int parseLayer(TileLayer tileLayer) {
        switch(tileLayer) {
            case FRAME:
                return 0;
            case FUNCTIONAL:
                return 1;
            case WALL:
                return 2;
            case COLLIDABLE:
                return 3;
            default:
                return -1;
        }
    }
}
