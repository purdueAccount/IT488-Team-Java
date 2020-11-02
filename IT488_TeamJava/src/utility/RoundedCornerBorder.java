package utility;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Objects;

import javax.swing.JPopupMenu;
import javax.swing.border.AbstractBorder;

@SuppressWarnings("serial")
public class RoundedCornerBorder extends AbstractBorder {
    
    protected static final int ARC = 12;
    private int top = 4;
    private int right = 8;
    private int bottom = 4; 
    private int left = 8;

    /* constructor */
    public RoundedCornerBorder() {}
    
    /* constructor */
    public RoundedCornerBorder(int t, int r, int b, int l) {
        top = t;
        right = r;
        bottom = b; 
        left = l;
    }
    
    @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        int r = ARC;
        int w = width  - 1;
        int h = height - 1;

        Area round = new Area(new RoundRectangle2D.Float(x, y, w, h, r, r));
        if (c instanceof JPopupMenu) {
            g2.setPaint(c.getBackground());
            g2.fill(round);
        } else {
            Container parent = c.getParent();
            if (Objects.nonNull(parent)) {
                g2.setPaint(parent.getBackground());
                Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
                corner.subtract(round);
                g2.fill(corner);
            }
        }
        g2.setPaint(c.getForeground());
        g2.draw(round);
        g2.dispose();
    }
    
    @Override public Insets getBorderInsets(Component c) {
        return new Insets(top, right, bottom, left);
    }
    
    @Override public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(top, right, bottom, left);
        return insets;
    }
    
} /* EOF */
