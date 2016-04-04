package DecoratorPattern;

/**
 * Created by caesar on 16/4/4.
 */
public class HouseBlend extends MyBeverage {
    public HouseBlend() {
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return 2.1;
    }
}
