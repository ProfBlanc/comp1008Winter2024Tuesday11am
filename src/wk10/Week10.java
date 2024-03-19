package wk10;

public class Week10 {

    public static void main(String[] args) {
        example3();
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

        Superhero batman2 = new Superhero(bruce, "Batman", "strength", 123456);

    }

    static void example3(){
        //super        //sub
        Human h1 = new Superhero();

        h1.goToSleep();
        System.out.println(h1);
        //h1.testMethod();

        Human[] humans = {new Human(), new Superhero()};

        for(Human h : humans){
            System.out.println(h);
        }

    }
}
