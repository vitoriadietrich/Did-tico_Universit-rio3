public class exe29 {
    public static void main(String[] args) {
        System.out.println("SISTEMA");
        mostrarNome("Notebook");
        mostrarPreco(3500.0);
        verificarEstoque(3);
        System.out.println("FIM DO RELATÓRIO");
    }

    public static void mostrarNome(String nome) {
        System.out.println("Produto: " + nome);
    }

    public static void mostrarPreco(double preco) {
        System.out.println("Preço: R$ " + preco);
    }

    public static void verificarEstoque(int qtd) {
        if (qtd < 5) {
            System.out.println("Alerta: Estoque baixo (" + qtd + ")");
        } else {
            System.out.println("Estoque OK: " + qtd);
        }
    }
}