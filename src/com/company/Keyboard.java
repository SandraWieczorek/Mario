package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       // Main.render.setDx(0);
        if(e.getKeyCode() == KeyEvent.VK_RIGHT )
        {
            if(Main.render.mario.isRight() == true) {
                if (Main.render.getXposition() == -1) {
                    Main.render.setXposition(0);
                    Main.render.setxScene1(-50);
                    Main.render.setxScene2(750);
                }
                Main.render.setDx(1);
            }
            Main.render.mario.setLeft(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(Main.render.mario.isLeft() == true) {
                Main.render.setDx(-1);
                Main.render.mario.setRight(true);
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            Main.render.mario.speed = 3;
           // Main.render.mario.setY(1);
          /*  if (Main.render.mario.dy > 0)
            {
                Main.render.mario.dy = 0;
            }*/
            Main.render.mario.dy = -(Main.render.mario.speed);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    Main.render.setDx(0);
    }
}
