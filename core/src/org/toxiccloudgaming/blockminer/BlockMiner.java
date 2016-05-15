package org.toxiccloudgaming.blockminer;

import com.badlogic.gdx.ApplicationAdapter;

import org.toxiccloudgaming.blockminer.init.Startup;
import org.toxiccloudgaming.blockminer.registry.Registry;

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
	}

	@Override
	public void render() {
		
	}
}
