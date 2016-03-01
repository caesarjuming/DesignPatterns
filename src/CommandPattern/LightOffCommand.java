package CommandPattern;

/**
 * Created by caesar on 16/3/1.
 */
public class LightOffCommand implements Command {
    Light light;
    public  LightOffCommand(Light light){
        this.light=light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
