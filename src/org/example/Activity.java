package org.example;

import java.util.Date;


abstract class Activity implements Comparable <Activity> {

    private Date date;
    private double duration;
    private double distance;
    private int ahr;
    public double kph;
    private double hours;
    private double calories;
    private String Name;
    private String Energy;

    public Activity(Date date, double duration, double distance, int ahr) {
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.ahr = ahr;
        this.hours = duration/60;
        this.kph = distance/hours;
        this.Energy = "";
    }

    //we kept those getters and setters that we actually use
    public Date getDate() {
        return date;
    }
    public double getDuration() {
        return duration;
    }
    public double getDistance() {
        return distance;
    }
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEnergy() {
        return Energy;
    }
    public void setEnergy(String energy) {
        Energy = energy;
    }

    @Override
    public int compareTo(Activity a) {
        return this.Name.compareTo(a.Name);
    }

    @Override
    public String toString() {
        return  "date = " + date +
                ", duration = " + duration +
                ", distance = " + distance +
                ", ahr = " + ahr +
                ", kph = " + String.format("%.3f",kph) +
                ", calories = " + String.format("%.2f",calories) +
                ", energy = " + Energy;
    }
}
