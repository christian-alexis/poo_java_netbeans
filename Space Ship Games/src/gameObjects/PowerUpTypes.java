/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObjects;

import java.awt.image.BufferedImage;

import graphics.Assets;


public enum PowerUpTypes {
	SHIELD("SHIELD", Assets.shield),
	LIFE("+1 LIFE", Assets.life),
	SCORE_X2("SCORE x2", Assets.doubleScore),
	FASTER_FIRE("FAST FIRE", Assets.fastFire),
	SCORE_STACK("+1000 SCORE", Assets.star),
	DOUBLE_GUN("DOUBLE GUN", Assets.doubleGun);
	
	public String text;
	public BufferedImage texture;
	
	private PowerUpTypes(String text, BufferedImage texture){
		this.text = text;
		this.texture = texture;
	}
}