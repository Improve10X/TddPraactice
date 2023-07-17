package TddFibonacci.converttoagetodays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertsAgeToDaysTest {
    @Test
    public void nothing(){

    }
    /*
    calculate(65) --> 23725
    calculate(0) --> 0
    calculate(20) --> 7300

     */

    @Test
    public void givenAgeInYears_returnAgeDays(){
        ConvertAgeInYears convertAgeInYears = new ConvertAgeInYears();
        int age = convertAgeInYears.CaltAge(65);
        assertEquals(23725,age);
    }
    @Test
    public void givenAgeInYearsIsZero_returnAgeDaysInDayIsZero(){
        ConvertAgeInYears convertAgeInYears = new ConvertAgeInYears();
        int age = convertAgeInYears.CaltAge(0);
        assertEquals(0,age);
    }
    @Test
    public void givenAgeInYearsIsTwenty_returnAgeDays(){
        ConvertAgeInYears convertAgeInYears = new ConvertAgeInYears();
        int age = convertAgeInYears.CaltAge(20);
        assertEquals(7300,age);
    }
}
