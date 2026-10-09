public class exe31 {
    public static void main(String[] args) {
        // Usando referência da classe base para processar ambos (Polimorfismo)
        FormaPagamento p1 = new Cartao();
        FormaPagamento p2 = new Pix();

        // O Java descobre sozinho qual método chamar em tempo de execução
        p1.pagar();
        p2.pagar();
    }
}

//Classe base (mãe)
class FormaPagamento {
    public void pagar() {
        System.out.println("Processando pagamento genérico...");
    }
}

//Subclasse Pix (sorescreve o método)
class Pix extends FormaPagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via PIX com sucesso!");
    }
}

//Subclasse Cartao (sobrescreve o método)
class Cartao extends FormaPagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via Cartão de Crédito aprovado!");
    }
}