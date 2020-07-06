/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

import com.sun.javafx.geom.Vec2d;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import maht.Vector2D;

/**
 *
 * @author Leo
 */
public class Player extends GameObject{

	public Player(Vector2D position, BufferedImage texture) {
		super(position, texture);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
	}
}
   