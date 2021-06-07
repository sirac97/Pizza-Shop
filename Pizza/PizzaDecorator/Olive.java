package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Olive extends CondimentDecorator {

    Pizza pizza;

    public Olive(Pizza pizza) {this.pizza = pizza ;}


    @Override
    public double cost() {
        return 0.35 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Olive";
    }
}
