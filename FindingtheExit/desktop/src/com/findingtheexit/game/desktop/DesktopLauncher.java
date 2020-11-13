package com.findingtheexit.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.findingtheexit.game.FindingtheExitGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new FindingtheExitGame(), config);
                config.title = "FindtheExit";
		config.width = 800;
		config.height = 600;
		config.resizable = false;

	}
}
