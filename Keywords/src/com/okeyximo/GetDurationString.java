package com.okeyximo;

public class GetDurationString {
    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59))
            return ("Invalid String");
        int hours = minutes / 60;
        if (minutes > 59)
            minutes = (minutes - hours * 60);
        String str = (String)(hours + "hr " + minutes + "min " + seconds + " sec");
        return (str);
    }
    public static String getDurationString(int seconds){
        if (seconds < 0)
            return ("Invalid String");
        int minutes = seconds / 60;
        if (seconds > 59)
            seconds = (seconds - minutes * 60);
        return getDurationString(minutes, seconds);
    }

}
