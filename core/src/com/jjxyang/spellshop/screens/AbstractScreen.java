package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jjxyang.spellshop.SpellShop;

/**
 * Created by Jessie on 1/5/2016.
 *
 * Abstract class from which all SpellShop screens inherit
 */
public abstract class AbstractScreen implements Screen {
    protected final SpellShop game;
    protected final BitmapFont font;
    protected final SpriteBatch batch;

    public AbstractScreen(SpellShop game) {
        this.game = game;
        this.font = new BitmapFont();
        this.batch = new SpriteBatch();
    }

    @Override
    public void show() {}

    @Override
    public void resize(int width, int height) {}

    @Override
    public void render(float delta) {
        // clears the screen with given RGB color (black)
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void hide() {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void dispose() {
        font.dispose();
        batch.dispose();
    }
}
