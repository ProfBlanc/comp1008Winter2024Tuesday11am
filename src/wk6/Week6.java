package wk6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Week6 {

    //psvm+tab
    public static void main(String[] args) {
        example2();
    }
    static void example1(){
        //ArrayList<Reference Data Type> name = new ArrayList<>();
        //double, int, float, boolean, char, short, long
        //Integer, Double, Float, Boolean, Char, Short, Long

        ArrayList<Float> floatArrayList = new ArrayList<>();
        floatArrayList.add(123.45F); //double value

        //add(), remove(), size(), contains(), indexOf()
        //remove(element value: the data type), remove(index value: int)
    }
    static void example2(){

        //create an arraylist of 10 random Short values of numbers between -100 and 100
        //use the Random object, typecast the value to a short
        //use a loop

        //ask the user for a number. determine if the number exists in the arraylist
            // if yes, output the index position of this number
            // if not, display a "sorry message"
        // will take this up at 11:30

        //variables needed
        //Random
        //ArrayList
        //Scanner
        //variable to hold user input value
        Random random = new Random();
        ArrayList<Short> shortArrayList = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);
        short userValue = 0;

        //using a loop, generate 10 values between +/- 100

        for(int i = 0; i < 10; i++){

            shortArrayList.add((short) random.nextInt(-100, 101));
        }

        System.out.println("Enter a value and we will tell you if this value is in the array list");
        userValue = input.nextShort();
        if(shortArrayList.contains(userValue)){
            int index = shortArrayList.indexOf(userValue);

            System.out.printf("The value of %d was found at index %d%n", userValue, index);
        }
        else{
            System.out.println("Sorry but the value " + userValue + " was not found");
        }
    }
}
