public class exe10 {

    public static String parOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) {
        System.out.println(parOuImpar(4));  
    }
}

//numero % 2 == 0: O operador % calcula o resto da divisão. Se dividir o número por 2 e o resto for zero, ele é par.