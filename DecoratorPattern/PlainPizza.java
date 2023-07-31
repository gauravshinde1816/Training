package DecoratorPattern;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Add Dough";
    }

    @Override
    public double getCost() {
        return 0.0;
    }
}
