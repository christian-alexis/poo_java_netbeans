/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import gameObject.Player;
import graphics.Assets;
import java.awt.Graphics;
import maht.Vector2D;



/**
 *
 * @author Leo
 */
public class GameState {
	
	private Player player;
	
	public GameState()
	{
		player = new Player(new Vector2D(100, 500), Assets.player);
	}
	
	public void update()
	{
		
	}
	
	public void draw(Graphics g)
	{
		player.draw(g);
	}
}
