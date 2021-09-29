@FunctionalInterface
interface Addition<I>{
    I add(I a,I b);
}
public class Ques2 {
    public static void main(String[] args) {
        Addition<Integer> addition=(a,b)->a+b;
        System.out.println(addition.add(5,2));
    }
}
