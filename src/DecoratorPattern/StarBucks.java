package DecoratorPattern;

/**
 * Created by caesar on 16/4/4.
 */
public class StarBucks {
    public static void main(String[] args) {
        MyBeverage beverage=new Espresso();
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);


        System.out.println(beverage.getDescription());

    }
}
