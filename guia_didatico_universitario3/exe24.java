public class exe24 {
    public static void main(String[] args) {
        System.out.println(calcularFrete(10));// Apenas valor
        System.out.println(calcularFrete(10, 20));// Valor e desconto
        System.out.println(calcularFrete(10, 20, 3)); // Valor, desconto e quantidade (promoção)
    }

    public static double calcularFrete(double valor) {
        double taxaFixa = 8.0;
        return valor + taxaFixa;
    }

    public static double calcularFrete(double valor, double desconto) {
        double taxaFixa = 8.0;
        double valorComDesconto = valor - (valor * desconto / 100);
        return valorComDesconto + taxaFixa;
    }

    public static double calcularFrete(double valor, double desconto, int quantidade) {
        double taxaFixa = 8.0;
        
        double valorComDesconto = valor - (valor * desconto / 100);
        
        int quantidadePaga;
        
        if (quantidade == 2) {
            quantidadePaga = 1;
        } else {
            quantidadePaga = quantidade;
        }
        
        double valorTotalProdutos = valorComDesconto * quantidadePaga;
        
        return valorTotalProdutos + taxaFixa;
    }
}