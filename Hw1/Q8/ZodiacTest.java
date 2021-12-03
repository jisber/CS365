package hmk1.Q8;

public class ZodiacTest {
    ZodiacTest(String [] args)
    {
        ChineseZodiac year;
        year = ChineseZodiac.Rabbit;
        System.out.print("The last year of the " + year + " occured in ");
        System.out.println(ChineseZodiac.getYear(year));

        for(ChineseZodiac zodiac : ChineseZodiac.values())
            System.out.println("The year of the " + zodiac + " last occurred in " + ChineseZodiac.getYear(zodiac));
    }
    public static void main(String[] args)
    {
        new ZodiacTest(args);
    }
}