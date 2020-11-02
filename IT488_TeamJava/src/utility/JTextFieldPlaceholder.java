package utility;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextFieldPlaceholder extends JTextField {
	
	/* placeholder text */
    private String placeholder;
    
    /* constructor */
    public JTextFieldPlaceholder() {}
    
    /* constructor with text (not placeholder) */
    public JTextFieldPlaceholder(final String pText) {
        super(pText);
    }
    
    /* getter n setter */
    public String getPlaceholder() { return placeholder; }
    public void setPlaceholder(final String s) { placeholder = s;}
    
    /* this is the magic, setColor is important */
    @Override
    protected void paintComponent(final Graphics pG) {
        super.paintComponent(pG);
        /* start the graphic */
        final Graphics2D g = (Graphics2D) pG;
        /* rendering hint may be overkill for drawing text */
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(placeholder != null && placeholder.length() != 0 && getText().length() == 0) {
        	/* the color of the placeholder text */
            g.setColor(new Color(0.4f, 0.4f, 0.4f));
            /* draw the placeholder on the background */
            g.drawString(placeholder, getInsets().left, g.getFontMetrics().getMaxAscent() + getInsets().top);
        }
    } /* paintComponent */
    
} /* EOF */
