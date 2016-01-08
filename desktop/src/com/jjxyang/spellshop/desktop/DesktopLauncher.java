package com.jjxyang.spellshop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jjxyang.spellshop.SpellShop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        // defines title
        config.title = "Spell Shop";

        // defines window's size
        config.width = 1080;
        config.height = 1920;

        // whether to use OpenGL ES 3.0 ??????
        config.useGL30 = false;

        // creates the game
		new LwjglApplication(new SpellShop(), config);
	}
}
