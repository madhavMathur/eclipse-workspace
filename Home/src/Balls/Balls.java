package Balls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * Author : Madhav Mathur
 */
public class Balls extends JPanel implements MouseListener {

    private List<Ball> ballsUp;
    private List<Ball> bombs;
    public JCheckBox sound;
    private boolean soundOn;
    
    public int maxBombs = 100;

    public Balls() {
    	requestFocus();
    	this.setBackground(Color.BLACK);
        ballsUp = new CopyOnWriteArrayList<Ball>();

        for (int index = 0; index < 5000; index++) {
            ballsUp.add(new Ball(new Color(SimpleBalls.random(255), SimpleBalls.random(0), SimpleBalls.random(0))));
        }
        bombs = new CopyOnWriteArrayList<Ball>();
        addMouseListener(this);
        sound = new JCheckBox("Sound?");
        sound.setSelected(true);
        sound.setFocusable(false);
        add(sound);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        g.drawString("DESTROY THE PLANETS, ASAP!", 800, 50);
        g.drawString("Planets : " + ballsUp.size() + "| Black Holes : " + bombs.size() + "/" + maxBombs, 50, 50);
        for (Ball ball : ballsUp) {
            ball.paint(g2d);
        }
        for (Ball ball : bombs) {
        	ball.paint(g2d);
        }
        g2d.dispose();
    }

    public List<Ball> getBalls() {
        return ballsUp;
    }
    
    public List<Ball> getBombs() {
    	return bombs;
    }
    
    public void removeBall(Ball b) {
    	ballsUp.remove(b);
    }

	public void mouseClicked(MouseEvent e) {
		if(bombs.size() < maxBombs) {
			int x = e.getX();
			int y = e.getY();
			bombs.add(new Ball((Color.BLACK), new Point(x, y), new Dimension(100, 100)));
		}
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}