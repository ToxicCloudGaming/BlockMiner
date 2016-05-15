package org.toxiccloudgaming.blockminer.tile;

//All layer types of TileComponents.
public enum TileLayer {

    //Frames are necessary to hold Functional components in place.
    FRAME,

    //Functional components have no collision. They include Wires, Pipes, etc.
    FUNCTIONAL,

    //Walls have no collision. They are used as background and cover for Functional components.
    WALL,

    //Collidables have collision depending on type. They are the foreground component.
    COLLIDABLE
}
