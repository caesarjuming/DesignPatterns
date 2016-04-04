package DecoratorPattern;

/**
 * Created by caesar on 16/4/4.
 */
public abstract class MyBeverage {
    String description ="un know";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
