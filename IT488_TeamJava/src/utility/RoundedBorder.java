package utility;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.border.Border;

public class RoundedBorder implements Border {
	
	private int radius;
	
	public RoundedBorder(int radius) {
		this.radius = radius;
	}
	
	public Insets getBorderInsets(Component c) {
		return new Insets(this.radius + 1, this.radius + 1, this.radius + 1, this.radius);
	}
	
	public boolean isBorderOpaque() {
		return true;
	}
	
	public void paintBorder(Component c, Graphics pG, int x, int y, int width, int height) {
		final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
	}
	
} // EOF
