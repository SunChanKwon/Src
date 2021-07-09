package Data0709Event;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MouseAdapterTest2 extends JFrame {


    MyCanvas mc =new MyCanvas();
    public MouseAdapterTest2(){
        add(mc);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mc.addMouseListener(new CanvasAdapterTest(mc));
    }
    public class MyCanvas extends Canvas{
        int x, y;
        public void paint(Graphics g)
        {
            Random ran = new Random();
            g.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
            g.fillOval(x-25,y-25,50,50);
        }
        public void update(Graphics g){
            paint(g);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterTest2();
    }
}
