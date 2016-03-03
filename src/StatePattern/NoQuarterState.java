package StatePattern;

/**
 * Created by caesar on 16/3/3.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
