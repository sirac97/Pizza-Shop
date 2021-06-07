package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Peperoni extends CondimentDecorator{

    Pizza pizza;

    public Peperoni(Pizza pizza) {this.pizza = pizza ;}

    @Override
    public double cost() {
        return 0.75 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ "Peperoni";
    }
}
