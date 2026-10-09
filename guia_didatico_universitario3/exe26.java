//Crie uma classe Produto com campos private e métodos públicos que garantam preço maior que zero.
public class exe26 {
    public static void main(String[] args) {
        Produtos p1 = new Produtos();

        p1.setNome("a");
        p1.setPreco(100);
        p1.setQuantidade(0);

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: R$ " + p1.getPreco());
        
        System.out.println("Quantidade em estoque: " + p1.getQuantidade());
    }
}