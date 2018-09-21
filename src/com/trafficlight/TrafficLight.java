package com.trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    private static final int ZERO = 0;
    private static final int RED_TIME = 2;
    private static final int YELLOW_TIME = 3;
    private static final int GREEN_TIME = 5;
    private static final int TIME_OF_CIRCLE = RED_TIME + YELLOW_TIME + GREEN_TIME;
    private int minute;

    public TrafficLight() {
    }

    public void inputTime() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean flag = true;
            while (flag){
                try {
                    System.out.print("Enter the time in minutes: ");
                    String line = reader.readLine();
                    minute = Integer.parseInt(line) % TIME_OF_CIRCLE;
                    if (minute < 0) {
                        throw new NumberFormatException();
                    }
                    flag = false;
                } catch (NumberFormatException ex){
                    System.err.println("Incorrect data input! Try again");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void colorOfTrafficLightNow() {
        if (ZERO <= minute && minute < RED_TIME) {
            System.out.println(Colors.RED);
        } else if (RED_TIME <= minute && minute < RED_TIME + YELLOW_TIME) {
            System.out.println(Colors.YELLOW);
        } else if (GREEN_TIME <= minute && minute < TIME_OF_CIRCLE) {
            System.out.println(Colors.GREEN);
        }
    }

    public void setMinute(int minute) {
        this.minute = minute % TIME_OF_CIRCLE;
    }

    public int getMinute() {
        return minute;
    }
}
