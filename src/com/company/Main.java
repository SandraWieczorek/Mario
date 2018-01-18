package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static int Window_WIDTH = 800;
    public static int Window_HEIGHT = 500;
    public static Render render;
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
       // Timer timer = new Timer(20,this);
        //narrow = new Narrows();
       // Mario = new Rectangle(Window_WIDTH/2-300, Window_HEIGHT,20,20);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(Window_WIDTH, Window_HEIGHT);
        jframe.setTitle("Super Mario Bross");
        jframe.setLocationRelativeTo(null);
        jframe.setAlwaysOnTop(true);
        jframe.setResizable(false);


        render = new Render();
        jframe.setContentPane(render);
        jframe.setVisible(true);
    }
}
