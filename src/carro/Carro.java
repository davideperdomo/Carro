
package carro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Usuario16
 */
public class Carro {
    public int x;
    public int y;

    public Carro() {
        this.x = 10;
        this.y = 10;
    }

    public int getX() { return x;}

    public void setX(int x) {this.x = x;}
    
    public void dibujar(Graphics g){
        g.fillOval(10+x, 29+y, 10, 10);
        g.fillOval(30+x, 29+y, 10, 10);
        g.setColor(Color.CYAN);
        g.fillRect(0+x, 20+y, 50, 10);
        int x1[] = {10+x,20+x,30+x,40+x};
        int y1[] = {20+y,10+y,10+y,20+y};
        g.setColor(Color.blue);
        g.fillPolygon(x1, y1, x1.length);
        g.setColor(Color.black);
        g.drawRect(0+x, 20+y, 50, 10);
        g.setColor(Color.white);
        g.drawRect(0+x,10+y,50,30);
    }
    
    public void movimiento(KeyEvent e){
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 5; break;
            case KeyEvent.VK_UP: y -= 5; break;
            case KeyEvent.VK_LEFT: x -= 5; break;
            case KeyEvent.VK_RIGHT: x += 5; break;
          }
    }
    
    public Rectangle getcarro(){
        return new Rectangle(x,10+y,50,30);  
    }
}