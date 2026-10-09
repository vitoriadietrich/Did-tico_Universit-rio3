public class exe23 {

    // 1. Primitivo: Passa uma CÓPIA do valor. O original não muda.
    public static void alteraPrimitivo(int n) {
        n = 50; // Altera só a cópia local
    }

    // 2. Array (Objeto): Passa uma CÓPIA DA REFERÊNCIA. O conteúdo muda.
    public static void alteraArray(int[] arr) {
        arr[0] = 50; // Altera o dado no endereço de memória original
    }

    public static void main(String[] args) {
        // --- Teste com int ---
        int x = 10;
        alteraPrimitivo(x);
        System.out.println(x); // Saída: 10 (Continuou igual)

        // --- Teste com Array ---
        int[] numeros = { 10, 20 };
        alteraArray(numeros);
        System.out.println(numeros[0]); // Saída: 50 (O conteúdo mudou!)
    }
}