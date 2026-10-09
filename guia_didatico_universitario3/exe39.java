import java.util.ArrayList;
import java.util.List;

public class exe39 {
    static class Pedido {
        List<String> itens = new ArrayList<>();
        void adicionarItem(String item) { itens.add(item); }
        static String gerarCodigo() { return "PED-001"; }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Sorvete");
        System.out.println(Pedido.gerarCodigo() + ": " + pedido.itens);
    }
}
// adicionarItem altera um pedido específico. gerarCodigo é uma função da classe.
