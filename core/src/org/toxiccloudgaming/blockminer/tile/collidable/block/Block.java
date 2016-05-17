package org.toxiccloudgaming.blockminer.tile.collidable.block;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import org.toxiccloudgaming.blockminer.registry.Registry;
import org.toxiccloudgaming.blockminer.tile.Tile;

//Blocks are solid Collidables that cannot be passed through.
@Registry("blockminer.tile.collidable.block")
public class Block extends BlockBase {

    public Block(int id) {
        super(id);
        BlockRegistry.initTexture(this.id, BlockRegistry.TEXTURE_BLOCK);
    }

    public Block(Tile tile, Block block) {
        super(tile, block);
    }

    @Override
    public void initTexture() {
        TextureRegion region = BlockRegistry.getTexture(this.id);
        this.texture = new Sprite(region, 32, 0, 16, 16);
    }

    @Override
    public void update() {

    }
}
