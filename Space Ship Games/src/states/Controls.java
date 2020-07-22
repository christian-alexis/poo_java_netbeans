/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import gameObjects.Constants;
import graphics.Assets;
import graphics.Text;
import java.awt.Color;
import java.awt.Graphics;
import math.Vector2D;
import ui.Action;
import ui.Button;

/**
 *
 * @author chris
 */
public class Controls extends State{
    
    
private Button returnButton;
    
    public  Controls() {
        returnButton = new Button(
                Assets.greyBtn,
                Assets.blueBtn,
                Assets.greyBtn.getHeight(),
                Constants.HEIGHT - Assets.greyBtn.getHeight() * 2,
                Constants.RETURN,
                new Action() {
            @Override
            public void doAction() {
                State.changeState(new MenuState());
            }
        }
        );

    }

    public void update() {
        returnButton.update();
    }
    @Override
    public void draw(Graphics g) {
        returnButton.draw(g);
        
        Vector2D control1 = new Vector2D(
                Constants.WIDTH / 2 - 200,
                100
        );
        Vector2D letra1 = new Vector2D(
                Constants.WIDTH / 2 + 200,
                100
        );
        Vector2D control2 = new Vector2D(
                Constants.WIDTH / 2 - 200,
                200
                );
        Vector2D letra2 = new Vector2D(
                Constants.WIDTH / 2 + 200,
                200
        );
        Vector2D control3 = new Vector2D(
                Constants.WIDTH / 2 - 200,
                300
                );
        Vector2D letra3 = new Vector2D(
                Constants.WIDTH / 2 + 200,
                300
        );
        Vector2D control4 = new Vector2D(
                Constants.WIDTH / 2 - 200,
                400
                );
        Vector2D letra4 = new Vector2D(
                Constants.WIDTH / 2 + 200,
                400
        );
                
                
        
     

        Text.drawText(g, Constants.SPEED, control1, true, Color.BLUE, Assets.fontBig);
        Text.drawText(g, Constants.W, letra1, true, Color.RED, Assets.fontBig);
        Text.drawText(g, Constants.RIGHT, control2, true, Color.BLUE, Assets.fontBig);
        Text.drawText(g, Constants.D, letra2, true, Color.RED, Assets.fontBig);
        Text.drawText(g, Constants.LEFT, control3, true, Color.BLUE, Assets.fontBig);
        Text.drawText(g, Constants.A, letra3, true, Color.RED, Assets.fontBig);
        Text.drawText(g, Constants.SHOOT, control4, true, Color.BLUE, Assets.fontBig);
        Text.drawText(g, Constants.SPACE, letra4, true, Color.RED, Assets.fontBig);
        

    }

    @Override
    public void update(float dt) {
         
        returnButton.update();
    }

   
}

    