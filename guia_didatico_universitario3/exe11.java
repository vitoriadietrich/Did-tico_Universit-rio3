public class exe11 {

    public static void main(String[] args) {
        double valor = 100.0;
        
        System.out.println("Subtotal: " + valor);
        System.out.println("Desconto: " + calcularDesconto(valor));
        System.out.println("Total Final: " + calcularTotalFinal(valor));
    }

    public static double calcularDesconto(double valor) {
        return valor * 0.10;
    }

    public static double calcularTotalFinal(double valor) {
        return valor - calcularDesconto(valor);
    }
}