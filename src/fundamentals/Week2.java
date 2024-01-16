package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Week2 {

    //psvm+tab
    public static void main(String[] args) {

        //output();
        //input();
       // task2();
        guessingGame();
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
//
        double cost = trips * costPerTrip;

        System.out.printf("You need to transport %d tonnes of metal. " +
                "Reminder, my rate is %.2f. For %d trips, the total cost is $%.2f",
                userRequest, costPerTrip, trips, cost);

    }

    static void typecasting(){

        String value = "123";

        int v1 = Integer.parseInt(value); // from String to int
        double v2 = Double.parseDouble(value);

        //above = conversion

        //change from one data type to another?

        //implicity => upsizing / literal movement

        float f1 = 123f;
        double d1 = f1; // implicity typecasting

        short s1 = 1234;
        int i1 = s1;

        int example1 = 130;
        byte b1 = (byte) example1;  ///explicit typecasting

        /*

        -128                                    127


INT        127         128         129         130
BYTE        127         -128        -127        -126
        -126
         */


        method((byte)123);  //whole number => int     decimal number => double

        double d2 = 123d;
        float f2 = 1234;

        method((float)30.3f);
    }

    static void greet(String name){
        //System.out.println("Hello " + name);
        greet(name, 18);
    }
    static void greet(String name, int age){
        age = Math.max(age, 18);
        System.out.println("Hello " + name + "! You are " + age + " years old");
    }
    static void greet(int age, String name) {

        greet(name, age);
    }
    //method overloading: adding a variation to a method
    static void callingMethods(){

        greet("Ben");
        greet(100, "John");
        greet("Joe", 90);
    }
    static void method(byte v1){
        System.out.println("The value is " + v1);
      }

      static void method(long v1){
        System.out.println("The value is " + v1 + " from Long arg");

      }
    static void method(float v1){
        System.out.println("The value is " + v1 + " from Float arg");
    }


    static void guessingGame(){

        // ask the user to guess a number between 1 and 10
        // limit their attempts to 3 attempts
        // on each attempt, if incorrect. Hint: higher or lower
        // if correct, congratulate user
        // if user does not correctly guess number, tell them to study more

        Random random = new Random();
        int MIN_VALUE = 1;
        int MAX_VALUE = 10;
        int numberToGuess = random.nextInt(MIN_VALUE, MAX_VALUE);
        int GUESS_LIMITS = 3;
        int guessCounter = 0;

        System.out.printf("Welcome to our game%nYou will have %d guess to " +
                "guess a number between %d and %d", GUESS_LIMITS, MIN_VALUE, MAX_VALUE);

        while(guessCounter < GUESS_LIMITS){
            System.out.printf("Enter Guess #%d of %d: ", guessCounter + 1, GUESS_LIMITS);
            guessCounter++;
        }
    }

}
