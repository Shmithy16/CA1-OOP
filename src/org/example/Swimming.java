package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Swimming extends Activitys {
    public Swimming(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);
    }

    @Override
    public String toString() {
        return "Swimming; " + super.toString();
    }
}
