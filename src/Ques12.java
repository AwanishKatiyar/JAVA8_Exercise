import java.util.Arrays;
import java.util.List;
public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,27,22,47,5,8,6,12,35,97);
        System.out.println(list.stream().filter(e->e%2==0&&e>3).findFirst());
    }
}
