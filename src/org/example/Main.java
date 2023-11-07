package org.example;

import java.io. * ;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

// activities_array, Comparator.comparingDouble(Activitys::getDuration)
public class Main {
    public static void main (String[] args){
        Import object = new Import();
        ArrayList<Activitys> activities_array = object.ActivityReader("activity_data_10.csv");
        int count = 0;
        double cal_count=0;
        double average_cal=0;

        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                if (o1.getCalories() < o2.getCalories()) return 1;
                if (o1.getCalories() > o2.getCalories()) return -1;
                return 0;
            }
        });

        System.out.println("\nSort calories descending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
            count++;
            cal_count = cal_count+ activity.getCalories();
        }

        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });

        System.out.println("\nSort date ascending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }

        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                return -o1.getDate().compareTo(o2.getDate());
            }
        });

        System.out.println("\nSort date descending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }


        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                if (o1.getDuration() < o2.getDuration()) return 1;
                if(o1.getDuration() > o2.getDuration()) return -1;  //Sort descending
                return 0;
            }
        });

        System.out.println("\nSort duration descending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }
        System.out.println("");
        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                if (o1.getDuration() > o2.getDuration()) return 1;
                if(o1.getDuration() < o2.getDuration()) return -1;  //sort ascending
                return 0;
            }
        });

        System.out.println("\nSort duration ascending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }


        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSort activity type ascending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }

        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                if (o1.getDistance() < o2.getDistance()) return 1;
                if(o1.getDistance() > o2.getDistance()) return -1;  //Sort descending
                return 0;
            }
        });

        System.out.println("\nSort distance descending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }
        Collections.sort(activities_array, new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                if (o1.getDistance() > o2.getDistance()) return 1;
                if(o1.getDistance() < o2.getDistance()) return -1;  //Sort ascending
                return 0;
            }
        });

        System.out.println("\nSort distance ascending:");
        for (Activitys activity: activities_array){
            System.out.println(activity);
        }

        average_cal = cal_count/count;
        System.out.println("\n Average calories burned: " + average_cal);


//        for( Activitys activity: activities_array){
//            if (activity.getName() == "Swimming"){
//
//                System.out.println("\n Average distance" + average);
//            }
//            else if(activity.getName() == "Running"){
//                average = dur/count;
//                System.out.println("\n Average distance" + average);
//            }
//            else{
//                average = dur/count;
//                System.out.println("\n Average distance " + average);
            //}
        //}
    }
}


