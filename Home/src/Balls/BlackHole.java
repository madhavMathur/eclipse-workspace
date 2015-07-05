package Balls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;

public class BlackHole {
	
	private Color color = Color.BLACK;
    private Point location;
    private Dimension size;
    public final int MASS = 100;
    
    public BlackHole(Dimension d, Point p) {
    	this.size = d;
    	this.location = p;
    }
    
    public Dimension getSize() {
        return size;
    }
    
    public void setSize(int w, int h) {
    	this.size = new Dimension(w, h);
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    protected void paint(Graphics2D g2d) {
        Point p = getLocation();
        if (p != null) {
            g2d.setColor(color);
            Dimension size = getSize();
            g2d.fillOval(p.x, p.y, size.width, size.height);
        }
    }
}
