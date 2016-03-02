package TemplatePattern;

/**
 * Created by caesar on 16/3/2.
 */
public abstract class Beverage {

    public void getACupBeverage(){
        this.boilWater();
        this.addCondiments();
        this.pourInCup();
        if(this.hook()){
            this.newMethod();
        }
    }

    void boilWater(){

    }
    void pourInCup(){

    }

    abstract void addCondiments();
    abstract void newMethod();
    //一般可选项用钩子
    //子类可以修改这个方法,控制父类方法
    boolean hook(){
        return true;
    }

}
