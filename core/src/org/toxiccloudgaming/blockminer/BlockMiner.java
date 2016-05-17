package org.toxiccloudgaming.blockminer;

import com.badlogic.gdx.ApplicationAdapter;

import org.toxiccloudgaming.blockminer.init.Startup;
import org.toxiccloudgaming.blockminer.registry.Registry;
import org.toxiccloudgaming.blockminer.render.RenderEngine;

//Main game class for BlockMiner.
@Registry("blockminer")
public class BlockMiner extends ApplicationAdapter {

	//Game constant strings.
	public static final String DEV_NAME = "Beau Hottovy";
	public static final String DEV_VERSION = "0.0.1";
	public static final String DEV_DATE = "May 10, 2016";
	public static final String WEB_URL = "http://www.toxiccloudgaming.org";
	
	@Override
	public void create() {
		Startup.preInitialization();
		Startup.initialization();
		Startup.postInitialization();
	}

	@Override
	public void render() {
		if(RenderEngine.getRenderEngine() != null) {
			RenderEngine.getRenderEngine().render();
		} else {
			System.out.println("RenderEngine currently null");
		}
	}
}
