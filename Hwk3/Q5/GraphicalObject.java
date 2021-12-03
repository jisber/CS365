//Jacob Isber, HWK3
//GraphicalObject class
import java.awt.*;

public abstract class GraphicalObject {

    //Peram color used in every class
    Color color;

    //Sets defualt color
    public GraphicalObject()
    {
        this.color = Color.BLACK;
    }

    //Sets color
    public GraphicalObject(Color color)
    {
        this.color = color;
    }

    //Gets the color
    public Color getColor() {
        return color;
    }

    //Abstract definitions
    @Override
    public abstract String toString();

    public abstract boolean containsPt(int x, int y);

    public abstract void draw(Graphics g);
}
