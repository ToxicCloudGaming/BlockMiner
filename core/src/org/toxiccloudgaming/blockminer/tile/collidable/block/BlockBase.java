package org.toxiccloudgaming.blockminer.tile.collidable.block;

import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.collidable.CollidableBase;
import org.toxiccloudgaming.blockminer.tile.collidable.CollidableType;

//Base class for Block Collidables.
public abstract class BlockBase extends CollidableBase {

    public BlockBase(int id) {
        super(id);
    }

    public BlockBase(Tile tile, BlockBase blockBase) {
        super(tile, blockBase);
    }

    @Override
    public void setCollidableType() {
        this.collidableType = CollidableType.BLOCK;
    }
}
