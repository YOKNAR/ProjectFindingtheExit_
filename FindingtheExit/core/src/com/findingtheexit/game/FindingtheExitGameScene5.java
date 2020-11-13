package com.findingtheexit.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FindingtheExitGameScene5 extends BaseScene{
    private SpriteBatch batch;
    private OrthographicCamera camera;
    BitmapFont font;

    private Texture BG5;
    private Sprite sprite_BG5;

    public FindingtheExitGameScene5(FindingtheExitGame findingtheExitGame) {
        super(findingtheExitGame);
        this.batch = findingtheExitGame.batch;
        this.camera = findingtheExitGame.camera;


        BG5 = new Texture(Gdx.files.internal("brickwall-dark.png"));
        sprite_BG5 = new Sprite(BG5);

        font = new BitmapFont();
        font.setColor(Color.RED);
        font.getData().setScale(4,4);
        this.resetScene();
    }

    private void drawScene() {
        this.camera.update();
        this.batch.setProjectionMatrix(this.camera.combined);
        this.batch.begin();
        sprite_BG5.setPosition(0, 0);
        sprite_BG5.draw(batch);
        font.draw(batch, "You death count : "+findingtheExitGame.score, 150, 350);

        this.batch.end();
    }


    private void resetScene() {

    }


    private void updateScene(float delta) {
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.drawScene();
        this.updateScene(delta);
    }

    @Override
    protected void handleBackPress() {
        super.handleBackPress();
    }

    @Override
    public void dispose() {
        this.batch.dispose();
        BG5.dispose();
        font.dispose();
        super.dispose();
    }
    }
