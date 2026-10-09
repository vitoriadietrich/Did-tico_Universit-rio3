public class exe28 {

    /**
     * Calcula o valor dos juros simples com base no capital inicial,
     * na taxa de juros e no período de tempo.
     *
     * @param capital O valor principal investido ou emprestado (deve ser maior que zero).
     * @param taxa    A taxa de juros aplicada por período (deve ser maior que zero).
     * @param tempo   O período de tempo da aplicação (deve ser maior que zero).
     * @return O valor total dos juros calculados.
     * @throws IllegalArgumentException Se o capital, a taxa ou o tempo forem menores ou iguais a zero.
     */
    public static double calcularJuros(double capital, double taxa, int tempo) {
        if (capital <= 0 || taxa <= 0 || tempo <= 0) {
            throw new IllegalArgumentException("Erro: Capital, taxa e tempo devem ser maiores que zero.");
        }
        
        return capital * taxa * tempo;
    }

    public static void main(String[] args) {
        // Criando um objeto para poder chamar o método não-estático,
        // ou transformando o método em static (fizemos static acima para facilitar o teste direto)
        
        double resultado = calcularJuros(0.0, 0.05, 12);
        
        System.out.println("O valor total dos juros é: R$ " + resultado);
    }
}