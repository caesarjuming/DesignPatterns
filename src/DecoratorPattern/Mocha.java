package DecoratorPattern;

/**
 * Created by caesar on 16/4/4.
 */
public class Mocha extends Condiment {
    MyBeverage beverage;

    public Mocha(MyBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
}
