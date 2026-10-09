public class exe48 {
    static class SaldoInsuficienteException extends Exception {
        SaldoInsuficienteException(String mensagem) { super(mensagem); }
    }
    static class Conta {
        double saldo = 50;
        void sacar(double valor) throws SaldoInsuficienteException {
            if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
            if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente");
            saldo -= valor;
        }
    }
    public static void main(String[] args) {
        try {
            Conta conta = new Conta();
            conta.sacar(70);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
