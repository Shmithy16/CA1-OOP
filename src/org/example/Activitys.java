package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
//implements Comparable <Activitys>
abstract class Activitys  {

    private Date date;
    private double duration;
    private double distance;
    private int ahr;
    public double kph;
    private double hours;
    private double calories;
    private String Name;

    public Activitys(Date date, double duration, double distance, int ahr) {
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.ahr = ahr;
        this.hours = duration/60;
        this.kph = distance/hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getAhr() {
        return ahr;
    }

    public void setAhr(int ahr) {
        this.ahr = ahr;
    }

    public double getKph() {
        return kph;
    }

    public void setKph(double kph) {
        this.kph = kph;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
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

    @Override
    public String toString() {
        return  "date = " + date +
                ", duration = " + duration +
                ", distance = " + distance +
                ", ahr = " + ahr +
                ", kph = " + String.format("%.3f",kph) +
                ", calories = " + String.format("%.2f",calories);
    }
}
