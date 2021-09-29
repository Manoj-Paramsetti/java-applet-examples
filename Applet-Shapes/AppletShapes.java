import java.applet.*;
import java.awt.*;

/*
<applet code="AppletShapes.class" width=350 height=300>
</applet>
*/

public class AppletShapes extends Applet {
    public void init(){
        System.out.println("App is intialized");
    }
    
    public void start(){
        System.out.println("App is started");
    }

    public void stop(){
        System.out.println("App is stopped");
    }

    public void destory(){
        System.out.println("App is destroyed");
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        // line parameters: (int x1, int y1, int x2, int y2)
        g.drawLine(20, 40, 20, 100);
        g.drawLine(20, 100, 100, 100);
        // Rectangle parameters: (int x, int y, int width, int height)
        g.drawRect(120,100,30,30);
        g.fillRect(170,100,30,30);
        // Oval parameters: (int x, int y, int width, int height)
        g.drawOval(70,200,30,30);
        g.setColor(Color.pink);
        g.fillOval(170,200,30,30);
        // Arc parameters: (int x, int y, int width, int height, int startAngle, int arcAngle)
        g.drawArc(90,150,30,30,30,160);
        g.fillArc(270,150,30,30,0,270);
    }

}
