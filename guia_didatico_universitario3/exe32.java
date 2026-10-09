// 1. Criando a interface com o método abstrato e o default
interface Notificador {
    // Método abstrato (obrigatório de ser implementado pelas classes)
    void enviar(String mensagem);

    // Método default (já tem uma implementação padrão, não é obrigatório sobrescrever)
    default void enviarBoasVindas() {
        System.out.println("Olá! Seja muito bem-vindo ao nosso sistema.");
    }
}

// 2. Implementando a interface na classe Email
class Email implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-MAIL: " + mensagem);
    }
}

// 3. Implementando a interface na classe SMS
class SMS implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

public class exe32 {
    public static void main(String[] args) {
        Notificador email = new Email();
        Notificador sms = new SMS();

        // Usando o método abstrato implementado em cada classe
        email.enviar("Sua fatura fechou.");
        sms.enviar("Seu código de acesso é 9876.");

        System.out.println("-----------------------------------");

        // Usando o método default herdado diretamente da interface
        email.enviarBoasVindas();
        sms.enviarBoasVindas();
    }
}