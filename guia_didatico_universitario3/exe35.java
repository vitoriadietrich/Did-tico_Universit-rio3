import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class exe35 {
    static class Produto {
        String nome;
        Produto(String nome) { this.nome = nome; }
    }

    static Optional<Produto> buscarProduto(List<Produto> produtos, String nome) {
        return produtos.stream().filter(p -> p.nome.equalsIgnoreCase(nome)).findFirst();
    }

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(new Produto("Sorvete"), new Produto("Bolo"));
        try {
            Produto produto = buscarProduto(produtos, "Sorvete")
                    .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
            System.out.println(produto.nome);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
