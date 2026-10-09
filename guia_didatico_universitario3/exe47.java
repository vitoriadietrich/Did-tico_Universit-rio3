import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class exe47 {
    static String normalizar(String nome) { return nome.trim().toUpperCase(); }

    public static void main(String[] args) {
        Function<String, String> funcao = Exercicio47::normalizar;
        List<String> nomes = Arrays.asList("  Ana ", "  ", " bia ");
        List<String> resultado = nomes.stream()
                .map(funcao).filter(nome -> !nome.isEmpty()).collect(Collectors.toList());
        System.out.println(resultado);
    }
}
