import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class exe50 {
    public static void main(String[] args) {
        PedidoService loja = new PedidoService();
        loja.cadastrar(new Sorvete(1, "Chocolate", 8.0));
        loja.cadastrar(new Sorvete(2, "Morango", 7.0));

        Cliente cliente = new Cliente("Ana");
        loja.pedir(cliente, 1);
        loja.pedir(cliente, "Morango"); // Sobrecarga

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Total: R$ " + cliente.total);
        System.out.println("Primeiro sabor: " + Util.primeiro(loja.sorvetes).nome);
    }
}

class Cliente {
    String nome;
    double total;

    Cliente(String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome invalido");
        this.nome = nome;
    }
}

class Sorvete {
    int codigo;
    String nome;
    double preco;

    Sorvete(int codigo, String nome, double preco) {
        if (nome == null || nome.isBlank() || preco <= 0) throw new IllegalArgumentException("Sorvete invalido");
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
}

interface Atendimento {
    void pedir(Cliente cliente, int codigo);
}

class PedidoService implements Atendimento {
    List<Sorvete> sorvetes = new ArrayList<>();

    void cadastrar(Sorvete sorvete) {
        sorvetes.add(sorvete);
    }

    Optional<Sorvete> buscar(int codigo) {
        return sorvetes.stream().filter(s -> s.codigo == codigo).findFirst();
    }

    @Override
    public void pedir(Cliente cliente, int codigo) {
        Sorvete sorvete = buscar(codigo).orElseThrow(() -> new IllegalArgumentException("Sabor nao encontrado"));
        cliente.total += sorvete.preco;
        System.out.println("Pedido: " + sorvete.nome);
    }

    void pedir(Cliente cliente, String nome) {
        Sorvete sorvete = sorvetes.stream()
                .filter(s -> s.nome.equalsIgnoreCase(nome))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Sabor nao encontrado"));
        pedir(cliente, sorvete.codigo);
    }
}

class Util {
    static <T> T primeiro(List<T> lista) {
        if (lista.isEmpty()) throw new IllegalArgumentException("Lista vazia");
        return lista.get(0);
    }
}
