package org.example;

import java.util.Comparator;

public class Calories_Comparator implements Comparator<Activity> {
    @Override
    public int compare(Activity o1, Activity o2) {
        if (o1.getCalories() < o2.getCalories()) return 1;
        if (o1.getCalories() > o2.getCalories()) return -1;    //sort descending using anonymous class
        return 0;
    }
}
