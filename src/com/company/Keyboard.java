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
        if(e.getKeyCode() == KeyEvent.VK_RIGHT && Main.render.mario.isWalk() == true)
        {
            if(Main.render.getXposition()== -1)
            {
                Main.render.setXposition(0);
                Main.render.setxScene1(-50);
                Main.render.setxScene2(750);
            }
            Main.render.setDx(1);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            Main.render.setDx(-1);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            if (Main.render.mario.dy > 0)
            {
                Main.render.mario.dy = 0;
            }
            Main.render.mario.dy = -(Main.render.mario.speed);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    Main.render.setDx(0);
    }
}
