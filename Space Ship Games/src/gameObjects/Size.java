/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObjects;

/**
 *
 * @author chris
 */
import java.awt.image.BufferedImage;

import graphics.Assets;

public enum Size {

    BIG(2, Assets.meds), MED(2, Assets.smalls), SMALL(2, Assets.tinies), TINY(0, null);

    public int quantity;

    public BufferedImage[] textures;

    private Size(int quantity, BufferedImage[] textures) {
        this.quantity = quantity;
        this.textures = textures;
    }

}
