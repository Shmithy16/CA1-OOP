package org.example;

import java.util.Date;

public class Cycling extends Activitys {
    private String energy;
    public Cycling(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph <= 7) {
            this.energy = "Very Light";
        } else if (this.kph >= 8 && this.kph < 16) {
            this.energy = "Light";
        } else if (this.kph >= 17 && this.kph < 25) {
            this.energy = "Moderate";
        } else if (this.kph >= 25 && this.kph < 33) {
            this.energy = "Vigorous";
        } else if (this.kph > 33 && this.kph < 40) {
            this.energy = "Very Vigorous";
        }
    }

    @Override
    public String toString() {
        return "Cycling; "  + super.toString() +  ", energy = " + energy;
    }
}
