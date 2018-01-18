package com.company;

import java.awt.*;

public class Mario extends Characters
{
    public int dy;//yMotion
    private int xposition;
    public int speed;
    private boolean jump;
    public Mario(int x, int y, int widht, int height) {
        super(x, y, widht, height);
        this.xposition = -1;
        this.dy = 0;
        jump = false;
    }

    public boolean isJump() {
        return jump;
    }

    @Override
    public boolean isRight() {
        return super.isRight();
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public void Limitations()
    {

    }
    public void CanJump()
    {
        if(this.isJump() == true)
        {
            dy= speed;
            Main.render.mario.setY(Main.render.mario.getY()+dy);
            if(Main.render.mario.getY() >= 200)
            {
                dy =-speed;
                Main.render.mario.setY(Main.render.mario.getY()+dy);
            }
        }
    }


}
