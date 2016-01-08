package com.jjxyang.spellshop;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

        // whether to use OpenGL ES 3.0 ????

        // whether to use accelerometer, compass
        config.useAccelerometer = false;
        config.useCompass = false;

        // creates the game
		initialize(new SpellShop(), config);
	}
}