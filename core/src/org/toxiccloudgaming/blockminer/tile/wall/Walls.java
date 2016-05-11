package org.toxiccloudgaming.blockminer.tile.wall;

import org.toxiccloudgaming.blockminer.resource.TextureManager;

import java.util.HashMap;
import java.util.Map;

//Static context for all Wall objects.
public class Walls implements WallID {

    /*
     *
     *  TO ADD A NEW WALL:
     *      1)Create a unique ID in WallID.
     *      3)Add to initWalls method.
     *      3)Extend necessary Wall class.
     *
     */

    //Max number of Wall types game may have. ID must be lower than MAX_BLOCKS.
    public static final int MAX_WALLS = 256;

    //Lists of all Walls and strings.
    private static Wall[] walls;
    private static Map<Integer, String> strings;

    public Walls(TextureManager textureManager) {
        this.initWallTextures();
        this.initWalls();
    }

    //Setup textures for all Walls.
    protected void initWallTextures() {
        TextureManager textureManager = TextureManager.getTextureManager();

        //textureManager.loadWallTexture(TEXTURE_BLOCK_SOIL, "walls_soil");
    }

    //Walls contains an array of all game Walls, et as initial states.
    protected void initWalls() {
        walls = new Wall[MAX_WALLS];
        strings = new HashMap<Integer, String>();
        strings.put(WALL_UNKNOWN, "UNKNOWN");

        addWall(WALL_AIR,           "AIR",          new Wall());
        addWall(WALL_DIRT,          "DIRT",         new Wall());
        addWall(WALL_STONE,         "STONE",        new Wall());
    }

    //Used to add a new Wall to the game.
    protected void addWall(int wallID, String wallString, Wall wall) {
        walls[wallID] = wall;
        strings.put(wallID, wallString);
    }

    //Get Wall identity string. If UNKNOWN is returned, Wall was never added.
    public static String getWallString(int wallID) {
        return "BLOCK." + strings.get(wallID);
    }

    //Get a Wall's ID number.
    public static int getWallID(Wall wall) {
        if(wall.isEmpty()) return WALL_AIR;
        for(int i = 0; i < MAX_WALLS; i++) {
            if(walls[i].getClass().equals(wall.getClass())) {
                return i;
            }
        }

        return -1;
    }
}