package com.okeyximo;

public class DayOfTheWeek {
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

    }
}

/**
 * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
 * <p>
 * The method should not return any value (hint: void)
 * <p>
 * Using a switch statement print ÅgSundayÅh, ÅgMondayÅh, Åc ,ÅgSaturdayÅh if the int parameter ÅgdayÅh is 0, 1, Åc , 6 respectively, otherwise it should print ÅgInvalid dayÅh.
 * <p>
 * Bonus:
 * Write a second solution using if then else, instead of using switch.
 * Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh
 */