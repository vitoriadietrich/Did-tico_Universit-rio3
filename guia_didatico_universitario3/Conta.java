public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new IllegalStateException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    // Método principal para testar a classe pelo terminal
    public static void main(String[] args) {
        Conta minhaConta = new Conta(100.0);
        
        minhaConta.depositar(50.0);
        System.out.println("Saldo atual: " + minhaConta.consultarSaldo()); // Deve mostrar 150.0

        minhaConta.sacar(30.0);
        System.out.println("Saldo atual: " + minhaConta.consultarSaldo()); // Deve mostrar 120.0

        // Testando erro (vai lançar uma exceção no terminal)
        // minhaConta.sacar(500.0); 
    }
}