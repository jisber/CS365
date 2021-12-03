//Rectangle class
import java.awt.*;

public class Rectangle extends  GraphicalShapes {
    //Default constructor
    public Rectangle()
    {
        left = 0;
        top = 0;
        width = 20;
        height =20;
        color = Color.BLACK;
    }

    //Constructor
    public Rectangle(int left, int top, int width, int height, Color color)
    {
        super(left, top, width, height, color);
    }

    //Print function
    @Override
    public String toString() {
        String left = Integer.toString(this.left);
        String top = Integer.toString(this.top);
        String width = Integer.toString(this.width);
        String height = Integer.toString(this.height);

        return "Rectangle(" + left + ", " + top + ", " + width + ", " + height + ")";
    }

    //Returns true if the point is in range
    @Override
    public boolean containsPt(int x, int y) {
        int temp = top + height;
        return top <= y && y >= temp;
    }

    //Draw function
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(left, top, width, height);
    }
}
