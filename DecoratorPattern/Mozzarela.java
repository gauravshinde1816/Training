package DecoratorPattern;

public class Mozzarela extends ToppingDecorator{
    public Mozzarela(PlainPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moz";
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }
}
