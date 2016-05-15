package org.toxiccloudgaming.blockminer.render;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.toxiccloudgaming.blockminer.world.World;

//This class is used as an engine for rendering game objects.
public class RenderEngine {

    //Global RenderEngine object.
    private static RenderEngine globalRenderEngine;

    //The main SpriteBatch for rendering.
    private SpriteBatch batch;

    public RenderEngine() {
        this.batch = new SpriteBatch();
    }

    //Sets the global RenderEngine.
    public static void setRenderEngine(RenderEngine renderEngine) {
        globalRenderEngine = renderEngine;
    }

    //Gets the global RenderEngine.
    public static RenderEngine getRenderEngine() {
        return globalRenderEngine;
    }

    //TODO setup RenderEngine class for rendering objects depending on position in world/game screen.
    //RenderEngine render method.

    World world = new World(); //TODO Make a WorldManager with list of game Worlds.
    public void render() {
        world.render(this.batch);
    }
}
