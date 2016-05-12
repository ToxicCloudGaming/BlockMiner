package org.toxiccloudgaming.blockminer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.toxiccloudgaming.blockminer.language.LanguageRegistry;
import org.toxiccloudgaming.blockminer.resource.ResourceManager;
import org.toxiccloudgaming.blockminer.resource.TextureManager;

//Main game class for BlockMiner.
public class BlockMiner extends ApplicationAdapter {

	//Game constant strings.
	public static final String GAME = "blockminer";
	public static final String GAME_TITLE = GAME + ".title";
	public static final String DEV_NAME = "Beau Hottovy";
	public static final String DEV_VERSION = "0.0.1";
	public static final String DEV_DATE = "May 10, 2016";
	public static final String WEB_URL = "http://www.toxiccloudgaming.org";

	SpriteBatch batch;

	ResourceManager manager;
	
	@Override
	public void create() {
		this.manager = new ResourceManager();
		batch = new SpriteBatch();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(region, 0, 0);
		batch.end();
	}

	protected void preIntialization() {
		LanguageRegistry.setLanguageRegistry(new LanguageRegistry());
		TextureManager.setTextureManager(new TextureManager());
	}
}
