package CommandPattern;

/**
 * Created by caesar on 16/3/1.
 */
public class LightOnCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo(){
        light.off();
    }

    public LightOnCommand(Light light){
        this.light=light;
    }
}
