public class exe12 {
// 12. Crie `media(double n1, double n2, double n3)` e `situacao(double media)`.
static double resultado;
    public static void main(String[] args) {
        media(10.0, 6.0, 8.5);
        situacao(resultado);
    }

    public static void media(double n1, double n2, double n3) {
        resultado = ((n1 + n2 + n3) / 3);
    }

    public static void situacao(double media) {
        media = resultado;
        
        System.out.println("Media = " + media);
        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}