public class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Взбитые сливки";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
