package metronome;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Metronome {
	
	static JPanel panel;
	
	Metronome() {
		panel = new JPanel();
		panel.setLayout(new FlowLayout());	
		panel.setBackground(Color.black);
	}	

	public static void main(String[] args) throws InterruptedException {
		new Metronome();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JLabel count = new JLabel();
		count.setForeground(Color.WHITE);
		count.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 300));
		panel.add(count);
		frame.add(panel);
		frame.setVisible(true);
		int counter = 0, totalRuns = 0;
		double BPM = Double.parseDouble(JOptionPane.showInputDialog("Enter BPM: ", "100"));
		int beats = Integer.parseInt(JOptionPane.showInputDialog("Enter time signature (__/4)", "4"));
		long delay = 0;
		long start;
		frame.setTitle("Metronome v1.2| Madhav Mathur | BPM: "+BPM+" in "+beats+"/4 time");
		count.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
		count.setText("Ready?");
		Thread.sleep(1000);
		count.setText("");
		count.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 300));
		while(true) {
			 start = System.currentTimeMillis();
	    	 panel.setBackground(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
	    	 try {
				 if(counter == beats || counter == 0) new Sound().playSoundOne();
				 else new Sound().playSoundTick();
			 } catch (UnsupportedAudioFileException e) {
				 e.printStackTrace();
			 } catch (IOException e) {
				 e.printStackTrace();
			 } catch (LineUnavailableException e) {
				 e.printStackTrace();
			 }
		     counter = (counter == beats) ? 1 : counter + 1; 
		     count.setText(""+counter);
		     totalRuns++;
		     delay = System.currentTimeMillis() - start;
		     if(totalRuns == 1) Thread.sleep((long) ((60000/BPM) + delay));
		     else Thread.sleep((long) ((60000/BPM) - delay));
		}
	}
}		