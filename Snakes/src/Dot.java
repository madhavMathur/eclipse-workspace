import java.awt.Color;
import java.awt.Graphics2D;


public class Dot {
	
	private Game game;
	
	private int x, y;
	private Color color;
	private int direction;
	private int diameter;
	/***
	Left: 1
	Right: -1
	Up: 2
	Down: -2
	 */
	
	public Dot(Game gamePanel, int xPos, int yPos, Color color, int heading, int diameter) {
		this.game = gamePanel;
		this.x = xPos;
		this.y = yPos;
		this.color = color;
		this.direction = heading;
		this.diameter = diameter;
	}
	
	public void forceDirection(int direction) {
		this.direction = direction;
	}
	
	public void setDirection(int index) {
		this.direction = game.snakeDots.get(index + 1).direction;
	}
	
	public void moveForward() {
		switch(direction) {
		//Left
		case 1:
			x--;
			break;
		//Right
		case -1:
			x++;
			break;
		//Up
		case 2:
			y--;
			break;
		//Down
		case -2:
			y++;
		}
	}
	
	public void paint(Graphics2D g) {
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);
	}
	
}
