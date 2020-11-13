/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.findingtheexit.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;

/**
 *
 * @author jay25
 */
public class FindingtheExitGameScene4 extends BaseScene {

    private SpriteBatch batch;
    private OrthographicCamera camera;

    float posX, posY;
    Texture BG2;
    Sprite sprite_BG2;
    Texture beta2;
    Sprite sprite_beta2;

    Texture FanTung1;
    Sprite sprite_FanTung1;

    Texture FanNon1;
    Sprite sprite_FanNon1;

    Texture SawanUp7;
    Sprite sprite_SawanUp7;
    Texture SawanUp8;
    Sprite sprite_SawanUp8;
    Texture SawanUp9;
    Sprite sprite_SawanUp9;

    Texture SawanDown7;
    Sprite sprite_SawanDown7;
    Texture SawanDown8;
    Sprite sprite_SawanDown8;
    Texture SawanDown9;
    Sprite sprite_SawanDown9;

    Texture Key2;
    Sprite sprite_Key2;

    Texture Goal2;
    Sprite sprite_Goal2;

    int count = 1;
    int countkey = 0;

    public FindingtheExitGameScene4(FindingtheExitGame findingtheExitGame) {
        super(findingtheExitGame);
        this.batch = findingtheExitGame.batch;
        this.camera = findingtheExitGame.camera;
        BG2 = new Texture(Gdx.files.internal("yy.png"));
        sprite_BG2 = new Sprite(BG2);
        beta2 = new Texture(Gdx.files.internal("alicecopy.png"));
        sprite_beta2 = new Sprite(beta2);

        FanTung1 = new Texture(Gdx.files.internal("fanTung.png"));
        sprite_FanTung1 = new Sprite(FanTung1);

        FanNon1 = new Texture(Gdx.files.internal("fanNon.png"));
        sprite_FanNon1 = new Sprite(FanNon1);

        SawanUp7 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp7 = new Sprite(SawanUp7);
        SawanUp8 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp8 = new Sprite(SawanUp8);
        SawanUp9 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp9 = new Sprite(SawanUp9);

        SawanDown7 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown7 = new Sprite(SawanDown7);
        SawanDown8 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown8 = new Sprite(SawanDown8);
        SawanDown9 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown9 = new Sprite(SawanDown9);

        Key2 = new Texture(Gdx.files.internal("Rosa.png"));
        sprite_Key2 = new Sprite(Key2);

        Goal2 = new Texture(Gdx.files.internal("door-knob-clipart-43 copy.png"));
        sprite_Goal2 = new Sprite(Goal2);

        posX = 50;
        posY = 500;

        this.resetScene();
    }

    private void drawScene() {
        this.camera.update();
        this.batch.setProjectionMatrix(this.camera.combined);
        this.batch.begin();

        sprite_BG2.setPosition(0, 0);
        sprite_BG2.draw(batch);

        sprite_FanNon1.setPosition(180, 270);
        sprite_FanNon1.rotate(1);
        sprite_FanNon1.draw(batch);

        sprite_FanTung1.setPosition(365, 85);
        sprite_FanTung1.rotate(1);
        sprite_FanTung1.draw(batch);

        sprite_SawanUp7.setPosition(-50, 315);
        sprite_SawanUp7.draw(batch);
        sprite_SawanUp8.setPosition(645, 315);
        sprite_SawanUp8.draw(batch);
        sprite_SawanUp9.setPosition(295, 5);
        sprite_SawanUp9.draw(batch);

        sprite_SawanDown7.setPosition(-53, 255);
        sprite_SawanDown7.draw(batch);
        sprite_SawanDown8.setPosition(300, 535);
        sprite_SawanDown8.draw(batch);
        sprite_SawanDown9.setPosition(645, 255);
        sprite_SawanDown9.draw(batch);

        sprite_Goal2.setPosition(650, 50);
        sprite_Goal2.draw(batch);

        sprite_Key2.setPosition(700, 500);
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_Key2.getBoundingRectangle())) {
            count = 0;
            countkey += 1;
        }
        if (count == 1) {
            sprite_Key2.setPosition(700, 500);
            sprite_Key2.draw(batch);
        }

        sprite_beta2.setPosition(posX, posY);
        sprite_beta2.draw(batch);

        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanDown7.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanDown8.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanDown9.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanUp7.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanUp8.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_SawanUp9.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }

        if (sprite_FanTung1.getBoundingRectangle().contains(sprite_beta2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }

        if (sprite_FanNon1.getBoundingRectangle().contains(sprite_beta2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta2.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (countkey > 0) {
            if (Intersector.overlaps(sprite_beta2.getBoundingRectangle(), sprite_Goal2.getBoundingRectangle())) {
                findingtheExitGame.setScreen(new FindingtheExitGameScene5(findingtheExitGame));
            }
        }
        this.batch.end();
    }

    private void resetScene() {

    }

    private void updateScene(float delta) {
        float moveAmount = 5.0f;
        if (posX > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                posX -= moveAmount;
            }
        }
        if (posX < 730) {
            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
                posX += moveAmount;
            }
        }
        if (posY < 520) {
            if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
                posY += moveAmount;
            }
        }
        if (posY > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
                posY -= moveAmount;
            }
        }
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
        BG2.dispose();
        beta2.dispose();
        FanNon1.dispose();
        FanTung1.dispose();
        SawanUp7.dispose();
        SawanUp8.dispose();
        SawanUp9.dispose();
        SawanDown7.dispose();
        SawanDown8.dispose();
        SawanDown9.dispose();
        Key2.dispose();
        Goal2.dispose();

        super.dispose();
    }

}
