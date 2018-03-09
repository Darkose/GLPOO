package figuresGeo;

import java.applet.Applet;
import java.awt.*;

import javax.swing.JFrame;
import figuresGeo.VariablesBoules;

public class TestFigures extends Applet {
	
	int [] x = {300,400,450,500,600,500,450,400};
	int [] y = {500,450,350,450,500,550,650,550};
	
	int [] x2 = {325,400,450,500,575,500,450,400};
	int [] y2 = {500,450,375,450,500,550,625,550};
	
	int [] x1 = {325,410,450,490,575,490,450,410};
	int [] y1 = {500,460,375,460,500,540,625,540};
	
	
	private int frameWidth = 1400, frameHeight = 1000;
	
	/*public TestFigures() {
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}*/
	
	public int apvw,apvh;
	
	public void init() {
		
		super.init();
		this.setSize(1400,1000);
		apvw = this.getWidth();
		apvh = this.getHeight();
	}
	
	public void paint (Graphics g) {
		
		VariablesBoules theRandom = new VariablesBoules();
		int numBoule;
		
		//background
		g.setColor(Color.white);
		g.fillRect(0, 0, frameWidth, frameHeight);
		
		//Boule1
		g.setColor(Color.green);
		g.drawRect(50, 50, 200, 200);
		numBoule = theRandom.GenRandom();
		g.fillRect(50, 50, numBoule*4, numBoule*4);
		g.setColor(Color.black);
		g.drawString("Boule 1 -> " + numBoule + "", 100, 300);
		
		//Boule2
		g.setColor(Color.blue);
		g.drawRect(300, 50, 200, 200);
		numBoule = theRandom.GenRandom();
		g.fillRect(300, 50, numBoule*4, numBoule*4);
		g.setColor(Color.black);
		g.drawString("Boule 2 -> " + numBoule + "", 350, 300);
		
		//Boule3
		g.setColor(Color.red);
		g.drawRect(550, 50, 200, 200);
		numBoule = theRandom.GenRandom();
		g.fillRect(550, 50, numBoule*4, numBoule*4);
		g.setColor(Color.black);
		g.drawString("Boule 3 -> " + numBoule + "", 600, 300);
		
		//Boule4
		g.setColor(Color.black);
		g.drawRect(800, 50, 200, 200);
		numBoule = theRandom.GenRandom();
		g.fillRect(800, 50, numBoule*4, numBoule*4);
		g.setColor(Color.black);
		g.drawString("Boule 4 -> " + numBoule + "", 850, 300);
		
		//Boule5
		g.setColor(Color.pink);
		g.drawRect(1050, 50, 200, 200);
		numBoule = theRandom.GenRandom();
		g.fillRect(1050, 50, numBoule*4, numBoule*4);
		g.setColor(Color.black);
		g.drawString("Boule 5 -> " + numBoule + "", 1100, 300);
		
		//Etoile1
		numBoule = theRandom.EtoileRandom();
		Color myRed = new Color(numBoule*20,0,0);
		Color theRed = new Color(12*20,0,0);
		g.setColor(theRed);
		g.fillOval(40, 390, 220, 220);
		g.setColor(myRed);
		g.fillOval(50, 400, 200, 200);
		g.setColor(Color.black);
		g.drawString("Etoile 1 -> " + numBoule + "", 100, 650);
		
		//Etoile1
		
		numBoule = theRandom.EtoileRandom();
		Color myBlue = new Color(0,0,numBoule*20);
		Color theBlue = new Color(0,0,12*20);
		g.setColor(theBlue);
		g.fillPolygon(x,y,8);
		g.setColor(myBlue);
		g.fillPolygon(x1,y1,8);
		g.setColor(Color.black);
		g.drawString("Etoile 2 -> " + numBoule + "", 500, 650);
		
		//Comments
		g.drawString("La taille d'une boule est de maximum 50. Plus la valeur d'une boule est �lev�e plus le carr� sera grand", 700, 400);
		g.drawString("La taille d'une �toile est de maximum 12. Plus la valeur d'une �toile est �lev�e plus elle s'assombrit", 700, 500);

		
		/*
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
		g.drawLine(150, 650, 150, 200); */
		
		
	}
}