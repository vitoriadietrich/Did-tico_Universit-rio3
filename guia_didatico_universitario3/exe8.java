public class exe8 {

    public static int maiorDeDois(int a, int b) {
        return a > b ? a : b;

        //a > b ? a : b: Esse é o operador ternário. Ele funciona assim: se a for maior que b (a > b), retorne a; caso contrário (:), retorne b.
    }

    public static void main(String[] args) {
        System.out.println(maiorDeDois(2, 6));
    }
}