import java.util.ArrayList;

public class Node {
    String name;
    int id;
    boolean visted = false;
    boolean isHome = false;
    String type;
    ArrayList<Edge> edges = new ArrayList<Edge>();
    //Constructor
    Node(String n, int ident, boolean tf, String ty)
    {
        name = n;
        id = ident;
        isHome = tf;
        type = ty;
    }

}
