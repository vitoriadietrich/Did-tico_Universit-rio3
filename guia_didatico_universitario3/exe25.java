import java.util.Optional;

public class exe25 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos"};

        System.out.println(buscar(nomes, "Carlos").orElse("Não encontrado"));
        System.out.println(buscar(nomes, "Ana").orElse("Não encontrado"));
    }

    public static Optional<String> buscar(String[] lista, String alvo) {
        for (String nome : lista) {
            if (nome.equals(alvo)) {
                return Optional.of(nome);
            }
        }
        return Optional.empty();
    }
}