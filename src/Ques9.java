import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ques9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,27,22,47,5,8,6,12,35,97);
        List evenList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        evenList.forEach(System.out::println);
    }
}
