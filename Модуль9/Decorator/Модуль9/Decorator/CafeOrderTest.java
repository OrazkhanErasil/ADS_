public class CafeOrderTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);
        beverage = new WhippedCream(beverage);

        System.out.println("Заказ: " + beverage.getDescription());
        System.out.printf("Общая стоимость: $%.2f%n", beverage.cost());
    }
}
