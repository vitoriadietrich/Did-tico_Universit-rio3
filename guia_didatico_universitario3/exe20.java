public class exe20 {

    public static void main(String[] args) {
        int[] meusNumeros = {20, 12, 3, 19, 10};
        
        System.out.println(contarPares(meusNumeros));
        
    }

    public static int contarPares(int[] numeros) {
        int conte = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                conte++;
            }
        }
        return conte;
    }

}