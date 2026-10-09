//Crie um método que lance IllegalArgumentException quando a quantidade de um pedido for menor ou igual a zero.
public class exe27 {
    public static void main(String[] args) {
        int quantidadePedido = 0;

        if (quantidadePedido <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser menor que zero");
        } else {
            System.out.println("Quantidade = " + quantidadePedido);
        }
    }
}