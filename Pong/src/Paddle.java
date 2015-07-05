import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class Paddle extends JPanel implements KeyListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int velocity = 0;
	public final int WIDTH = 60;
	public final int HEIGHT = 10;
	public int x_position;
	public final int Y_POSITION;
	public final int KEY_LEFT;
	public final int KEY_RIGHT;
	
	public final int frameWidth;
	public final int frameHeight;
	
	Paddle(int frameWidth, int frameHeight, int Y_POSITION, int KEY_LEFT, int KEY_RIGHT)
	{
		x_position = (frameWidth - WIDTH) / 2;
		this.Y_POSITION = Y_POSITION;
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.KEY_LEFT = KEY_LEFT;
		this.KEY_RIGHT = KEY_RIGHT;
		
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x_position, Y_POSITION, WIDTH, HEIGHT);

	}
	
	private boolean isColliding() {
		if (x_position < 0) {
			x_position = 0;
			return true;	
		}
		if (x_position > frameWidth - WIDTH) {
			x_position = frameWidth - WIDTH;
			return true;
		}		
		
		return false;
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KEY_LEFT || e.getKeyCode() == KEY_RIGHT)
			velocity = 0;	
	}
	
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
		if(isColliding())
			return;
		
		if(c == KEY_LEFT) {
			velocity = -2;
		}
		
		if(c == KEY_RIGHT) {
			velocity = 2;
		}
		
		
	}
	
	public void keyTyped(KeyEvent e) {}
}
