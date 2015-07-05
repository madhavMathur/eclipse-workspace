import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class AppletTest extends java.applet.Applet {
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 22));
		for(int i = 0; i < 1000; i++) {
			try {
				new Thread();
				Thread.sleep(1000);
				g.setColor(Color.RED);
			} catch (Exception e) {
				e.printStackTrace();
			}
			g.drawLine((int)(Math.pow(i/2, 2)), 10 * i, 100/(i+1), i * 10);
			g.setColor(Color.GREEN);
		}
	}
}
