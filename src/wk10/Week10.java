package wk10;

public class Week10 {

    public static void main(String[] args) {
        example2();
    }
    static void example1(){

        Human bruceWayne = new Human("Bruce Wayne", 35, 220);

        Superhero batman = new Superhero();
        batman.name = "Batman";
        batman.setWeight(300);
        batman.age = 1000;

        bruceWayne.goToSleep();
        batman.goToSleep();
    }

    static void example2(){
        Human bruce = new Human("Bruce Wayne", 35, 220);
        Superhero batman = new Superhero("Bruce Wayne", 35, 220);

        System.out.println(bruce); // toString => summarize the instance variables/properties
        batman.strength = 12345;
        batman.power = "money/strengh/witty lines/sneaking up behind you";
        batman.heroName = "Batman";
        System.out.println(batman);

    }
}
