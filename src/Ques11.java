import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ques11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,27,22,47,5,8,6,12,35,97);
        System.out.println(list.stream().collect(Collectors.averagingInt(e->e*2)));
    }
}
