package esiea.graphism;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import esiea.graphism.VariablesBoules;

public class PolygonObject extends Applet {

	int [] x = {400,300,100,300,400,500,700,500};
	int [] y = {700,500,400,300,100,300,400,500};
	
	int [] x1 = {400,300,150,300,400,500,650,500};
	int [] y1 = {650,500,400,300,150,300,400,500};
	
	public int apvw,apvh;
	
	public void init() {
		
		super.init();
		this.setSize(800,800);
		apvw = this.getWidth();
		apvh = this.getHeight();
	}
	
	public void paint(Graphics g) {
		VariablesBoules theRandom = new VariablesBoules();
		int numBoule;
		
		
		
		//g.setColor(Color.blue);
		//g.fillPolygon(x,y,8);
		
		numBoule = theRandom.EtoileRandom();
		Color myBlue = new Color(0,0,numBoule*20);
		Color theBlue = new Color(0,0,12*20);
		g.setColor(theBlue);
		g.fillPolygon(x,y,8);
		g.setColor(myBlue);
		g.fillPolygon(x1,y1,8);
		g.setColor(Color.black);
		g.drawString("Etoile 2 -> " + numBoule + "", 500, 650);
	}
	

	
}