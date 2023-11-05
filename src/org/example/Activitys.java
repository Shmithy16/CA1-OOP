package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Activitys implements Comparable <Activitys> {

    private Date date;
    private double duration;
    private double distance;
    private int ahr;
    private double kph;
    private double hours;
    private double energy;
    private double calories;

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

    @Override
    public String toString() {
        return "date = " + date +
                ", duration = " + duration +
                ", distance = " + distance +
                ", ahr = " + ahr +
                ", kph = " + String.format("%.3f",kph) +
                '\n';
    }
}
