package org.example;

import java.io. * ;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Read_from_csv {

    public ArrayList<Activity> ActivityReader(String fileName) {

        ArrayList<Activity> activities_Total = new ArrayList<Activity>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try (Scanner sc = new Scanner(new File("activity_data_10.csv"))) {
            if (sc.hasNextLine())
                sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] activity = line.split(",");

                String activityType = activity[0];
                Date date = null;
                try {
                    date = dateFormat.parse(activity[1]);
                } catch (ParseException e) {
                    System.out.println("no work date");
                }
                double duration = Double.parseDouble(activity[2]);
                double distance = Double.parseDouble(activity[3]);
                int ahr = Integer.parseInt(activity[4]);

                if (activityType.equals("Running")) {
                    activities_Total.add(new Running(date, duration, distance, ahr));

                }
                else if (activityType.equals("Swimming")) {
                    activities_Total.add(new Swimming(date, duration, distance, ahr));

                }
                else if (activityType.equals("Cycling")) {
                    activities_Total.add(new Cycling(date, duration, distance, ahr));

                }
            }

        } catch (FileNotFoundException exception) {
            System.out.println("FileNotFoundException caught. The file " + fileName + " may not exist." + exception);
        }
        return activities_Total; }
}
