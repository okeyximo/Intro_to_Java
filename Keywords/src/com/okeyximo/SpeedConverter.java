package com.okeyximo;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPer) {
        if (kilometersPer < 0)
            return -1;
        return Math.round(kilometersPer / 1.609);
    }
    public static void printConversion(double kilometersPer) {
        if (kilometersPer < 0)
            System.out.println("INVALID VALUE");
        long toMiles = Math.round(kilometersPer / 1.609);
        System.out.println(kilometersPer + "KMph = " + toMiles + "Mph");
    }
}
