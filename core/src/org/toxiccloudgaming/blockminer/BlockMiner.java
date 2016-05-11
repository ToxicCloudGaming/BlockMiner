package org.toxiccloudgaming.blockminer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import org.toxiccloudgaming.blockminer.resource.ResourceManager;

public class BlockMiner extends ApplicationAdapter {

	//Game constants.
	public static final String GAME_NAME = "Block Miner";
	public static final String GAME_ID = "BLOCK_MINER";

	public static final String DEV_NAME = "Beau Hottovy";
	public static final String DEV_VERSION = "0.0.1";
	public static final String DEV_DATE = "May 10, 2016";
	public static final String WEB_URL = "http://www.toxiccloudgaming.org";

	SpriteBatch batch;
	Texture img;
	TextureRegion region;

	ResourceManager manager;
	
	@Override
	public void create() {
		this.manager = new ResourceManager();
		batch = new SpriteBatch();
		img = org.toxiccloudgaming.blockminer.resource.Asset.loadBlock("blocks_soil");
		region = new TextureRegion(img, 112, 0, 32, 32);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(region, 0, 0);
		batch.end();
	}
}
