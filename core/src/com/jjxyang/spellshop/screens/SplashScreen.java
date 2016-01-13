package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Scaling;
import com.jjxyang.spellshop.SpellShop;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.delay;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence;

/**
 * Created by Jessie on 1/6/2016.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashTexture;

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
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        // clears the stage
        stage.clear();

        // in image atlas, splash image begins at (4,4)
        // at upper-left corner with dimensions 2180x1940
        TextureRegion splashRegion = new TextureRegion(splashTexture, 0, 0, 2180, 1940);

        // creates splash image actor, sets its size
        Image splashImage = new Image((Drawable) splashRegion, Scaling.stretch, Align.bottomLeft);
        splashImage.setWidth(width);
        splashImage.setHeight(height);

        // makes image completely transparent in order to make fade-in effect work correctly
        splashImage.getColor().a = 0f;

        // configures fade-in/out effect on splash image
        // after fade-out, switches to MenuScreen
        splashImage.addAction(sequence(fadeIn(0.75f), delay(1.75f), fadeOut(0.75f),
            new Action() {
                public boolean act(float delta) {
                    game.setScreen(new MenuScreen(game));
                    return true;    // returning true consumes the event
                }
            })
        );

        // adds actors to stage in correct order
        stage.addActor(splashImage);
    }

    @Override
    public void dispose() {
        super.dispose();
        splashTexture.dispose();
    }
}
