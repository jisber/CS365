public class Edge {
    Node a, b;
    int cost;
    //Edge constructor
    Edge(Node x, Node y, int mass)
    {
        a = x;
        b = y;
        cost = mass;
    }
    //Default constructor
    Edge()
    {
        a = new Node("", 1000, false, "NOH");
        b = new Node("", 1000, false, "NOH");
        cost = 1000;
    }

}
