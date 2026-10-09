public class exe49 {
    static class CompraService {
        /** Calcula o valor final. Contrato: quantidade > 0 e preço >= 0. */
        public double calcularCompra(int quantidade, double preco, boolean vip) {
            validar(quantidade, preco);
            double subtotal = calcularSubtotal(quantidade, preco);
            return aplicarDesconto(subtotal, vip);
        }
        private void validar(int quantidade, double preco) {
            if (quantidade <= 0 || preco < 0) throw new IllegalArgumentException("Dados inválidos");
        }
        private double calcularSubtotal(int quantidade, double preco) {
            return quantidade * preco;
        }
        private double aplicarDesconto(double subtotal, boolean vip) {
            return vip ? subtotal * 0.9 : subtotal;
        }
    }
    public static void main(String[] args) {
        CompraService service = new CompraService();
        System.out.println(service.calcularCompra(2, 15, true));
    }
}
// Exemplo da versão refatorada: sem alterar estado e com cada tarefa em método privado.
