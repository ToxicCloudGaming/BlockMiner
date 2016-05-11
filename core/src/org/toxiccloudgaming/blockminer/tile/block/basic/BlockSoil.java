package org.toxiccloudgaming.blockminer.tile.block.basic;

import org.toxiccloudgaming.blockminer.resource.TextureManager;
import org.toxiccloudgaming.blockminer.tile.block.Blocks;

//Soil is a basic ground Block.
public class BlockSoil extends BlockBasic {

    @Override
    protected void initTexture() {
        this.textureSheet = TextureManager.getTextureManager().blockTexture(Blocks.TEXTURE_BLOCK_SOIL);

        //TODO setup Block-specific textures for all blocks. (Then do the same for Walls).
    }
}
