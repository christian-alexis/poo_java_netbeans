/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.image.BufferedImage;

import math.Vector2D;

/**
 *
 * @author chris
 */
public class Animation {

    private BufferedImage[] frames;
    private int velocity;
    private int index;
    private boolean running;
    private Vector2D position;
    private long time;

    public Animation(BufferedImage[] frames, int velocity, Vector2D position) {
        this.frames = frames;
        this.velocity = velocity;
        this.position = position;
        index = 0;
        running = true;
    }

    public void update(float dt) {

        time += dt;

        if (time > velocity) {
            time = 0;
            index++;
            if (index >= frames.length) {
                running = false;
                index = 0;
            }
        }
    }

    public boolean isRunning() {
        return running;
    }

    public Vector2D getPosition() {
        return position;
    }

    public BufferedImage getCurrentFrame() {
        return frames[index];
    }

}
