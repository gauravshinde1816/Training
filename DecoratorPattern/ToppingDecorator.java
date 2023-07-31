package DecoratorPattern;

public abstract  class ToppingDecorator implements Pizza {
    protected  Pizza plainPizza;
    public ToppingDecorator(Pizza pizza){
            this.plainPizza = pizza;
    }

    @Override
    public String getDescription() {
        return plainPizza.getDescription() ;
    }

    @Override
    public double getCost() {
        return plainPizza.getCost();
    }
}
