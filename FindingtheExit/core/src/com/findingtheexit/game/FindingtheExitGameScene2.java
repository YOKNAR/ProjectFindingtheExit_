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
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author jay25
 */


public class FindingtheExitGameScene2 extends BaseScene {
    private SpriteBatch batch;
    private OrthographicCamera camera;
    Texture BG3;
    Sprite sprite_BG3;
    Texture beta3;
    Sprite sprite_beta3;

    Texture warden1;
    Sprite sprite_warden1;
    Vector2 positionWarden1 = new Vector2();
    boolean backWarden1 = false;

    Texture warden2;
    Sprite sprite_warden2;
    Vector2 positionWarden2 = new Vector2();
    boolean backWarden2 = false;

    Texture warden3;
    Sprite sprite_warden3;
    Vector2 positionWarden3 = new Vector2();
    boolean backWarden3 = false;

    Texture warden4;
    Sprite sprite_warden4;
    Vector2 positionWarden4 = new Vector2();
    boolean backWarden4 = false;

    Texture Key3;
    Sprite sprite_Key3;

    Texture Goal3;
    Sprite sprite_Goal3;


    float posX, posY;
    int count = 1;
    int countkey = 0;
    public FindingtheExitGameScene2(FindingtheExitGame findingtheExitGame) {
        super(findingtheExitGame);
        this.batch = findingtheExitGame.batch;
        this.camera = findingtheExitGame.camera;
        posX = 50;
        posY = 500;
        BG3 = new Texture(Gdx.files.internal("yy.png"));
        sprite_BG3 = new Sprite(BG3);
        beta3 = new Texture(Gdx.files.internal("alicecopy.png"));
        sprite_beta3 = new Sprite(beta3);

        warden1 = new Texture(Gdx.files.internal("Cat.png"));
        sprite_warden1 = new Sprite(warden1);
        positionWarden1.x = 10;
        positionWarden1.y = 20;

        warden2 = new Texture(Gdx.files.internal("Cat.png"));
        sprite_warden2 = new Sprite(warden2);
        positionWarden2.x = 100;
        positionWarden2.y = 150;

        warden3 = new Texture(Gdx.files.internal("Cat.png"));
        sprite_warden3 = new Sprite(warden3);
        positionWarden3.x = 250;
        positionWarden3.y = 275;

        warden4 = new Texture(Gdx.files.internal("Cat.png"));
        sprite_warden4 = new Sprite(warden4);
        positionWarden4.x = 400;
        positionWarden4.y = 400;

        Key3 = new Texture(Gdx.files.internal("Rosa.png"));
        sprite_Key3 = new Sprite(Key3);

        Goal3 = new Texture(Gdx.files.internal("door-knob-clipart-43 copy.png"));
        sprite_Goal3 = new Sprite(Goal3);

        this.resetScene();
    }
    private void drawScene() {
        this.camera.update();
        this.batch.setProjectionMatrix(this.camera.combined);
        this.batch.begin();
        sprite_BG3.setPosition(0,0);
        sprite_BG3.draw(batch);

        sprite_warden1.setPosition(positionWarden1.x,positionWarden1.y);
        sprite_warden1.draw(batch);

        sprite_warden2.setPosition(positionWarden2.x,positionWarden2.y);
        sprite_warden2.draw(batch);

        sprite_warden3.setPosition(positionWarden3.x,positionWarden3.y);
        sprite_warden3.draw(batch);

        sprite_warden4.setPosition(positionWarden4.x,positionWarden4.y);
        sprite_warden4.draw(batch);


        sprite_Goal3.setPosition(700,20);
        sprite_Goal3.draw(batch);

        sprite_Key3.setPosition(500,30);
        if(Intersector.overlaps(sprite_beta3.getBoundingRectangle(),sprite_Key3.getBoundingRectangle())){
            count = 0;
            countkey += 1;
        }
        if (count == 1) {
            sprite_Key3.setPosition(500, 30);
            sprite_Key3.draw(batch);
        }


        sprite_beta3.setPosition(posX,posY);
        sprite_beta3.draw(batch);

        if(Intersector.overlaps(sprite_beta3.getBoundingRectangle(),sprite_warden1.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta3.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta3.getBoundingRectangle(),sprite_warden2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta3.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta3.getBoundingRectangle(),sprite_warden3.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta3.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta3.getBoundingRectangle(),sprite_warden4.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta3.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }


        if(countkey >0) {
            if (Intersector.overlaps(sprite_beta3.getBoundingRectangle(), sprite_Goal3.getBoundingRectangle())) {
                findingtheExitGame.setScreen(new FindingtheExitGameScene3(findingtheExitGame));
            }
        }
        this.batch.end();
    }
    private void resetScene() {

    }
    private void updateScene(float delta) {
        if (positionWarden1.x < 735 && backWarden1 == false) {
            positionWarden1.x += 8;
            if(positionWarden1.x >= 735)
            backWarden1 = true;
        }
        if(backWarden1 == true){
            positionWarden1.x -= 4;
            if(positionWarden1.x <= 31){
                backWarden1 = false;
            }
        }
        if (positionWarden2.x < 735 && backWarden2 == false) {
            positionWarden2.x += 8;
            if(positionWarden2.x >= 735)
                backWarden2 = true;
        }
        if(backWarden2 == true){
            positionWarden2.x -= 8;
            if(positionWarden2.x <= 31){
                backWarden2 = false;
            }
        }if (positionWarden3.x < 735 && backWarden3 == false) {
            positionWarden3.x += 8;
            if(positionWarden3.x >= 735)
                backWarden3 = true;
        }
        if(backWarden3 == true){
            positionWarden3.x -= 8;
            if(positionWarden3.x <= 31){
                backWarden3 = false;
            }
        }if (positionWarden4.x < 735 && backWarden4 == false) {
            positionWarden4.x += 8;
            if(positionWarden4.x >= 735)
                backWarden4 = true;
        }
        if(backWarden4 == true){
            positionWarden4.x -= 4;
            if(positionWarden4.x <= 31){
                backWarden4 = false;
            }
        }



        float moveAmount = 5.0f;
        if(posX > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
                posX -= moveAmount;
        }
        if(posX < 730) {
            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
                posX += moveAmount;
        }
        if(posY < 520) {
            if (Gdx.input.isKeyPressed(Input.Keys.UP))
                posY += moveAmount;
        }
        if(posY > 0) {
            if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
                posY -= moveAmount;
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
        BG3.dispose();
        beta3.dispose();
        warden1.dispose();
        warden2.dispose();
        warden3.dispose();
        warden4.dispose();
        Key3.dispose();
        Goal3.dispose();

        super.dispose();
    }



}

