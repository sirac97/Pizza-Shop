package Pizza;

import Beverage.*;

public class BeverageFactory {

    public Beverage makeBeverage(String beverageType) {
        if (beverageType.equals(null)){
            return null;
        }

        else if(beverageType.equals("Cola")){
            return new Cola();
        }
        else if(beverageType.equals("Fanta")){
            return new Fanta();
        }
        else if(beverageType.equals("Sprite")){
            return new Sprite();
        }
        else if(beverageType.equals("Ice Tea")){
            return new IceTea();
        }
        return null;
    }

}
