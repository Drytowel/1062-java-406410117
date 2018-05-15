package painter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval extends Shape{

	public Oval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
		
	}

	public Oval(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled) {
		super(x1, y1, x2, y2, color, color2, filled);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//g2d.setPaint(color);
		GradientPaint gpaint = new GradientPaint(55, 80, color, 200, 300, color2, true);
		g2d.setPaint(gpaint);
		g2d.setStroke(new BasicStroke(10.0f));
		if(filled){
			g2d.fillOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}else{
			g2d.drawOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}
		
	}

}
