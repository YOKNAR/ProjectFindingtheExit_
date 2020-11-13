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

public class FindingtheExitGameScene3 extends BaseScene {
    private SpriteBatch batch;
    private OrthographicCamera camera;
    float posX, posY;
    int count = 1;
    int countkey = 0;
    Texture beta4;
    Sprite sprite_beta4;

    Texture BG4;
    Sprite sprite_BG4;

    Texture SawanUp10;
    Sprite sprite_SawanUp10;
    Texture SawanUp11;
    Sprite sprite_SawanUp11;
    Texture SawanUp12;
    Sprite sprite_SawanUp12;

    Texture SawanDown10;
    Sprite sprite_SawanDown10;
    Texture SawanDown11;
    Sprite sprite_SawanDown11;


    Texture Drone1;
    Sprite sprite_Drone1;
    boolean backdrone1 = false;
    Vector2 positionDrone1 = new Vector2();

    Texture Drone2;
    Sprite sprite_Drone2;
    boolean backdrone2 = false;
    Vector2 positionDrone2 = new Vector2();

    Texture Drone3;
    Sprite sprite_Drone3;
    boolean backdrone3 = false;
    Vector2 positionDrone3 = new Vector2();

    Texture Drone4;
    Sprite sprite_Drone4;
    boolean backdrone4 = false;
    Vector2 positionDrone4 = new Vector2();

    Texture Drone5;
    Sprite sprite_Drone5;
    boolean backdrone5 = false;
    Vector2 positionDrone5 = new Vector2();

    Texture Key4;
    Sprite sprite_Key4;

    Texture Goal4;
    Sprite sprite_Goal4;



