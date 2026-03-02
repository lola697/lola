import java.awt.*;
import java.applet.*;
import java.util.Date;

public class Clock extends Applet implements Runnable {
    Thread t = null;

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while(true) {
            repaint();
            try { Thread.sleep(1000); }
            catch(InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(new Date().toString(), 10, 20);
    }
}