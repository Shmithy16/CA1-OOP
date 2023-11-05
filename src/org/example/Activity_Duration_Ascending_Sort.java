package org.example;

import java.util.Comparator;

public class Activity_Duration_Ascending_Sort implements Comparator<Activitys> {
    @Override
    public int compare(Activitys A1, Activitys A2) {
        return A1.getDuration().compareTo(A2.getDuration());
        // returns :
        // negative (indicates elements are in ascending order),
        // zero (indicates that objects are the same),
        // or positive (indicates that they are out of order)
    }
}
