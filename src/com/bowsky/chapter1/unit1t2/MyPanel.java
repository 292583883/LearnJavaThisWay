package com.bowsky.chapter1.unit1t2;
import java.awt.*;

/**
 * 画板
 * Created by Administrator on 2016/4/13.
 * @author yzl
 */
public class MyPanel extends Panel{
    /**
     * 测试方法
     */
    public void aaa()
    {

    }

    /**
     * 重载画图方法
     * @param graphics
     */
    @Override
    public void paint(Graphics graphics)
    {
        graphics.setColor(Color.blue);//设置画笔
        graphics.fillOval(80,120,150,240);//填充图片
        graphics.setColor(Color.red);
        graphics.drawLine(30,30,100,100);//画直线(x,y)->(x1,y1)
        graphics.draw3DRect(110,110,10,10,true);//画3d图形
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(300, 400);
        MyPanel myPanel = new MyPanel();
        frame.add(myPanel);
        frame.show();
    }

}
