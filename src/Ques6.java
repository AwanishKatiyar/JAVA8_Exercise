interface MyInterface{
    void instanceMethod();

    default void defaultMethod(){
        System.out.println("default func of interface");
    }
    static void staticMethod(){
        System.out.println("static method of interface");
    }
}
public class Ques6 {
    public static void main(String[] args) {
        MyInterface myInterface=() -> System.out.println("Instance method of interface implemented in class");
        myInterface.instanceMethod();
        myInterface.defaultMethod();
        MyInterface.staticMethod();
    }
}
