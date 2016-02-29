package SingletonPattern;

/**
 * Created by caesar on 16/2/29.
 */
public class ConcurrencySingleton {

    private static ConcurrencySingleton onlyOne;

    // Lower performance ,because of the keyword synchronized

    public static synchronized ConcurrencySingleton getInstance() {
        if(onlyOne==null){
            onlyOne=new ConcurrencySingleton();
        }
        return onlyOne;
    }

}
