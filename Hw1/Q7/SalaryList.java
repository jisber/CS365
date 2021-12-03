package hmk1.Q7;

class Node
{
    Salary.Person value;
    hmk1.Q7.Node next = null;
    hmk1.Q7.Node prev = null;

    Node(Salary.Person v)
    {
        value = v;
    }
    Node()
    {
        value = null;
    }

    void printNode(double av_salary)
    {
        if (Double.parseDouble(value.salary) < av_salary)
            value.boolea = "False";
        else if (Double.parseDouble(value.salary) == av_salary)
            value.boolea = "False";

        value.salary = String.format("%,.2f", Double.parseDouble(value.salary));
        System.out.printf("%-15s %10s %s%n", value.name, value.salary, value.boolea);
    }
}
public class SalaryList {
    hmk1.Q7.Node sentinelNode;
    hmk1.Q7.Node cursor = null;
    int size = 0;

    // initialize the sentinel node
    {
        sentinelNode = new hmk1.Q7.Node();
        sentinelNode.next = sentinelNode;
        sentinelNode.prev = sentinelNode;
    }

    // helper function that inserts a new node after the
    // specified node
    void insertAfter(hmk1.Q7.Node n, Salary.Person value) {
        hmk1.Q7.Node nextNode = n.next;
        hmk1.Q7.Node newNode = new hmk1.Q7.Node(value);

        // re-link items in the forward direction
        n.next = newNode;
        newNode.next = nextNode;

        // re-link items in the reverse direction
        newNode.prev = n;
        nextNode.prev = newNode;
        size++;
    }

    public void append(Salary.Person value) {
        insertAfter(sentinelNode.prev, value);
    }

    public void prepend(Salary.Person value) {
        insertAfter(sentinelNode, value);
    }

    public Salary.Person get() {
        return cursor.value;
    }

    public boolean endOfList() {
        return cursor == sentinelNode;
    }

    public void first() {
        cursor = sentinelNode.next;
    }

    public void last() {
        cursor = sentinelNode.prev;
    }

    public void next() {
        cursor = cursor.next;
    }

    public void prev() {
        cursor = cursor.prev;
    }

    public void sort()
    {
        if(size > 1)
        {
            for (int i = 0; i < size; i++)
            {
                hmk1.Q7.Node currentNode = sentinelNode.next;
                hmk1.Q7.Node next = currentNode.next;
                for(int j = 0; j < size - 1; j++)
                {
                    if(Double.parseDouble(currentNode.value.salary) > Double.parseDouble(next.value.salary))
                    {
                        String tmp1 = currentNode.value.name;
                        String tmp2 = currentNode.value.salary;
                        currentNode.value.name = next.value.name;
                        currentNode.value.salary = next.value.salary;
                        next.value.name = tmp1;
                        next.value.salary = tmp2;
                    }
                    currentNode = next;
                    next = next.next;
                }
            }
        }
    }

    public void printList(double avg_salary)
    {
        hmk1.Q7.Node temp = sentinelNode.next;
        while(temp.value != null)
        {
            temp.printNode(avg_salary);
            temp = temp.next;
        }
    }
}
