package esiea.graphism;

import java.awt.Graphics;
import java.awt.*;

import javax.swing.JFrame;

public class Square extends JFrame {
	
	private int frameWidth = 1400, frameHeight = 1000;
	
	public Square() {
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint (Graphics g) {
		//background
		g.setColor(Color.white);
		g.fillRect(0, 0, frameWidth, frameHeight);
		
		//rectangle
		g.setColor(Color.green);
		g.fillRect(400, 200, 300, 150);
		
		g.setColor(Color.blue);
		g.fillOval(150, 150, 200, 200);
		
		g.setColor(Color.green);
		g.drawRect(400, 400, 300, 150);
		
		g.setColor(Color.blue);
		g.drawOval(150, 350, 200, 200);
		
		g.setColor(Color.green);
		g.drawRect(400, 600, 150, 150);
		
		g.setColor(Color.blue);
		g.drawOval(150, 550, 150, 200);
		
		g.setColor(Color.black);
		g.drawLine(150, 650, 150, 200);
		
		
	}
}
