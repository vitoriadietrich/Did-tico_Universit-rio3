public class exe44 {
    static class PedidoService {
        void validar(int quantidade) {
            if (quantidade <= 0) throw new IllegalArgumentException("Quantidade inválida");
        }
        double calcular(int quantidade, double preco) { return quantidade * preco; }
        boolean aprovar(double total) { return total <= 100; }
        String resumo(double total, boolean aprovado) {
            return "Total: R$ " + total + " | " + (aprovado ? "Aprovado" : "Negado");
        }
    }
    public static void main(String[] args) {
        PedidoService service = new PedidoService();
        service.validar(2);
        double total = service.calcular(2, 10);
        System.out.println(service.resumo(total, service.aprovar(total)));
    }
}
