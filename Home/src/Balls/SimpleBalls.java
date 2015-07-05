package Balls;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
/*
 * Author : Madhav Mathur
 */
public class SimpleBalls {
	
    public static void main(String[] args) {
        new SimpleBalls();
    }

    public SimpleBalls() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch(Exception e) {
                	e.printStackTrace();
                }

                JFrame frame = new JFrame("Planet Crusher (Beta v1.0.1) | Madhav Mathur");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                Balls balls = new Balls();
                frame.add(balls);
                frame.setSize(1350, 750);
                frame.setVisible(true);
                new Thread((Runnable) new BounceEngine(balls)).start();

            }
        });
    }

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }
}