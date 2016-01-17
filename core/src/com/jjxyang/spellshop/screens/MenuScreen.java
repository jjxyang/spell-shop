package com.jjxyang.spellshop.screens;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.jjxyang.spellshop.SpellShop;

/**
 * Created by Jessie on 1/8/2016.
 *
 * Menu screen of the Spell Shop game @TODO
 */
public class MenuScreen extends AbstractScreen {
    // sets up the dimensions of the menu buttons
    private static final float BUTTON_WIDTH = 400f;
    private static final float BUTTON_HEIGHT = 80f;
    private static final float BUTTON_SPACING = 15f;

    public MenuScreen(SpellShop game) {
        super(game);
    }

    // ------------------------------------------
    // Screen implementation
    // ------------------------------------------

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        final float buttonX = (width - BUTTON_WIDTH) / 2;
        float currentY = 300f;

        // label "welcome"
        Label welcomeLabel = new Label("Welcome to your very own Spell Shop!", getSkin());
        welcomeLabel.setX((width - welcomeLabel.getWidth()) / 2);
        welcomeLabel.setY(currentY + 100);
        stage.addActor(welcomeLabel);

        // button "start game"
        TextButton startGameButton = new TextButton("Start Game", getSkin());
        startGameButton.setX(buttonX);
        startGameButton.setY(currentY);
        startGameButton.setWidth(BUTTON_WIDTH);
        startGameButton.setHeight(BUTTON_HEIGHT);
        stage.addActor(startGameButton);

        // button "options"
        TextButton optionsButton = new TextButton("Options", getSkin());
        optionsButton.setX(buttonX);
        optionsButton.setY(currentY -= BUTTON_HEIGHT + BUTTON_SPACING);
        optionsButton.setWidth(BUTTON_WIDTH);
        optionsButton.setHeight(BUTTON_HEIGHT);
        stage.addActor(optionsButton);
    }
}
