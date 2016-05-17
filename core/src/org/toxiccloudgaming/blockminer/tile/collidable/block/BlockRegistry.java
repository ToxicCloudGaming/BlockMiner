package org.toxiccloudgaming.blockminer.tile.collidable.block;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import org.toxiccloudgaming.blockminer.asset.TextureManager;
import org.toxiccloudgaming.blockminer.tile.Tile;
import org.toxiccloudgaming.blockminer.tile.TileComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Static registry for all Block objects.
public abstract class BlockRegistry implements BlockID {

    //Max number of Block types game contains; increases as more Blocks added. ID must be lower than MAX_BLOCKS.
    public static final int MAX_BLOCKS = 16;

    //Base unlocalized name for Blocks.
    private static String unlocalizedBase;

    //Lists of all Blocks and their unlocalized names.
    private static Block[] blocks;
    private static Map<Integer, String> names;

    //Array with all Texture images.
    private static List<Texture> textures;
    public static final int TEXTURE_BLOCK = 0;

    //Class with list of all TextureRegions.
    private static TextureLibrary textureLibrary;

    //Initialize all Blocks.
    public static void init() {
        textureLibrary = new TextureLibrary(MAX_BLOCKS);
        textures = new ArrayList<Texture>();
        blocks = new Block[MAX_BLOCKS];
        names = new HashMap<Integer, String>();

        registerTexture(TEXTURE_BLOCK, "blocks.png");

        registerBlock(new Block(BLOCK_AIR), "air");
        registerBlock(new Block(BLOCK_DIRT), "dirt");
        registerBlock(new Block(BLOCK_STONE), "stone");
    }

    //Register a Block.
    protected static void registerBlock(Block block, String unlocalizedName) {
        int blockID = block.getID();
        blocks[blockID] = block;
        names.put(blockID, unlocalizedBase + unlocalizedName);
    }

    //Register a Texture for Blocks.
    protected static void registerTexture(int textureID, String fileName) {
        Texture texture = TextureManager.getTextureManager().loadTexture(TextureManager.DIR_BLOCK + fileName);
        textures.add(textureID, texture);
    }

    //Copy a Block from registry.
    public static Block copy(Tile tile, int blockID) {
        return new Block(tile, blocks[blockID]);
    }

    //Set a new TextureRegion.
    public static void initTexture(int blockID, int textureID) {
        int x = 0;
        int y = 2 * TileComponent.PIXEL_WIDTH * blockID;
        int width = TileComponent.PIXEL_WIDTH * 4;
        int height = TileComponent.PIXEL_HEIGHT * 2;
        textureLibrary.initTexture(blockID, textures.get(textureID), x, y, width, height);
    }

    //Get a TextureRegion.
    public static TextureRegion getTexture(int blockID) {
        return textureLibrary.getTexture(blockID);
    }

    //Get the TextureLibrary.
    public static TextureLibrary getTextureLibrary() {
        return textureLibrary;
    }
}
