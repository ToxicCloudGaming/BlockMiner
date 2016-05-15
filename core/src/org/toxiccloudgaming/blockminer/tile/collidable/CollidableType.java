package org.toxiccloudgaming.blockminer.tile.collidable;

//Types of Collidable TileComponents.
public enum CollidableType {

    //Blocks has full collision and cannot be passed through.
    BLOCK,

    //Decor are wall adornments with no collision boundaries.
    DECOR,

    //Furniture has partial collision depending on the direction of collision.
    FURNITURE,

    //Fluids have partial collision and can be passed through, but also affect movement.
    FLUID,
}
