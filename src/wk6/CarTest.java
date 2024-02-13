package wk6;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each");
    }
    @BeforeClass
    public static void setUp() {
        System.out.println("Before Anything");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("After everything");
    }
    @Test
    public void testSpeedSetter(){

        Car c1 = new Car();
        c1.setSpeed(500);

        //test the bahiours of a method
        assertEquals(0, c1.getSpeed());
        c1.setSpeed(100);
        assertEquals(100, c1.getSpeed());

    }
    @Test
    public void testColorSetter(){
        Car c1 = new Car();
        assertEquals("black", c1.getColor());
    }
    //test the setter and pass the values black, white, blur

    @ParameterizedTest
    @ValueSource(strings = {"black", "white", "blue"})
    public void testColorSetterWithValues(String color){
        Car c1 = new Car();
        c1.setColor(color);
        assertEquals(color, c1.getColor());

        //ValueSource: 1 value
        // value data types primitive + string
    }   // strings, ints, doubles, floats, booleans, etc
    @Test
    public void testDefaultConstructor(){

        Car c1 = new Car();
        assertEquals(0, c1.getSpeed());
        assertTrue(c1.getDoors() == 2 &&
                c1.getColor().equals("black"));



    }
    @ParameterizedTest
    @CsvSource({"black,5,150,manual","blue,4,250,automatic","white,2,300,manual"})
    public void test4ArgConstructor(String color, int doors, double speed, String transmission){

        Car c1 = new Car(color, doors, speed, transmission);
        assertTrue(c1.getColor().equals(color) && c1.getDoors() == doors
        && c1.getSpeed() == speed);
    }

}