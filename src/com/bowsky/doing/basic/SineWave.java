package com.bowsky.doing.basic;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


/**
 * @author Administrator
 */
public class SineWave
{
    /**
     * @param args
     *            a
     */
    public static void main(String[] args)
    {
        SineFrame f = new SineFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}


/**
 * 定义一个SineFrame 标题:SineTest 宽:640,高480
 */
class SineFrame extends JFrame
{
    /**
     * 宽
     */
    public static final int WIDTH = 640;

    /**
     * 高
     */
    public static final int HEIGHT = 480;

    SineFrame()
    {
        setTitle("SineTest");
        setSize(WIDTH, HEIGHT);

        Container contentPane = getContentPane();
        contentPane.add(new SinePanel());
    }
}


/**
 * 定义一个现实正弦的面板 起点(5,240) 宽6 不模拟
 */
class SinePanel extends JPanel
{
    /**
     * x
     */
    double x;
    /**
     * y
     */
    double y;
    /**
     * old_x
     */
    double old_x;
    /**
     * old_y
     */
    double old_y;

    double ul_y;

    double w, h;

    boolean analog;

    SinePanel()
    {
        old_x = 5;
        old_y = 240;
        w = 6;
        analog = true;

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(new Line2D.Double(0, 240, 640, 240));// 画一根水平线,起始点坐标,终点坐标
        for (x = 5; x < 635; x++ )
        {
            y = 240 + 60 * Math.sin((x - 30) / 45);
            if ((analog || x % 6 == 0))// 间隔
            {
                if (analog)
                {
                    if (old_x < x)
                    {
                        g2.draw(new Line2D.Double(old_x, old_y, x, y));
                    }
                    old_x = x;
                    old_y = y;
                }
                else
                {
                    if (y < 240)
                    {
                        ul_y = y;
                        h = 240 - y;
                    }
                    else
                    {
                        ul_y = 240;
                        h = y - 240;
                    }
                    g2.draw(new Rectangle2D.Double(x - 2, ul_y, w, h));
                }
            }
        }
    }
}