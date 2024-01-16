package fundamentals;

import java.util.Scanner;

public class Week2 {

    //psvm+tab
    public static void main(String[] args) {

        //output();
        //input();
        task2();
    }

    /*
            String

            int             32 bits     4 bytes
            double          64 bits     8 bytes
            byte            8 bits      1 bytes
            short           half of int
            long            double int
            float           32 bits       4 bytes       allows decimal places
            double          double float

            boolean not bool    true or false
            char            one single character        or escape char
                        \n      \t      \r\n


     */

    static void input(){

        int a = 0xf;  // 15 in decimal

        Scanner userInfo = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = userInfo.nextLine();
        System.out.println("What is your age?");
        byte age = userInfo.nextByte();
        System.out.println("What is the temperature?");
        float temp = userInfo.nextFloat();

        System.out.printf("Your name is %s. Your age is %d. " +
                "It is %.1f degrees Celsius outside", name, age, temp);

    }
    static void output(){

        //sout + tab  System.out.println()
        // souf + tab System.out.printf();
        System.out.println("Hello everyone");
        System.out.printf("Hello my name is %s. I am %d years old. " +
                "It is %.3f degrees Celsius outside", "Ben", 20, -12.2);
        /*
            {}      placeholder

            %symbol

                s       string
                d       digit (whole number)
                f       decimal number

         */

    }

    static void task1(){

        Scanner userInfo = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = userInfo.nextLine();
        System.out.print("What year were you born?");
        short age = userInfo.nextShort();

        int ageInYears = 2024 - age;
        int ageInMonths = ageInYears * 12;
        int ageInSeconds = 60 * 60 * 24 * 365 * ageInYears;

        System.out.printf("Your name is %s. You are %d years old. " +
                "You are %d months old. You are %d seconds old",
                name, ageInYears, ageInMonths, ageInSeconds);


    }

    static void task2(){

        double costPerTrip = 15.25;
        int tonneLimit = 5;
        Scanner userInfo = new Scanner(System.in);

        System.out.println("They call me the Transporter. " +
                "I can transport unlimited tonnes matel at a rate of " + costPerTrip + " per trip." +
                "I can transport a maximum of " + tonneLimit + " tonnes per trip.");
        System.out.println("How many tonnes of metal do you need to transport");
        int userRequest = userInfo.nextInt();

        int trips = userRequest / tonneLimit;
        if(userRequest % tonneLimit != 0)
            trips++;

        double cost = trips * costPerTrip;

        System.out.printf("You need to transport %d tonnes of metal. " +
                "Reminder, my rate is %.2f. For %d trips, the total cost is $%.2f",
                userRequest, costPerTrip, trips, cost);

    }

}
