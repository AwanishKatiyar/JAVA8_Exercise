interface Test{
    void instanceMethod();

    default void defaultMethod(){
        System.out.println("default method of interface");
    }
    static void staticMethod(){
        System.out.println("static method of interface");
    }
}
class ImplemenmtTest implements Test{
    @Override
    public void instanceMethod() {
        System.out.println("instance method of functional interface");
    }

    @Override
    public void defaultMethod() {
        System.out.println("default method of functional interface overriden");
    }

}
public class Ques7 {
    public static void main(String[] args) {
        ImplemenmtTest implemenmtTest=new ImplemenmtTest();
        implemenmtTest.instanceMethod();
        implemenmtTest.defaultMethod();

        Test test=new ImplemenmtTest();
        test.instanceMethod();
        test.defaultMethod();
        Test.staticMethod();
    }
}
