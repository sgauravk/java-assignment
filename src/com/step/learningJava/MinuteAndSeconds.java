package com.step.learningJava;

public class MinuteAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(-5, 6));
        System.out.println(getDurationString(9, -3));
        System.out.println(getDurationString(9, 64));
        System.out.println(getDurationString(9, 9));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
            String hoursSuffix = "";
            String minuteSuffix = "";
            String secondsSuffix = "";
            int hours = minutes / 60;
            minutes = minutes % 60;
            if(hours < 10) hoursSuffix = "0";
            if(minutes < 10) minuteSuffix = "0";
            if(seconds < 10) secondsSuffix = "0";
            String time = hoursSuffix + hours + "h " + minuteSuffix + minutes + "m " + secondsSuffix + seconds + "s";
            return time;
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            String time = getDurationString(minutes, seconds);
            return time;
        }
        return "Invalid Value";
    }
}
