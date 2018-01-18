package com.company;

import java.awt.*;

public class Mario extends Characters
{
    public int dy;//yMotion
    private int xposition;
    public int speed;
    public Mario(int x, int y, int widht, int height) {
        super(x, y, widht, height);
        this.xposition = -1;
        this.dy = 0;
    }

    public void MoveMario(Object object)
    {


            if(Main.render.mario.getY()  < object.getY() && Main.render.mario.getX() >= object.getX()-5 &&  Main.render.mario.getX()<= object.getX()+object.getWidth() )
            {
                Main.render.mario.setY(object.getY()-20);
              //  Mario.y = object.y-20;
                dy = speed;
                dy = 0;
                //up =  true;
               // down = true;
                System.out.println("1");
               // jump = true;

            }
            else if(Main.render.mario.getY() <= object.getY() &&(Main.render.mario.getX() < object.getX()+5 || Main.render.mario.getX() > object.getX() + object.getWidth()))
            {
                dy = 0;
                dy =speed;
                System.out.println("2");
            }
            else if(Main.render.mario.getY() <= object.getY()+30 && Main.render.mario.getX() > object.getX() && Main.render.mario.getX() < object.getX()+object.getWidth() )
            {
                dy = 0;
                dy = speed;
                //down = true;
               // up = true;
                System.out.println("3");
               // jump = true;
                // if(Mario.x<=column.x+20) narrows.remove(0);
                //narrows.clear();
            }


        Main.render.mario.setY(Main.render.mario.getY()+dy);
    }

    public void Limitations()
    {
        if ( Main.render.mario.getY() >  360 )
        {
            Main.render.mario.setY(360);
            dy = 0;
        }

        if(Main.render.mario.getX()  < 0) Main.render.mario.setX(0);
        if(Main.render.mario.getY()  <= 150)
        {
            dy = speed;
           //p = true;
        }

    }


}
