package com.findingtheexit.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MenuScene extends BaseScene {

    private Stage stage;
    private Skin skin;
    private Table mainMenu;
    private TextButton playButton;
    private TextButton exitButton;

    private Texture textureBackground;
    private Image imageBackground;

    public MenuScene(final FindingtheExitGame prisonBreakGame) {
        super(prisonBreakGame);

        final int SCREEN_WIDTH = Gdx.graphics.getWidth();
        final int SCREEN_HEIGHT = Gdx.graphics.getHeight();

        this.stage = new Stage(prisonBreakGame.viewport);
        this.skin = new Skin(Gdx.files.internal("images/uiskin.json"));
        Gdx.input.setInputProcessor(this.stage);

        this.textureBackground = new Texture(Gdx.files.internal("f.png"));
        this.imageBackground = new Image(textureBackground);

        this.mainMenu = new Table();
        this.mainMenu.setPosition((SCREEN_WIDTH - this.mainMenu.getWidth()) / 2, (SCREEN_HEIGHT - this.mainMenu.getHeight()) / 2);

        this.playButton = new TextButton("Play Now!", this.skin);
        this.mainMenu.add(this.playButton).padBottom(15);
        this.mainMenu.row();

        this.exitButton = new TextButton("Exit", this.skin);
        this.mainMenu.add(this.exitButton);
        this.mainMenu.row();

        this.stage.addActor(this.imageBackground);
        this.stage.addActor(this.mainMenu);

        playButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                prisonBreakGame.setScreen(new FindingtheExitGameScene1(prisonBreakGame));
            }
        });

        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.stage.act();
        this.stage.draw();
    }

    @Override
    protected void handleBackPress() {
        super.handleBackPress();
    }

    @Override
    public void dispose() {
        super.dispose();
        this.stage.dispose();
        this.skin.dispose();
    }

}
