public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Молоко";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
