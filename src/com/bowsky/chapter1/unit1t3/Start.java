package com.bowsky.chapter1.unit1t3;

import java.awt.*;

/**
 * Start on the sky
 * Created by leye on 16/4/15.
 */
public class Start {
    public static void main(String[] args) {
        Frame w = new Frame();
        w.setSize(1024,768);
        w.setBackground(Color.black);
        MyPanel mp = new MyPanel();
        w.add(mp);
        w.show();

    }
}
class MyPanel extends  Panel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        for(int i=0; i<100; i++){

            g.drawString("*",(int)(1024*Math.random()),(int)(768*Math.random()));
        }
    }
}

