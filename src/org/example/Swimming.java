package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Swimming extends Activitys {
    private String energy;
    public Swimming(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph>=0.5 && this.kph<1.25){
            this.energy = "Very Light";
        }
        else if (this.kph>=1.25 && this.kph<2){
            this.energy = "Light";
        }
        else if (this.kph>=2 && this.kph<2.75){
            this.energy = "Moderate";
        }
        else if (this.kph>=2.75 && this.kph<3.5){
            this.energy = "Vigorous";
        }
        else if (this.kph>3.5){
            this.energy = "Very Vigorous";
        }
    }

    @Override
    public String toString() {
        return "Swimming; " + super.toString() + ", energy = " + energy;
    }
}
