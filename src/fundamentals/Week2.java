package fundamentals;

import java.util.Scanner;

public class Week2 {

    //psvm+tab
    public static void main(String[] args) {

        //output();
        input();
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

}
