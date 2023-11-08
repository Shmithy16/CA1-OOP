package org.example;

import java.util.*;

// github: https://github.com/Shmithy16/CA1-OOP
public class Main {
    public static void main(String[] args) {
        // variables
        boolean menu_open = true;
        int count = 0;
        double cal_count = 0;
        double average_cal = 0;

        // creating new object in array list
        Read_from_csv object = new Read_from_csv();
        ArrayList<Activity> activities_array = object.ActivityReader("activity_data_10.csv");

        //setting up counter and calculator
        for (Activity activity : activities_array) {
            count++;
            cal_count = cal_count + activity.getCalories();
        }


        // big loop that does all the stuff
        while (menu_open) {

            System.out.println("[1] Press 1 to sort by calories");
            System.out.println("[2] Press 2 to sort by date");
            System.out.println("[3] Press 3 to sort by duration");
            System.out.println("[4] Press 4 to sort by activity type");
            System.out.println("[5] Press 5 to sort by distance");
            System.out.println("[6] Press 6 to show calories burned");
            System.out.println("[7] Press 7 to show average distance per activity");
            System.out.println("[8] Press 8 to show above a minimum distance");
            System.out.println("[9] Press 9 to show type of energy ");
            System.out.println("[10] Press 10 show above a minimum duration");
            System.out.println("[0] Press 0 to stop the program");

            //input
            Scanner menu = new Scanner(System.in);
            int answer = menu.nextInt();

            //all the lovely conditions
            if(answer==1){

                Collections.sort(activities_array, new Calories_Comparator());

                //return o1.getDate().compareTo(o2.getDate());

                System.out.println("\nSort calories descending:");
                for (Activity activity : activities_array) {
                    System.out.println(activity);
                }

                System.out.println("");

            } else if (answer == 2) {
                System.out.println("[1] Press 1 to sort by date ascending");
                System.out.println("[2] Press 2 to sort by date descending");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                if (answer == 1){
                    Collections.sort(activities_array, (a1,a2) -> { return a1.getDate().compareTo(a2.getDate());});

                    System.out.println("\nSort date ascending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else if(answer == 2){
                    Collections.sort(activities_array, (a1,a2) -> { return a1.getDate().compareTo(a2.getDate());});  //sort using lambda
                    Collections.reverse(activities_array);

                    System.out.println("\nSort date descending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }
                    System.out.println("");

                }else{
                    System.out.println("Invalid input");
                }

            }else if(answer == 3){
                System.out.println("[1] Press 1 to sort by duration ascending");
                System.out.println("[2] Press 2 to sort by duration descending");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                if(answer == 1){
                    Collections.sort(activities_array, new Comparator<Activity>() {
                        @Override
                        public int compare(Activity o1, Activity o2) {
                            if (o1.getDuration() > o2.getDuration()) return 1;
                            if (o1.getDuration() < o2.getDuration()) return -1;  //sort ascending using anonymous class
                            return 0;
                        }
                    });

                    System.out.println("\nSort duration ascending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else if(answer == 2){
                    Collections.sort(activities_array, new Comparator<Activity>() {
                        @Override
                        public int compare(Activity o1, Activity o2) {
                            if (o1.getDuration() < o2.getDuration()) return 1;
                            if (o1.getDuration() > o2.getDuration()) return -1;  //Sort descending using anonymous class
                            return 0;
                        }
                    });

                    System.out.println("\nSort duration descending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else{
                    System.out.println("Invalid input");
                }

            }else if (answer == 4){
                System.out.println("[1] Press 1 to sort by activity type ascending");
                System.out.println("[2] Press 2 to sort by activity type descending");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                if(answer == 1){
                    Collections.sort(activities_array); //sort by natural order (in this case by name)

                    System.out.println("\nSort activity type ascending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else if(answer == 2){
                    Collections.sort(activities_array);
                    Collections.reverse(activities_array);

                    System.out.println("\nSort activity type descending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else{
                    System.out.println("Invalid input");
                }

            }else if (answer == 5){
                System.out.println("[1] Press 1 to sort by distance ascending");
                System.out.println("[2] Press 2 to sort by distance descending");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                if(answer == 1){
                    Collections.sort(activities_array, new Comparator<Activity>() {
                        @Override
                        public int compare(Activity o1, Activity o2) {
                            if (o1.getDistance() > o2.getDistance()) return 1;
                            if (o1.getDistance() < o2.getDistance()) return -1;  //Sort ascending using anonymous class
                            return 0;
                        }
                    });

                    System.out.println("\nSort distance ascending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                } else if (answer == 2){
                    Collections.sort(activities_array, new Comparator<Activity>() {
                        @Override
                        public int compare(Activity o1, Activity o2) {
                            if (o1.getDistance() < o2.getDistance()) return 1;
                            if (o1.getDistance() > o2.getDistance()) return -1;  //Sort descending using anonymous class
                            return 0;
                        }
                    });

                    System.out.println("\nSort distance descending:");
                    for (Activity activity : activities_array) {
                        System.out.println(activity);
                    }

                    System.out.println("");

                }else{
                    System.out.println("Invalid input");
                }

            } else if (answer == 6){
                average_cal = cal_count / count;
                System.out.println("\nAverage calories burned: " + average_cal);

                System.out.println("");

            } else if (answer == 7){
                System.out.println("Average distance in swimming: " + average_dist(activities_array, "Swimming"));
                System.out.println("Average distance in menu_open: " + average_dist(activities_array, "Running"));
                System.out.println("Average distance in cycling: " + average_dist(activities_array, "Cycling"));

                System.out.println("");

            } else if (answer == 8){
                System.out.println("Input what is the minimum distance in integers: ");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                higher_than_minimum_distance(answer, activities_array);

                System.out.println("");

            } else if (answer == 9) {
                System.out.println("[1] Press 1 to show Very Light");
                System.out.println("[2] Press 2 to show Light");
                System.out.println("[3] Press 3 to show Moderate");
                System.out.println("[4] Press 4 to show Vigorous");
                System.out.println("[5] Press 5 to show Very Vigorous");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                if(answer == 1){
                    show_energy("Very Light", activities_array);

                } else if (answer == 2) {
                    show_energy("Light", activities_array);

                } else if (answer == 3) {
                    show_energy("Moderate", activities_array);

                } else if (answer == 4) {
                    show_energy("Vigorous", activities_array);

                } else if (answer == 5) {
                    show_energy("Very Vigorous", activities_array);
                }else{
                    System.out.println("Invalid input");
                }

            } else if (answer == 10) {
                System.out.println("Input what is the minimum duration in integers: ");

                Scanner options = new Scanner(System.in);
                answer = options.nextInt();

                higher_than_minimum_duration(answer, activities_array);

                System.out.println("");

            }

            else if (answer == 0) {
                menu_open = false;

            } else {
                System.out.println("Invalid input\n");
                System.out.println("");
            }
        }
    }

    public static void higher_than_minimum_duration(int higher_than_min, ArrayList <Activity> list){
        for (Activity activity: list) {
            if (activity.getDuration() > higher_than_min){
                System.out.println(activity);
            }
        }
    }
    public static void higher_than_minimum_distance(int higher_than, ArrayList <Activity> list){
        for (Activity activity: list) {
            if (activity.getDistance() > higher_than){
                System.out.println(activity);
            }
        }
    }

    public static void show_energy(String energy_level, ArrayList <Activity> list){
        for (Activity activity: list) {
            if (activity.getEnergy().equals(energy_level)){
                System.out.println(activity);
            }
        }
    }
//
    public static double average_dist (ArrayList < Activity > activities_array, String type){

        double dis_count = 0;
        double dis_total = 0;

        for (Activity activity : activities_array) {
            if (activity.getName().equals(type)) {
                dis_count += 1;
                dis_total += activity.getDistance();
            }
        }
        return Double.parseDouble(String.format("%.2f",dis_total / dis_count));
    }
}