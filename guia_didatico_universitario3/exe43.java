public class exe43 {
    static int recursiva(int[] v, int alvo, int inicio, int fim) {
        if (inicio > fim) return -1;
        int meio = inicio + (fim - inicio) / 2;
        if (v[meio] == alvo) return meio;
        if (alvo < v[meio]) return recursiva(v, alvo, inicio, meio - 1);
        return recursiva(v, alvo, meio + 1, fim);
    }
    static int iterativa(int[] v, int alvo) {
        int inicio = 0, fim = v.length - 1;
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (v[meio] == alvo) return meio;
            if (alvo < v[meio]) fim = meio - 1;
            else inicio = meio + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};
        System.out.println("Recursiva: " + recursiva(numeros, 7, 0, numeros.length - 1));
        System.out.println("Iterativa: " + iterativa(numeros, 7));
    }
}
// Ambas têm tempo O(log n); a iterativa usa menos memória.
