//Text Class
import java.awt.*;

public class Text extends  GraphicalShapes {

    String str;

    public Text()
    {
        left = 0;
        top = 0;
        width = 20;
        height =20;
        color = Color.BLACK;
        str = "";
    }

    //Constructor
    public Text(int left, int top, Color c, String label) {
        this.left = left;
        this.top = top;
        this.color = c;
        this.str = label;
        this.height = 16;
        this.width = 7;
    }

    //Print function
    @Override
    public String toString() {
        String left = Integer.toString(this.left);
        String top = Integer.toString(this.top);
        String width = Integer.toString(this.width);
        String height = Integer.toString(this.height);

        return "Text(" + left + ", " + top + ", " + width + ", " + height + ")";
    }

    //Returns true if point is in text
    @Override
    public boolean containsPt(int x, int y) {
        int temp = top + height;
        return top <= y && y >= temp;
    }

    //Draw function
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawString(str, left, top);
    }
}
