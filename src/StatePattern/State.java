package StatePattern;

/**
 * Created by caesar on 16/3/3.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
