package org.example;

import java.util.Date;

public class Running extends Activitys{
    private String energy;
    public Running(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph>=2.5 && this.kph<4){
            this.energy = "Very Light";
        }
        else if (this.kph>=4 && this.kph<8){
            this.energy = "Light";
        }
        else if (this.kph>=8 && this.kph<12){
            this.energy = "Moderate";
        }
        else if (this.kph>=12 && this.kph<16){
            this.energy = "Vigorous";
        }
        else if (this.kph>16 && this.kph<24){
            this.energy = "Very Vigorous";
        }

    }

    @Override
    public String toString() {
        return "Running; " + super.toString()  + ", energy = " + energy;
    }
}
