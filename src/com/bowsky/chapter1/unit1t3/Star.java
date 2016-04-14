package com.bowsky.chapter1.unit1t3;


import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Graphics;



/**
 * Star on the sky Created by leye on 16/4/15.
 * @author yzl
 */
public class Star
{
    /**
     * 测试
     * @param args 默认参数
     */
    public static void main(String[] args)
    {
        Frame w = new Frame();
        w.setSize(1024, 768);
        w.setBackground(Color.black);
        MyPanel mp = new MyPanel();
        w.add(mp);
        w.show();

    }
}


class MyPanel extends Panel
{
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.white);
        for (int i = 0; i < 100; i++ )
        {

            g.drawString("*", (int)(1024 * Math.random()), (int)(768 * Math.random()));
        }
    }
}
