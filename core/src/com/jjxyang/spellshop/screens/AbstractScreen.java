package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.jjxyang.spellshop.SpellShop;

/**
 * Created by Jessie on 1/5/2016.
 *
 * Abstract class from which all SpellShop screens inherit
 */
public abstract class AbstractScreen implements Screen {
    protected final SpellShop game;
    protected final Stage stage;

    private BitmapFont font;
    private SpriteBatch batch;
    private Skin skin;

    public AbstractScreen(SpellShop game) {
        this.game = game;
        this.stage = new Stage();
    }

    protected String getName() {
        return getClass().getSimpleName();
    }

    public BitmapFont getFont() {
        if (font == null) {
            font = new BitmapFont();
        }
        return font;
    }

    public SpriteBatch getBatch() {
        if (batch == null) {
            batch = new SpriteBatch();
        }
        return batch;
    }

    public Skin getSkin() {
        if (skin == null) {
            //skin = new Skin(Gdx.files.internal("uiskin.json"), Gdx.files.internal("uiskin.png"));
            skin = new Skin(); //@TODO fix the above
        }
        return skin;
    }

    // ------------------------------------------
    // Screen implementation
    // ------------------------------------------

    @Override
    public void show() {
        Gdx.app.log(SpellShop.LOG, "Showing screen: " + getName());

        // sets the input processor
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(SpellShop.LOG, "Resizing screen: " + getName() + " to: " + width + "x" + height);

        // resizes and clears the stage, centering the camera
        stage.getViewport().update(width, height, true);
        stage.clear();
    }

    @Override
    public void render(float delta) {
        // (1) processes the game logic --------------------------------

        // updates the actors
        stage.act(delta);

        // (2) draws the result ----------------------------------------

        // clears the screen with given RGB color (black)
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // draws stage actors
        stage.draw();
    }

    @Override
    public void hide() {
        Gdx.app.log(SpellShop.LOG, "Hiding screen: " + getName());

        // disposes resources by default
        dispose();
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

        if (font != null)
            font.dispose();
        if (batch != null)
            batch.dispose();
        if (skin != null)
            batch.dispose();
    }
}
