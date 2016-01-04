package com.jjxyang.spellshop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SpellShop extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

    // constant for logging purposes
    public static final String LOG = SpellShop.class.getSimpleName();

	// libgdx helper class, logs current FPS each second
    private FPSLogger fpsLogger;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

        Gdx.app.log(SpellShop.LOG, "Creating game");
        fpsLogger = new FPSLogger();
	}

	@Override
	public void render () {
        // clears the screen with given RGB color
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // draws batch of sprites
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

        //outputs the current FPS
        fpsLogger.log();
	}

	@Override
	public void resize(int width, int height) {
        Gdx.app.log(SpellShop.LOG, "Resizing game to: " + width + " x " + height);
	}

	@Override
	public void pause() {
        Gdx.app.log(SpellShop.LOG, "Pausing game");
	}

	@Override
	public void resume() {
        Gdx.app.log(SpellShop.LOG, "Resuming game");
	}

	@Override
	public void dispose() {
        Gdx.app.log(SpellShop.LOG, "Disposing game");
	}
}
