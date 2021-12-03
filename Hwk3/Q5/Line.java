//Line class
import java.awt.*;
import java.awt.geom.Line2D;

public class Line extends GraphicalObject {
    int x1 = 20;
    int y1 = 20;
    int x2 = 20;
    int y2 = 20;

    Line()
    {
        int x1 = 20;
        int y1 = 20;
        int x2 = 20;
        int y2 = 20;
        color = Color.black;
    }

    //Constructor
    public Line(int x1, int y1, int x2, int y2, Color c) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = c;
    }

    //Print function
    @Override
    public String toString() {
        String x1 = Integer.toString(this.x1);
        String y1 = Integer.toString(this.y1);
        String x2 = Integer.toString(this.x2);
        String y2 = Integer.toString(this.y2);

        return "Line(" + x1 + ", " + x2 + ", " + y1 + ", " + y2 + ")";
    }

    //If the point is in the range
    @Override
    public boolean containsPt(int x, int y) {
        Line2D temp = new Line2D.Double();
        return temp.ptSegDist(x, y) <= 5;
    }

    //Draw fucntion
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
