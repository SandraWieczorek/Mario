package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Render extends JPanel {
    public Rectangle Mario;
    public RedPipe pipe;
    public Block block;
    public Mario mario;
    private int dx,dy;
    private int xScene1;
    private int xScene2;
    private  int xposition, yposition;

    public Render() {
        super();
        this.xScene1 = -50;
        this.xScene2 = 750;
        this.dx = 0;
        this.xposition = -1;
        this.yposition = 360;
       // Mario = new Rectangle(100, 360,20,20);
        mario = new Mario(100,360,20,20);
        pipe = new RedPipe(200,300);
        block= new Block(300,200);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Keyboard());
        Thread thread = new Thread(new RunMario());
        thread.start();
    }

    public int getYposition() {
        return yposition;
    }

    public void setYposition(int yposition) {
        this.yposition = yposition;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setxScene1(int xScene1) {
        this.xScene1 = xScene1;
    }

    public void setxScene2(int xScene2) {
        this.xScene2 = xScene2;
    }

    public int getxScene1() {
        return xScene1;
    }

    public int getxScene2() {
        return xScene2;
    }

    public void deplacementScene()
    {
        if(this.xposition >= 0) {
           this.xposition += this.dx;
            this.xScene1 -= this.dx;
            this.xScene2 -= this.dx;
        }

        if(this.xScene1 == -800){ this.xScene1 = 800;}
        else if(this.xScene2 == -800){this.xScene2 = 800;}
        else if(this.xScene1 == 800) {this.xScene1 = -800;}
        else if(this.xScene2 == 800){ this.xScene2 = -800;}

        dy +=yposition;
    }
    public void deplacementMario()
    {
        /* if(this.yposition <=150)
            {
             this.yposition += this.dy;
            }
            else if ( this.yposition > 360 )
            {
                this.dy = 0;
                System.out.println(">360");
                //mario.setY(360);
               // yposition += dy;
            }*/


    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;
       /* if(this.mario.ContactBeforePipe(pipe) == true)
        {
            System.out.println("true");
            this.mario.setWalk(false);
            this.dx = 0;
        }*/
        this.mario.MoveMario(block);
        this.mario.Limitations();
        this.deplacementScene();
        this.deplacementMario();
        this.pipe.deplacement();

        g2.setColor(Color.BLUE);
        g2.fillRect(this.xScene1,0,800, 500);
        g2.fillRect(this.xScene2,0,800, 500);
        g2.setColor(Color.orange);
        g2.fillRect(this.xScene1, 500 -120,800,120);
        g2.fillRect(this.xScene2, 500 -120,800,120);
        g2.setColor(Color.green);
        g2.fillRect(this.xScene1, 500 -120,800,20);
        g2.fillRect(this.xScene2, 500 -120,800,20);
        g2.setColor(Color.red);
        g2.fillRect(this.pipe.getX()-this.xposition, this.pipe.getY(),this.pipe.getWidth(),this.pipe.getHeight());
        g2.setColor(Color.black);
        g2.fillRect(this.block.getX()- this.xposition, this.block.getY(),this.block.getWidth(),this.block.getHeight());
        g2.fillRect(this.xScene2, 500 -120,800,20);
        g2.setColor(Color.red);
        g2.fillRect(mario.getX(),mario.getY(),mario.getWidht(),mario.getHeight());

    }
}
