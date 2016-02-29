package SingletonPattern;

/**
 * Created by caesar on 16/2/29.
 */
public class EagerlySingleton {

    private static EagerlySingleton onlyOne=new EagerlySingleton();

    public static EagerlySingleton getInstance() {
        if(onlyOne==null){
            onlyOne=new EagerlySingleton();
        }
        return onlyOne;
    }
}
