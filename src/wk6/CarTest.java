package wk6;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
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
    }
}