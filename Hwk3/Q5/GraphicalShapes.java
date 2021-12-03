//Shapes class that'll help aid in diversifying the functions
import java.awt.*;

public class GraphicalShapes extends GraphicalObject {
    int left;
    int top;
    int width;
    int height;

    //Calls super to construct
    public GraphicalShapes()
    {
        super();
    }

    //Override toString function so the shapes classes can use it
    @Override
    public String toString() {
        return null;
    }

    //Override to check if point is on
    @Override
    public boolean containsPt(int x, int y) {
        return false;
    }

    //Ovveride draw function
    @Override
    public void draw(Graphics g) {

    }

    //Default constructor
    public GraphicalShapes(int left, int top, int width, int height, Color color)
    {
        super(color);
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    //Getter and setters 44 - 71
    public int getLeft() { return left; }

    public int getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
