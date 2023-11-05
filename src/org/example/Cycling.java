package org.example;

import java.util.Date;

public class Cycling extends Activitys {
    public Cycling(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);
    }

    @Override
    public String toString() {
        return "Cycling; " + super.toString();
    }
}
