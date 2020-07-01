package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.SpringLayout.WIDTH;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leo
 */
public class Window extends JFrame implements Runnable{

    private final Canvas canvas;
    private static final int WIDTH = 800, HEIGTH = 600;
    private Thread thread;
    private boolean running = false;
    private BufferStrategy bs;
    private Graphics g;
    private final int FPS=60;
    private double TARGETTIME= 1000000000/FPS;
    private double delta=0;
    private int AVERAGEFPS = FPS;

    public Window() throws HeadlessException {

        super.setTitle("Space Ship Game");
        super.setSize(WIDTH, HEIGTH);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        super.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);

        add(canvas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       new Window().start();
    }
    int x= 0;
    private void updata()
    {
      x ++;  
    }
    private void draw()
    {
      bs = canvas.getBufferStrategy();
      
      if(bs ==null){
          canvas.createBufferStrategy(3);
          return;
      }
      g =bs.getDrawGraphics();
      //----------------------------------------------------
      g.clearRect(0, 0, WIDTH,HEIGTH );
      
      g.setColor(Color.BLACK);
      g.drawString(""+AVERAGEFPS, 10, 10);
      
      
      //----------------------------------------------------
      g.dispose();
      bs.show();
          
    }

    @Override
    public void run() {
        
        long now=0;
        long lasTime =  System.nanoTime();
        int frames =0;
        long time =0;
        
        while (running) 
        {
        now= System.nanoTime();
        delta +=(now - lasTime)/TARGETTIME;
        time +=(now - lasTime);
        lasTime= now;
        
        
        if (delta >= 1){
            updata();
            draw();
            delta--; 
            frames ++;
            System.out.println(frames);
        }
        if (time >= 1000000000)
        {
            AVERAGEFPS = frames; 
            frames=0;
            time=0;
            
        }
        }
        
       stop();
    }
private void start(){
    
    thread = new Thread(this);
    thread.start();
    running=true;
}
private void stop(){
        try {
            thread.join();
            running=false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}
