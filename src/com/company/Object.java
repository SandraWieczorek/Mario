package com.company;

public class Object {
    private  int width;
    private  int height;
    private int x,y;
    public Object(int x,int y, int width,int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void deplacement()
    {
        if(Main.render.getXposition() >= 0 )
        {
            this.x-= Main.render.getDx();
        }
    }
}

