package hmk1.Q5;

public class Min {

    Min(String[] args)
    {
        String tmp = args[0];
        for(String i : args)
        {
            String test = i;
            if(tmp.compareTo(test) > 0)
                tmp = test;
        }
        System.out.println(tmp);
    }
    public static void main(String[] args)
    {
        new Min (args);
    }
}
