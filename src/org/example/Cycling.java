package org.example;

import java.util.Date;

public class Cycling extends Activity {
    private double intensity;

    public Cycling(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph <= 7) {
            super.setEnergy("Very Light");
            this.intensity = 2.0;
        } else if (this.kph >= 8 && this.kph < 16) {
            super.setEnergy("Light");
            this.intensity = 5.0;
        } else if (this.kph >= 17 && this.kph < 25) {
            super.setEnergy("Moderate");
            this.intensity = 7.0;
        } else if (this.kph >= 25 && this.kph < 33) {
            super.setEnergy("Vigorous");
            this.intensity = 13.0;
        } else if (this.kph > 33 && this.kph < 40) {
            super.setEnergy("Very Vigorous");
            this.intensity = 15.0;
        }
        super.setCalories(intensity*getDuration());
        super.setName("Cycling");
    }

    @Override
    public String toString() {
        return "Cycling; "  + super.toString();
    }
}
