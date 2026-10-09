public class exe19 {

    public static void main(String[] args) {
        validarSenha("12345678");
    }

    public static void validarSenha(String senha) {
        if (senha == null || senha.isEmpty() || senha.length() < 8) {
            System.out.println("Senha inválida.");
        } else {
            System.out.println("Senha válida!");
        }
        
    }

}