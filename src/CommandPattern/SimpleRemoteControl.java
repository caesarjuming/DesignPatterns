package CommandPattern;

/**
 * Created by caesar on 16/3/1.
 */
//命令对象
//命令模式用途:
//队列请求,日志请求
//将请求封装成对象,这可以让你使用不同的请求,队列,日志,来参数化其他对象.命令也可以支持撤销
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}

    public  void setCommand(Command command){
        slot=command;
    }


    // 实现Command接口的类是执行者,调用者和执行者解耦
    public void buttonWasPressed(){
        slot.execute();
    }

}
