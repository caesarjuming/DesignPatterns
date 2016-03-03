package StatePattern;

/**
 * Created by caesar on 16/3/3.
 */
public class HasQuarterState implements State{
    private  GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {

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
