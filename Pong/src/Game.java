
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Game extends JPanel implements ActionListener, KeyListener {
	
	public static final int HEIGHT = 500;
	public static final int WIDTH = 500;
	
	public static int PAD1_xVelocity = 0;
	public static int PAD2_xVelocity = 0;
	public boolean PAD1Colliding = false;
	public boolean PAD2Colliding = false;
	public static final int PAD_WIDTH = 60;
	public static final int PAD_HEIGHT = 10;
	public static int PAD1_xPos = (WIDTH - PAD_WIDTH) / 2;
	public static int PAD2_xPos = (WIDTH - PAD_WIDTH) / 2;
	
	public Paddle p1 = new Paddle (WIDTH, HEIGHT, 40, KeyEvent.VK_A, KeyEvent.VK_D);
	public Paddle p2 = new Paddle (WIDTH, HEIGHT, 420, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT);
	
	Timer t = new Timer(5, this);
	
	public Game() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(PAD1_xPos, 40, PAD_WIDTH, PAD_HEIGHT);
		g.setColor(Color.BLUE);
		g.fillRect(PAD2_xPos, 420, PAD_WIDTH, PAD_HEIGHT);

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pong");
		Game g = new Game();
		frame.setSize(HEIGHT, WIDTH);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(g);
		
	}
	
	private boolean isColliding() {
		if(PAD1_xPos < 0) {
			PAD1_xPos = 0;
			PAD1Colliding = true; PAD2Colliding = false;
			return true;	
		}
		if (PAD1_xPos > WIDTH - PAD_WIDTH) {
			PAD1_xPos = WIDTH - PAD_WIDTH;
			PAD1Colliding = true; PAD2Colliding = false;
			return true;
		}
		if(PAD2_xPos < 0) {
			PAD2_xPos = 0;
			PAD1Colliding = false; PAD2Colliding = true;
			return true;	
		}
		if (PAD2_xPos > WIDTH - PAD_WIDTH) {
			PAD2_xPos = WIDTH - PAD_WIDTH;
			PAD1Colliding = false; PAD2Colliding = true;
			return true;
		}
		PAD1Colliding = false; PAD2Colliding = false;
		return false;
	}
	
	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
		if(isColliding())
			return;
		
		if(c == KeyEvent.VK_A) {
			PAD1_xVelocity = -2;
		}
		
		if(c == KeyEvent.VK_D) {
			PAD1_xVelocity = 2;
		}
		
		if(c == KeyEvent.VK_LEFT) {
			PAD2_xVelocity = -2;
		}
		
		if(c == KeyEvent.VK_RIGHT) {
			PAD2_xVelocity = 2;
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_D)
			PAD1_xVelocity = 0;
		if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT)
			PAD2_xVelocity = 0;
	}

	public void actionPerformed(ActionEvent e) {
		if(!PAD1Colliding) {
			PAD1_xPos += PAD1_xVelocity;
		}
		if(!PAD2Colliding) {
			PAD2_xPos += PAD2_xVelocity;
		}
		repaint();
	}
}
