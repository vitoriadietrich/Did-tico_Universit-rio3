public class exe14 {

    public static void main(String[] args) {
        podeVotar(19);
    }

    public static void podeVotar(int idade) {
        if (idade >= 18) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Nao pode votar");
        }
    }


}