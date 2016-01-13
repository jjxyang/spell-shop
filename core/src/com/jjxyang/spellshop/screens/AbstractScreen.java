package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
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
    protected final Stage stage;

    public AbstractScreen(SpellShop game) {
        this.game = game;
        this.font = new BitmapFont();
        this.batch = new SpriteBatch();
        this.stage = new Stage();
    }

    protected String getName() {
        return getClass().getSimpleName();
    }

    // ------------------------------------------
    // Screen implementation
    // ------------------------------------------

    @Override
    public void show() {
        Gdx.app.log(SpellShop.LOG, "Showing screen: " + getName());
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(SpellShop.LOG, "Resizing screen: " + getName() + " to: " + width + "x" + height);

        // resizes the stage
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void render(float delta) {
        // clears the screen with given RGB color (black)
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // updates and draws stage actors
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void hide() {
        Gdx.app.log(SpellShop.LOG, "Hiding screen: " + getName());
    }

    @Override
    public void pause() {
        Gdx.app.log(SpellShop.LOG, "Pausing screen: " + getName());
    }

    @Override
    public void resume() {
        Gdx.app.log(SpellShop.LOG, "Resuming screen: " + getName());
    }

    @Override
    public void dispose() {
        Gdx.app.log(SpellShop.LOG, "Disposing screen: " + getName());

        // disposes the collaborators
        stage.dispose();
        font.dispose();
        batch.dispose();
    }
}
