package Balls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
/*
 * Author : Madhav Mathur
 */
public class Ball {

    private Color color;
    private Point location;
    private Dimension size;
    private Point speed;
    public final int RADIUS = 1;
    public final int MASS = RADIUS;

    public Ball(Color color) {
        setColor(color);
        speed = new Point(10 - SimpleBalls.random(20), 10 - SimpleBalls.random(20));
        size = new Dimension(RADIUS, RADIUS);
    }
    
    public Ball(Color color, Point location, Dimension size) {
    	setColor(color);
    	this.location = location;
    	this.speed = new Point(0, 0);
    	this.size = size;
    }
    
    public Dimension getSize() {
        return size;
    }
    
    public void setSize(int w, int h) {
    	this.size = new Dimension(w, h);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public Point getLocation() {
        return location;
    }

    public Point getSpeed() {
        return speed;
    }

    public void setSpeed(Point speed) {
        this.speed = speed;
    }

    protected void paint(Graphics2D g2d) {
        Point p = getLocation();
        if (p != null) {
            g2d.setColor(getColor());
            Dimension size = getSize();
            g2d.fillOval(p.x, p.y, size.width, size.height);
        }

    }
}