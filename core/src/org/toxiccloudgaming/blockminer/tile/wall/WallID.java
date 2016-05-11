package org.toxiccloudgaming.blockminer.tile.wall;

//ID numbers for Walls.
public interface WallID {

    //Keep all Wall IDs Unique! Must be less than MAX_WALLS.
    int WALL_UNKNOWN = -1;

    int WALL_AIR = 0;
    int WALL_DIRT = 1;
    int WALL_STONE = 2;
}
