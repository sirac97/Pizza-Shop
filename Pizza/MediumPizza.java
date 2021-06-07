package Pizza;

public class MediumPizza extends Pizza{

    public  MediumPizza(){
        description = "Medium Pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
