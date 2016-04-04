package DecoratorPattern;

/**
 * Created by caesar on 16/4/4.
 */
// 浓缩咖啡
public class Espresso extends MyBeverage {
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
