package com.findingtheexit.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;

public class FindingtheExitGameScene1 extends BaseScene {

    private SpriteBatch batch;
    private OrthographicCamera camera;

    private Texture BG1;
    private Sprite sprite_BG1;

    private Texture beta1;
    private Sprite sprite_beta1;

    private Texture SawanDown1;
    private Sprite sprite_SawanDown1;

    private Texture SawanDown2;
    private Sprite sprite_SawanDown2;

    private Texture SawanDown3;
    private Sprite sprite_SawanDown3;

    private Texture SawanDown4;
    private Sprite sprite_SawanDown4;

    private Texture SawanDown5;
    private Sprite sprite_SawanDown5;

    private Texture SawanDown6;
    private Sprite sprite_SawanDown6;

    private Texture SawanRight1;
    private Sprite sprite_SawanRight1;

    private Texture SawanRight2;
    private Sprite sprite_SawanRight2;

    private Texture SawanRight3;
    private Sprite sprite_SawanRight3;

    private Texture SawanUp1;
    private Sprite sprite_SawanUp1;

    private Texture SawanUp2;
    private Sprite sprite_SawanUp2;

    private Texture SawanUp3;
    private Sprite sprite_SawanUp3;

    private Texture SawanUp4;
    private Sprite sprite_SawanUp4;

    private Texture SawanUp5;
    private Sprite sprite_SawanUp5;

    private Texture SawanUp6;
    private Sprite sprite_SawanUp6;

    private Texture Goal1;
    private Sprite sprite_Goal1;

    private Texture Key1;
    private Sprite sprite_Key1;

    float posX, posY;
    int count = 1;
    int countkey = 0;

    public FindingtheExitGameScene1(FindingtheExitGame findingtheExitGame) {
        super(findingtheExitGame);
        this.batch = findingtheExitGame.batch;
        this.camera = findingtheExitGame.camera;

        BG1 = new Texture(Gdx.files.internal("yy.png"));
        sprite_BG1 = new Sprite(BG1);

        beta1 = new Texture(Gdx.files.internal("alicecopy.png"));
        sprite_beta1 = new Sprite(beta1);

        SawanDown1 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown1 = new Sprite(SawanDown1);

        SawanDown2 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown2 = new Sprite(SawanDown2);

        SawanDown3 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown3 = new Sprite(SawanDown3);

        SawanDown4 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown4 = new Sprite(SawanDown4);

        SawanDown5 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown5 = new Sprite(SawanDown5);

        SawanDown6 = new Texture(Gdx.files.internal("SawanDown.png"));
        sprite_SawanDown6 = new Sprite(SawanDown6);

        SawanRight1 = new Texture(Gdx.files.internal("SawanRight.png"));
        sprite_SawanRight1 = new Sprite(SawanRight1);

        SawanRight2 = new Texture(Gdx.files.internal("SawanRight.png"));
        sprite_SawanRight2 = new Sprite(SawanRight2);

        SawanRight3 = new Texture(Gdx.files.internal("SawanRight.png"));
        sprite_SawanRight3 = new Sprite(SawanRight3);

        SawanUp1 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp1 = new Sprite(SawanUp1);

        SawanUp2 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp2 = new Sprite(SawanUp2);

        SawanUp3 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp3 = new Sprite(SawanUp3);

        SawanUp4 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp4 = new Sprite(SawanUp4);

        SawanUp5 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp5 = new Sprite(SawanUp5);

        SawanUp6 = new Texture(Gdx.files.internal("SawanUp.png"));
        sprite_SawanUp6 = new Sprite(SawanUp6);

        Goal1 = new Texture(Gdx.files.internal("door-knob-clipart-43 copy.png"));
        sprite_Goal1 = new Sprite(Goal1);

        Key1 = new Texture(Gdx.files.internal("Rosa.png"));
        sprite_Key1 = new Sprite(Key1);

        posX = 50;
        posY = 500;

        this.resetScene();
    }

    private void drawScene() {
        this.camera.update();
        this.batch.setProjectionMatrix(this.camera.combined);
        this.batch.begin();
        sprite_BG1.setPosition(0, 0);
        sprite_BG1.draw(batch);

        sprite_SawanDown1.setPosition(180, 500);
        sprite_SawanDown1.draw(batch);

        sprite_SawanDown2.setPosition(380, 500);
        sprite_SawanDown2.draw(batch);

        sprite_SawanDown3.setPosition(580, 500);
        sprite_SawanDown3.draw(batch);

        sprite_SawanDown4.setPosition(20, 200);
        sprite_SawanDown4.draw(batch);

        sprite_SawanDown5.setPosition(220, 200);
        sprite_SawanDown5.draw(batch);

        sprite_SawanDown6.setPosition(420, 200);
        sprite_SawanDown6.draw(batch);

        sprite_SawanRight1.setPosition(740, 340);
        sprite_SawanRight1.draw(batch);

        sprite_SawanRight2.setPosition(740, 180);
        sprite_SawanRight2.draw(batch);

        sprite_SawanRight3.setPosition(740, 20);
        sprite_SawanRight3.draw(batch);

        sprite_SawanUp1.setPosition(20, 270);
        sprite_SawanUp1.draw(batch);

        sprite_SawanUp2.setPosition(220, 270);
        sprite_SawanUp2.draw(batch);

        sprite_SawanUp3.setPosition(420, 270);
        sprite_SawanUp3.draw(batch);

        sprite_SawanUp4.setPosition(530, 10);
        sprite_SawanUp4.draw(batch);

        sprite_SawanUp5.setPosition(330, 10);
        sprite_SawanUp5.draw(batch);

        sprite_SawanUp6.setPosition(130, 10);
        sprite_SawanUp6.draw(batch);

        sprite_Goal1.setPosition(30, 20);
        sprite_Goal1.draw(batch);

        sprite_Key1.setPosition(250, 120);

        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_Key1.getBoundingRectangle())) {
            count = 0;
            countkey += 1;

        }
        if (count == 1) {
            sprite_Key1.setPosition(250, 120);
            sprite_Key1.draw(batch);
        }

        sprite_beta1.setPosition(posX, posY);
        sprite_beta1.draw(batch);

        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown1.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);

        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown3.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown4.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown5.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanDown6.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp1.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp3.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp4.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp5.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanUp6.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanRight1.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanRight2.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_SawanRight3.getBoundingRectangle())) {
            posX = 50;
            posY = 500;
            sprite_beta1.setPosition(posX, posY);
            findingtheExitGame.score++;
            System.out.println(findingtheExitGame.score);
        }
        if (countkey > 0) {
            if (Intersector.overlaps(sprite_beta1.getBoundingRectangle(), sprite_Goal1.getBoundingRectangle())) {
                findingtheExitGame.setScreen(new FindingtheExitGameScene2(findingtheExitGame));
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
        BG1.dispose();
        beta1.dispose();
        SawanDown1.dispose();
        SawanDown2.dispose();
        SawanDown3.dispose();
        SawanDown4.dispose();
        SawanDown5.dispose();
        SawanDown6.dispose();
        SawanRight1.dispose();
        SawanRight2.dispose();
        SawanRight3.dispose();
        SawanUp1.dispose();
        SawanUp2.dispose();
        SawanUp3.dispose();
        SawanUp4.dispose();
        SawanUp5.dispose();
        SawanUp6.dispose();
        Key1.dispose();
        Goal1.dispose();

        super.dispose();
    }

}
