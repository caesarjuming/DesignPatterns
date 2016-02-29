package SingletonPattern;

/**
 * Created by caesar on 16/2/29.
 */
public class VolatileSingleton {

    //Cancel the compiler optimization
    private volatile static VolatileSingleton onlyOne;
    
    private VolatileSingleton() {
        
    }

    public static VolatileSingleton getInstance() {
        if(onlyOne==null){
            synchronized (VolatileSingleton.class){
                onlyOne=new VolatileSingleton();
            }
        }
        return onlyOne;
    }
}
