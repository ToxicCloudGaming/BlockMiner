package org.toxiccloudgaming.blockminer.tile.frame;

import org.toxiccloudgaming.blockminer.registry.Registry;
import org.toxiccloudgaming.blockminer.tile.Tile;

//Frames allow placement of Functional TileComponents.
@Registry("blockminer.tile.frame")
public class Frame extends FrameBase {

    public Frame(Tile tile, Frame frame) {
        super(tile, frame);
    }

    @Override
    public void initTexture() {

    }

    @Override
    public void update() {

    }
}
