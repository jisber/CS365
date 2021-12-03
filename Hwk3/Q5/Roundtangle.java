//Roundtangle class
import java.awt.*;

public class Roundtangle extends  GraphicalShapes {

    //Enum to support arcsize
    public enum Arcsize
    {
        SMALL(10),
        MEDIUM(20),
        LARGE(30);

        int size;

        Arcsize(int size)
        {
            this.size = size;
        }

        public int getSize() {
            return this.size;
        }


    }

    int size = Arcsize.MEDIUM.getSize();

    //Default Constructor
    public Roundtangle()
    {
        left = 0;
        top = 0;
        width = 20;
        height =20;
        color = Color.BLACK;

    }

    //Constructor
    public Roundtangle(int left, int top, int width, int height, Color c, int arcsize) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.color = c;
        size = arcsize;
    }

    //Print function
    @Override
    public String toString() {
        String left = Integer.toString(this.left);
        String top = Integer.toString(this.top);
        String width = Integer.toString(this.width);
        String height = Integer.toString(this.height);
        String size;
        //Checks
        if(this.size == 10 || this.size == 20 || this.size == 30 )
            size = Arcsize.values()[this.size / 10 - 1].toString();
        else
            size = Integer.toString(this.size);

        return "Roundtangle(" + left + ", " + top + ", " + width + ", " + height + ", " + size + ")";

    }

    //Checks if point is in the range
    @Override
    public boolean containsPt(int x, int y) {
        int temp = top + height;
        return top <= y && y >= temp;
    }

    //Draw function
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRoundRect(left, top, width, height, size, size);
    }
}
