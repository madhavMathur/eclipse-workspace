import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
	
	// Ball particle values
	int x = getWidth() / 2;
	int y = getHeight() / 2;
	final int BALL_SPEED = 5;
	int xAcc = -BALL_SPEED;
	int yAcc = BALL_SPEED;
	int diameter = 12;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		this.setBackground(Color.red);
		g.setColor(Color.BLACK);
		g.fillOval(x, y, diameter, diameter);
		g.setColor(Color.RED);
		g2.fillOval(x + 10, y + 10,(int) Math.sin(x), (int) Math.sin(y));
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame window = new JFrame("Pinball");
		Game game = new Game();
		window.add(game);
		window.setSize(500, 500);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Game loop
		boolean running = true;
		while(running) {
			game.moveBall();
			game.repaint();
			Thread.sleep(20);
		}
	}

	void moveBall() {
		
		if (x + xAcc < 0)
			xAcc = BALL_SPEED;
		if (x + xAcc > getWidth() - 10)
			xAcc = -BALL_SPEED;
		if (y + yAcc < 0)
			yAcc = BALL_SPEED;
		if (y + yAcc > getHeight() - 10)
			yAcc = -BALL_SPEED;
		
		x += xAcc;
		y += yAcc;
	}
}