package wk5;

public class Week5 {

    //psvm+tab
    public static void main(String[] args) {
        example2();

    }
    static void example2(){

        PizzaOrder lateNightSnack = PizzaOrder.MediumPepperoni();
        PizzaOrder lunchTimeSchoolPizzaOrder = PizzaOrder.PartySizedPlainPizza();

        System.out.println(lateNightSnack);

    }
    static void example1(){
        PizzaOrder pizzaOrder = new PizzaOrder("pepperoni,cheese,blah");
        System.out.println(pizzaOrder.getToppings());
        System.out.println(pizzaOrder.getPrice());

        String owner = PizzaOrder.owner;

    }
}

