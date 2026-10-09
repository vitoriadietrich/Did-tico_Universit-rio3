public class exe30 {
    // <T> = Declara o tipo genérico (pode ser qualquer tipo: String, int, etc.)
    // O primeiro T = É o tipo que o método vai retornar (mesmo tipo do array)
    // T[] valores = Recebe um array genérico de qualquer tipo
    public static <T> T primeiro(T[] valores) {
        return valores[1];
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniel"};
        
        System.out.println("Resultado: " + primeiro(nomes));
    }
}