interface Mammal{
    void legs();
    default void mammalFeatures(){
        System.out.println("Mammals have mammary glands");
        System.out.println("Mammals are endothermic vertebrates.");
    }
    default void display(){
        System.out.println("mammals");
    }
}
interface Marine{
    void legs();
    default void marineFeatures(){
        System.out.println("Live in water");
        System.out.println("Can swim");
    }
    default void display(){
        System.out.println("marine animals");
    }
}
class Whale implements Mammal,Marine{
    @Override
    public void legs() {
        System.out.println("Whales dont have legs");
    }
    @Override
    public void display() {
        System.out.println("Whales are marine mammals \n");
    }
}
public class Ques8 {
    public static void main(String[] args) {
        Whale whale=new Whale();
        whale.display();
        whale.legs();
        whale.mammalFeatures();
        whale.marineFeatures();
    }
}
