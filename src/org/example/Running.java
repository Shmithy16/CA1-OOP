package org.example;

import java.util.Date;

public class Running extends Activitys{
    public Running(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);
    }

    @Override
    public String toString() {
        return "Running; " + super.toString();
    }
}
