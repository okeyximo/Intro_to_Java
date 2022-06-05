package com.okeyximo;

public class Main {
    public static void main(String[] args) {
        long convert = SpeedConverter.toMilesPerHour(19.00);
        System.out.println(convert + "Mph");
        SpeedConverter.printConversion(19.35);
        MegaBytesConverter.printMegabyteAndKilobyte(3500);
        System.out.println(BarkingDog.shouldWakeUp(true, 9));
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(2007));
        System.out.println(LeapYear.isLeapYear(2000));
        ConvertToKilograms.convertToKilograms(200d);
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.1757));
        System.out.println(TeamNumberChecker.hasTeen(9, 99, 19));
        CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(10, 0);
        System.out.println(GetDurationString.getDurationString(120));
        System.out.println(AreaCalculator.area(2, 5));
        System.out.println(AreaCalculator.area(7));
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        IntEqualityPrinter.printEqual(2,3,1);
        System.out.println(PlayingCat.isCatPlaying(false, 28));

    }
}
