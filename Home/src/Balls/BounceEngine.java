package Balls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.SwingUtilities;
/*
 * Author : Madhav Mathur
 */
public class BounceEngine implements Runnable {

    private Balls parent;
    private boolean soundOn;

    public BounceEngine(Balls parent) {
        this.parent = parent;
    }

    public void run() {

        int width = getParent().getWidth();
        int height = getParent().getHeight();

        // Randomize the starting position...
        for (Ball ball : getParent().getBalls()) {
            int x = SimpleBalls.random(width);
            int y = SimpleBalls.random(height);

            Dimension size = ball.getSize();

            if (x + size.width > width) {
                x = width - size.width;
            }
            if (y + size.height > height) {
                y = height - size.height;
            }

            ball.setLocation(new Point(x, y));

        }

        while (getParent().isVisible()) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    getParent().repaint();
                }
            });

            for (Ball ball : getParent().getBalls()) {
                move(ball);
                if(getParent().sound.isSelected())
                	soundOn = true;
                else
                	soundOn = false;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {}
        }

    }

    public Balls getParent() {
        return parent;
    }

    public void move(Ball ball) {

        Point p = ball.getLocation();
        Point speed = ball.getSpeed();
        Dimension size = ball.getSize();

        int vx = speed.x;
        int vy = speed.y;

        int x = p.x;
        int y = p.y;

        if (x + vx < 0 || x + size.width + vx > getParent().getWidth()) {
            vx *= -1;
           // ball.setColor(Color.RED);
        }
        if (y + vy < 0 || y + size.height + vy > getParent().getHeight()) {
            vy *= -1;
           // ball.setColor(Color.RED);
        }
        // Elastic Collision
        for(Ball b : parent.getBombs()) {
        	if(b.getLocation().distance(p) < 10) {
        		getParent().getBalls().remove(ball);
        		
        	}
        }
        x += vx;
        y += vy;

        ball.setSpeed(new Point(vx, vy));
        ball.setLocation(new Point(x, y));

    }
}