package com.company;

public class Characters {
    private int widht;
    private int height;
    private int x,y;
    public int counter;
    private  boolean walk;
    private boolean right;
    public Characters(int x,int y,int widht,int height)
    {
        this.x = x;
        this.y = y;
        this.widht = widht;
        this.height = height;
        this.right = true;
        this.counter = 0;
        this.walk = false;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
    }

    public boolean isRight() {
        return right;
    }

    public int getCounter() {
        return counter;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean ContactBeforePipe(Object object)
    {
        if(!(this.x+this.widht < object.getX() || this.x+ this.widht > object.getX() || this.y + this.height <= object.getX() ||  this.y >= object.getY() + object.getHeight()))
        {
            return false;
        }
        else return true;
    }
    public void Contact(Object object)
    {
        if(this.x+20 >= object.getX())
        {

            this.x = object.getX();
           // Main.render.setxScene1(object.getX());
        }
    }
}
