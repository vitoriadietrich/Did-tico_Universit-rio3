public class exe41 {
    static long recursivo(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Use 0 a 20");
        return n <= 1 ? 1 : n * recursivo(n - 1);
    }
    static long iterativo(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Use 0 a 20");
        long resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }
    public static void main(String[] args) {
        for (int n : new int[]{0, 1, 5, 20}) {
            System.out.println(n + "! recursivo: " + recursivo(n)
                    + " | iterativo: " + iterativo(n));
        }
        // 21! ultrapassa long. Recursão muito profunda pode estourar a pilha.
    }
}
