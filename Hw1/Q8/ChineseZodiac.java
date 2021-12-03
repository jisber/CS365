package hmk1.Q8;

public enum ChineseZodiac
{
    Rat(2020), Bull(2009), Tiger(2010), Rabbit(2011), Dragon(2012), Snake(2013), Horse(2014), Goat(2015), MonkeyZ(2016), Cock(2017), Dog(2018), Pig(2019);

    int year;

    ChineseZodiac(int year)
    {
        this.year = year;
    }
    static int getYear(ChineseZodiac zodiac)
    {
        return zodiac.year;
    }

}
