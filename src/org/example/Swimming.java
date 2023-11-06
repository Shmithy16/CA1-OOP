package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Swimming extends Activitys {
    private String name;
    private String energy;
    private double intensity;

    public Swimming(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph>=0.5 && this.kph<1.25){
            this.energy = "Very Light";
            this.intensity = 5.0;
        }
        else if (this.kph>=1.25 && this.kph<2){
            this.energy = "Light";
            this.intensity = 6.3;
        }
        else if (this.kph>=2 && this.kph<2.75){
            this.energy = "Moderate";
            this.intensity = 7.6;
        }
        else if (this.kph>=2.75 && this.kph<3.5){
            this.energy = "Vigorous";
            this.intensity = 8.9;
        }
        else if (this.kph>3.5){
            this.energy = "Very Vigorous";
            this.intensity = 10.2;
        }

        super.setCalories(intensity*getDuration());
        super.setName("Swimming");
    }



    @Override
    public String toString() {
        return "Swimming; " + super.toString() + ", energy = " + energy;
    }
}
