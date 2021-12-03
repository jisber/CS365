package hmk1.Q7;
import java.util.MissingFormatArgumentException;

public class Salary {

    public static class Person
    {
        String name;
        String salary = "null";
        String boolea = "True";
    }

    Salary (String [] args)
    {
        if(args.length % 2 != 0)
        {
            throw new MissingFormatArgumentException("Not enough arguments. Information should be input as a pair in the format of (Name:Salary)");
        }
        else if(args.length < 2)
        {
            throw new MissingFormatArgumentException("Not enough arguments, must be entered in pairs.");
        }
        else {
            double avg_salary = 0;
            String formated_salary;
            SalaryList list = new SalaryList();

            for (int i = 0; i < args.length; i++)
            {
                hmk1.Q7.Salary.Person per = new hmk1.Q7.Salary.Person();

                if (!(i % 2 == 0))
                {
                    avg_salary += Double.parseDouble(args[i]);
                    per.salary = args[i];
                    per.name = args[i - 1];
                    list.append(per);
                }
            }
            avg_salary = avg_salary / (float)(args.length / 2);

            System.out.print("Average Salary = ");
            formated_salary = String.valueOf(avg_salary);
            System.out.printf("%,.2f%n%n", Double.parseDouble(formated_salary));

            list.sort();
            list.printList(avg_salary);
        }
    }
    public static void main(String[] args)
    {
        new hmk1.Q7.Salary(args);
    }
}