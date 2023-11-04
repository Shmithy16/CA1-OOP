package org.example;

import java.io. * ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fileName = "activity_data_10.csv";

        try (Scanner sc = new Scanner(new File("activity_data_10.csv")))
        {
            if(sc.hasNextLine())
                sc.nextLine();


            while (sc.hasNextLine())          //we should get rid of this code
            {
                String line = sc.nextLine();
                String [] tokens = line.split(",");

                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                double height = Double.parseDouble(tokens[2]);
                double gpa = Double.parseDouble(tokens[3]);

                System.out.printf("%-20s %5d %5.2f %5.2f %n",name,age,height,gpa);
            }

        } catch (FileNotFoundException exception)
        {
            System.out.println("FileNotFoundException caught. The file " +fileName+ " may not exist." + exception);
        }
    }
}
