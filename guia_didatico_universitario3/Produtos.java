public class Produtos {
    
    private String nome;
    private double preco;
    private int quantidade;
    private final int limiteEstoque = 5;

    public static void main(String[] args) {
        // Código principal aqui, se precisar
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Erro: O preço deve ser acima de 0!");
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        // Se a quantidade for menor que o limite definido (5), avisa que precisa repor
        if (this.quantidade < limiteEstoque) {
            System.out.println("Aviso: Precisa repor o estoque! (Atual: " + this.quantidade + ")");
        }
        return this.quantidade;
    }
}