import java.applet.*;
import java.awt.*;

/*
<applet code="AppletLabel.class" width=300 height=200>
</applet>
*/

public class AppletLabel extends Applet {
    Font f;
    // To run applet you need JDK 7
    // javac [FILENAME].java
    // appletviewer [FILENAME].java
    public void init(){
        f = new Font("Forte", Font.BOLD, 24);
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
        g.setFont(f);
        g.setColor(Color.BLUE);
        g.drawString("Hello, cruel world!", 35, 90);
    }
}