import java.util.Arrays;
import java.util.List;
public class Ques10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,27,22,47,5,8,6,12,35,97);
        int sum=list.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
