package DecoratorPattern;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Sauce";
    }
    @Override
    public double getCost() {
        return super.getCost()  + 0.45;
    }
}
