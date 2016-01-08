package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.jjxyang.spellshop.SpellShop;

/**
 * Created by Jessie on 1/6/2016.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashTexture;
    private TextureRegion splashTextureRegion;

    public SplashScreen(SpellShop game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        // loads splash image and creates texture region
        splashTexture = new Texture("android/assets/spellShopImageAtlas.png");

        // sets linear texture filter to improve stretching
        splashTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

        // in image atlas, splash image begins at (4,4)
        // at upper-left corner with dimensions 2180x1940
        splashTextureRegion = new TextureRegion(splashTexture, 0, 0, 2180, 1940);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        // uses SpriteBatch to draw 2D textures (as defined in AbstractScreen)
        batch.begin();

        // tells batch to draw region starting at (0,0) of
        // lower-left corner with the given screen size
        batch.draw(splashTextureRegion, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void dispose() {
        super.dispose();
        splashTexture.dispose();
    }
}
