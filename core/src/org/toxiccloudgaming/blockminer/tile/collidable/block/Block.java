package org.toxiccloudgaming.blockminer.tile.collidable.block;

import org.toxiccloudgaming.blockminer.registry.Registry;
import org.toxiccloudgaming.blockminer.tile.Tile;

//Blocks are solid Collidables that cannot be passed through.
@Registry("blockminer.tile.collidable.block")
public class Block extends BlockBase {

    public Block(int id) {
        super(id);
    }

    public Block(Tile tile, Block block) {
        super(tile, block);
    }

    @Override
    public void initTexture() {

    }

    @Override
    public void update() {

    }
}
