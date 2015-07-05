import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
	
	private static final String VERSION = "1.0";
	static LinkedList<Dot> snakeDots = new LinkedList<Dot>();
	static Dot snakeHead, snakeTail;
	static JFrame frame;
	
	Game() {
		frame.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}		
		    public void keyReleased(KeyEvent e) {
			    
		    }
		    public void keyPressed(KeyEvent e) {
			    if(e.getKeyCode() == e.VK_LEFT) {
			    	snakeHead.forceDirection(1);
			    }
			    else if(e.getKeyCode() == e.VK_RIGHT) {
			    	snakeHead.forceDirection(-1);
			    }
			    else if(e.getKeyCode() == e.VK_UP) {
			    	snakeHead.forceDirection(2);
			    }
			    else if(e.getKeyCode() == e.VK_DOWN) {
			    	snakeHead.forceDirection(-2);
			    }
			    
		    }
		});
		setFocusable(true);
		for(int i = 0; i < 10; i++) {
			snakeDots.push(new Dot(this, 10, 10+(i*10), Color.RED, -2, 10));
		}
		
		snakeHead = snakeDots.get(0);
		snakeTail = snakeDots.get(snakeDots.size() - 1);
	}
	
	private static void moveSnakeForward() {
		for(Dot a : snakeDots) {
			a.moveForward();
			if(snakeDots.indexOf(a) != 0)
				a.setDirection(snakeDots.indexOf(a));
		}
 	}
	
	public void paint(Graphics g) {
		 super.paint(g);
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		 for(Dot a : snakeDots) {
			 a.paint(g2d);
		 }
	}
	
	public static void main(String[] args) throws InterruptedException {
		Game game = new Game();
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		while(true) {
			moveSnakeForward();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
