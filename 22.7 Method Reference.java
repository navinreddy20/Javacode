import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        
        List<String> tasks=Arrays.asList("completed","pending","not_completed");

        Stream<String> taskStream = tasks.stream()
                                   .map(String::toUpperCase);
        taskStream.forEach(System.out::println);
        
    }
}
