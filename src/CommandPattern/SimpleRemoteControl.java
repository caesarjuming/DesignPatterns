package CommandPattern;

/**
 * Created by caesar on 16/3/1.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}

    public  void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
