package org.example;

import java.io. * ;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main (String[] args){
        Import object = new Import();
        System.out.println(object.ActivityReader("activity_data_10.csv").toString());

        Collections.sort(object, Comparator.comparingDouble(Activitys::getDuration));
    }





}


