package hmk1.Q6;

import java.util.MissingFormatArgumentException;

public class Salary {

    public static class Person
    {
        String name;
        String salary = "null";
        String boolea = "True";
    }
    Salary(String[] args){
        
        if(args.length % 2 != 0)
        {
            throw new MissingFormatArgumentException("Not enough arguments. Information should be input as a pair in the format of (Name:Salary)");
        }
        else if(args.length < 2)
        {
            throw new MissingFormatArgumentException("Not enough arguments");
        }
        else {
            double avg_salary = 0;
            String formated_salary;
            int counter = 0;
            Person [] perArray = new Person[args.length / 2];

            for (int i = 0; i < args.length; i++)
            {
                Person per = new Person();
                if (!(i % 2 == 0))
                {
                    avg_salary += Double.parseDouble(args[i]);
                    per.salary = args[i];
                    per.name = args[i - 1];
                    perArray[counter] = per;
                    counter++;
                }
            }
            avg_salary = avg_salary / (float)(args.length / 2);

            System.out.print("Average Salary = ");
            formated_salary = String.valueOf(avg_salary);
            System.out.printf("%,.2f%n%n", Double.parseDouble(formated_salary));

            for (int i = 0; i < (args.length / 2); i++) {
                Person temp = perArray[i];
                if (Double.parseDouble(temp.salary) < avg_salary)
                    temp.boolea = "False";
                else if (Double.parseDouble(temp.salary) == avg_salary)
                    temp.boolea = "False";

                temp.salary = String.format("%,.2f", Double.parseDouble(temp.salary));
                System.out.printf("%-15s %10s %s%n", temp.name, temp.salary, temp.boolea);
            }
        }
    }
    public static void main(String[] args)
    {
        new Salary (args);
    }
}

