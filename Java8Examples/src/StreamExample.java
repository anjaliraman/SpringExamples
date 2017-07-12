import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//convert a stream to list
public class StreamExample {

    public static void main(String args[]) {

        Stream<String> cuisines = Stream.of("Thai","Indian","American","Italian");

        List varities = cuisines.collect(Collectors.toList());
        varities.forEach(System.out::println);

    }
}
