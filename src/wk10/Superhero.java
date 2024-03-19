package wk10;

public class Superhero extends Human{

    String heroName, power;
    double strength;

    void method(){
        name = "boo";
        age = 1000;
        setWeight(200);
    }

    //add the constructors for the older class

    public Superhero(){}

    public Superhero(String name, int age, double weight){
        super(name, age, weight);
    }

    @Override
    void goToSleep(){
        System.out.println(name + " is fighting crime");
    }

    @Override
    public String toString(){
            int upToLastChar = super.toString().length() - 1;
        return "Superhero" + super.toString().substring(5, upToLastChar)
                + String.format(", Hero Name = %s, Strength = %.0f, Super Power = %s}", heroName, strength, power)
                ;
    }
}
