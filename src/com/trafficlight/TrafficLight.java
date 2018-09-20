package com.trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    private static final int timeOfCircle = 10;
    private int minute;

    public TrafficLight() {
        System.out.print("Enter the time in minutes: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            minute = Integer.parseInt(line) % timeOfCircle;
            if (minute < 0) {
                throw new NumberFormatException();
            }
        } catch (IOException | NumberFormatException ex) {
            System.err.println("Incorrect data input!");
            ex.printStackTrace();
        }
    }

    public void setMinute(int minute) {
        this.minute = minute % timeOfCircle;
    }

    public int getMinute() {
        return minute;
    }

    public void colorOfTrafficLightNow() {
        if (minute >= 0 && minute <= 2) {
            System.out.println(Colors.RED);
        } else if (minute > 2 && minute <= 5) {
            System.out.println(Colors.YELLOW);
        } else if (minute > 5) {
            System.out.println(Colors.GREEN);
        }
    }
}
