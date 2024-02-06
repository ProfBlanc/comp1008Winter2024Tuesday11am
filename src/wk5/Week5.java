package wk5;

public class Week5 {

    //psvm+tab
    public static void main(String[] args) {


        PizzaOrder pizzaOrder = new PizzaOrder("pepperoni,cheese,blah");
        System.out.println(pizzaOrder.getToppings());
        System.out.println(pizzaOrder.getPrice());

        String owner = PizzaOrder.owner;


    }
}
