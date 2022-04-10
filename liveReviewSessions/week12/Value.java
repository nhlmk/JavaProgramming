package week12;

public class Value {

    int param = 0;
    boolean calledMethod = false;
    boolean calledConstructor = false;
    public Value(){}
    public Value(int param){
        this.param=param;
    }
    public void setValue (int param){
        this.param = param;
        calledMethod=true;
    }
    public boolean wasModified(){
        return calledMethod;
    }
    public int getValue(){
        if(this.calledMethod){
            return this.param;
        }
        else if(calledConstructor)
            return this.param;
        else{
            return this.param;
        }
    }

}
class ValueTest{
    public static void main(String[] args) {
        Value value = new Value();
        System.out.println(value.calledMethod);
        value.setValue(5);
        System.out.println(value.calledMethod);

    }
}