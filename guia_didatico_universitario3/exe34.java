import java.util.Arrays;
import java.util.List;

public class exe34 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Caio");
        nomes.forEach(System.out::println);
        nomes.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
