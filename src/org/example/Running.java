package org.example;

import java.util.Date;

public class Running extends Activitys{
    private String energy;
    private double intensity;

    public Running(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph>=2.5 && this.kph<4){
            this.energy = "Very Light";
            this.intensity = 4.1;
        }
        else if (this.kph>=4 && this.kph<8){
            this.energy = "Light";
            this.intensity = 7.2;
        }
        else if (this.kph>=8 && this.kph<12){
            this.energy = "Moderate";
            this.intensity = 10;
        }
        else if (this.kph>=12 && this.kph<16){
            this.energy = "Vigorous";
            this.intensity = 15.4;
        }
        else if (this.kph>16 && this.kph<24){
            this.energy = "Very Vigorous";
            this.intensity = 20.8;
        }

        super.setCalories(intensity*getDuration());
        super.setName("Running");

    }



    @Override
    public String toString() {
        return "Running; " + super.toString()  + ", energy = " + energy;
    }
}
