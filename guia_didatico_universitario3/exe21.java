public class exe21 {

    public static void main(String[] args) {
        int[] meusNumeros = {20, 12, 3, 19, 10};

        menorEMaior(meusNumeros);
        
    }

    public static void menorEMaior(int[] valores) {
        int maior = 0;
        int menor = 999;
        for (int i = 0; i < valores.length; i++) {
            if (maior < valores[i]) {
                maior = valores[i];
            }
            if (menor > valores[i]) {
                menor = valores[i];
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }

}