    public FindingtheExitGameScene3(FindingtheExitGame findingtheExitGame) {
        super(findingtheExitGame);
        this.batch = findingtheExitGame.batch;
        this.camera = findingtheExitGame.camera;
        posX = 50;
        posY = 500;

        BG4 = new Texture(Gdx.files.internal("yy.png"));
        sprite_BG4 = new Sprite(BG4);
        beta4 = new Texture(Gdx.files.internal("alicecopy.png"));
        sprite_beta4 = new Sprite(beta4);

        SawanUp10 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp10 = new Sprite(SawanUp10);

        SawanUp11 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp11 = new Sprite(SawanUp11);

        SawanUp12 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp12 = new Sprite(SawanUp12);

        Drone1 = new Texture(Gdx.files.internal("jixE5ax5T.png"));
        sprite_Drone1= new Sprite(Drone1);
        positionDrone1.x = 200;
        positionDrone1.y = 500;

        Drone2 = new Texture(Gdx.files.internal("jixE5ax5T.png"));
        sprite_Drone2 = new Sprite(Drone2);
        positionDrone2.x = 320;
        positionDrone2.y = 150;

        Drone3 = new Texture(Gdx.files.internal("jixE5ax5T.png"));
        sprite_Drone3 = new Sprite(Drone3);
        positionDrone3.x = 440;
        positionDrone3.y = 350;

        Drone4 = new Texture(Gdx.files.internal("jixE5ax5T.png"));
        sprite_Drone4 = new Sprite(Drone4);
        positionDrone4.x = 560;
        positionDrone4.y = 400;

        Drone5 = new Texture(Gdx.files.internal("jixE5ax5T.png"));
        sprite_Drone5 = new Sprite(Drone5);
        positionDrone5.x = 680;
        positionDrone5.y = 10;

        SawanDown10 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown10 = new Sprite(SawanDown10);
        SawanDown11 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown11 = new Sprite(SawanDown11);


        Key4 = new Texture(Gdx.files.internal("Rosa.png"));
        sprite_Key4 = new Sprite(Key4);

        Goal4 = new Texture(Gdx.files.internal("door-knob-clipart-43 copy.png"));
        sprite_Goal4 = new Sprite(Goal4);



        this.resetScene();
    }
    private void drawScene() {
        this.camera.update();
        this.batch.setProjectionMatrix(this.camera.combined);
        this.batch.begin();

        sprite_BG4.setPosition(0,0);
        sprite_BG4.draw(batch);
        sprite_SawanUp10.setPosition(40,10);
        sprite_SawanUp10.draw(batch);
        sprite_SawanUp11.setPosition(240,10);
        sprite_SawanUp11.draw(batch);
        sprite_SawanUp12.setPosition(440,10);
        sprite_SawanUp12.draw(batch);

        sprite_SawanDown10.setPosition(260,510);
        sprite_SawanDown10.draw(batch);
        sprite_SawanDown11.setPosition(470,510);
        sprite_SawanDown11.draw(batch);

        sprite_Drone1.setPosition(positionDrone1.x,positionDrone1.y);
        sprite_Drone1.draw(batch);

        sprite_Drone2.setPosition(positionDrone2.x,positionDrone2.y);
        sprite_Drone2.draw(batch);

        sprite_Drone3.setPosition(positionDrone3.x,positionDrone3.y);
        sprite_Drone3.draw(batch);

        sprite_Drone4.setPosition(positionDrone4.x,positionDrone4.y);
        sprite_Drone4.draw(batch);

        sprite_Drone5.setPosition(positionDrone5.x,positionDrone5.y);
        sprite_Drone5.draw(batch);

        sprite_Goal4.setPosition(700,20);
        sprite_Goal4.draw(batch);

        if(countkey >0) {
            if (Intersector.overlaps(sprite_beta4.getBoundingRectangle(), sprite_Goal4.getBoundingRectangle())) {
                findingtheExitGame.setScreen(new FindingtheExitGameScene4(findingtheExitGame));
            }
        }

        sprite_Key4.setPosition(720,520);
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Key4.getBoundingRectangle())){
            count = 0;
            countkey += 1;
        }
        if (count == 1) {
            sprite_Key4.setPosition(720,520);
            sprite_Key4.draw(batch);
        }


        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_SawanDown10.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_SawanDown11.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }

        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_SawanUp10.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_SawanUp11.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_SawanUp12.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Drone1.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Drone2.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Drone3.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Drone4.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if(Intersector.overlaps(sprite_beta4.getBoundingRectangle(),sprite_Drone5.getBoundingRectangle())){
            posX = 50;
            posY = 500;
            sprite_beta4.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }


        sprite_beta4.setPosition(posX,posY);
        sprite_beta4.draw(batch);

        this.batch.end();
    }
    private void resetScene() {

    }
    private void updateScene(float delta) {
        if (positionDrone1.y < 550 && backdrone1 == false) {
            positionDrone1.y += 7;
            if(positionDrone1.y >= 550)
                backdrone1 = true;
        }
        if(backdrone1 == true){
            positionDrone1.y -= 7;
            if(positionDrone1.y <= 10){
                backdrone1 = false;
            }
        }
        if (positionDrone2.y < 550 && backdrone2 == false) {
            positionDrone2.y += 2;
            if(positionDrone2.y >= 550)
                backdrone2 = true;
        }
        if(backdrone2 == true){
            positionDrone2.y -= 2;
            if(positionDrone2.y <= 10){
                backdrone2 = false;
            }
        }
        if (positionDrone3.y < 550 && backdrone3 == false) {
            positionDrone3.y += 8;
            if(positionDrone3.y >= 550)
                backdrone3 = true;
        }
        if(backdrone3 == true){
            positionDrone3.y -= 8;
            if(positionDrone3.y <= 10){
                backdrone3 = false;
            }
        }
        if (positionDrone4.y < 550 && backdrone4 == false) {
            positionDrone4.y += 3;
            if(positionDrone4.y >= 550)
                backdrone4 = true;
        }
        if(backdrone4 == true){
            positionDrone4.y -= 3;
            if(positionDrone4.y <= 10){
                backdrone4 = false;
            }
        }
        if (positionDrone5.y < 550 && backdrone5 == false) {
            positionDrone5.y += 5.5;
            if(positionDrone5.y >= 550)
                backdrone5 = true;
        }
        if(backdrone5 == true){
            positionDrone5.y -= 5.5;
            if(positionDrone5.y <= 10){
                backdrone5 = false;
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

        beta4.dispose();
        BG4.dispose();
        Drone1.dispose();
        Drone2.dispose();
        Drone3.dispose();
        Drone4.dispose();
        Drone5.dispose();
        SawanUp10.dispose();
        SawanUp11.dispose();
        SawanUp12.dispose();
        SawanDown10.dispose();
        SawanDown11.dispose();

        Key4.dispose();
        Goal4.dispose();
        super.dispose();
    }

}


