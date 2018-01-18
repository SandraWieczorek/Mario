package com.company;

public class RunMario implements Runnable {
    private final int PAUSE = 3;
    @Override
    public void run() {

        while(true){
            Main.render.repaint();
            try
            {
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}

