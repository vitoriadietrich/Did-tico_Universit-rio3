public class exe2 {

    // Método que recebe uma String como parâmetro
    public static void mostrarNome(String nome) {
        System.out.println("Nome: " + nome);
    }

    public static void main(String[] args) {
        // Testando o método com dois nomes diferentes
        mostrarNome("Maria");
        mostrarNome("João");
    }
}