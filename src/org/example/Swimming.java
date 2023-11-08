package org.example;

import java.util.Date;

public class Swimming extends Activity {
    private String energy;
    private double intensity;

    public Swimming(Date date, double duration, double distance, int ahr) {
        super(date, duration, distance, ahr);

        if (this.kph>=0.5 && this.kph<1.25){
            super.setEnergy("Very Light");
            this.intensity = 5.0;
        }
        else if (this.kph>=1.25 && this.kph<2){
            super.setEnergy("Light");
            this.intensity = 6.3;
        }
        else if (this.kph>=2 && this.kph<2.75){
            super.setEnergy("Moderate");
            this.intensity = 7.6;
        }
        else if (this.kph>=2.75 && this.kph<3.5){
            super.setEnergy("Vigorous");
            this.intensity = 8.9;
        }
        else if (this.kph>3.5){
            super.setEnergy("Very Vigorous");
            this.intensity = 10.2;
        }

        super.setCalories(intensity*getDuration());
        super.setName("Swimming");
    }

    @Override
    public String toString() {
        return "Swimming; " + super.toString();
    }
}
