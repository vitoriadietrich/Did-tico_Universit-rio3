public class exe6 {

    // Método sem retorno (void) que exibe o nome e a idade
    public static void exibirIdade(String nome, int idade) {
        System.out.println(nome + " tem " + idade + " anos.");
    }

    public static void main(String[] args) {
        // Chamando o método corretamente passando uma String e um int
        exibirIdade("Carlos", 25); 
    }
}