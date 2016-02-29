package SingletonPattern;

/**
 * Created by caesar on 16/2/29.
 */
public class MyFirstSingleton {

    private static MyFirstSingleton onlyOne;

    private MyFirstSingleton(){

    }

    public static MyFirstSingleton getInstance() {
        if(onlyOne==null){
            onlyOne=new MyFirstSingleton();
        }
        return onlyOne;
    }


}
