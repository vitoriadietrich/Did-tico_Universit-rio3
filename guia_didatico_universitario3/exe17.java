public class exe17 {

    public static void main(String[] args) {
        somar(10, 10, 10);
    }

    public static void somar(int... valores) {
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        System.out.println(resultado);
    }


}