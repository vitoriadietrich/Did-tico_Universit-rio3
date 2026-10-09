import java.util.Arrays;

public class exe46 {
    static <T> void trocar(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length)
            throw new IllegalArgumentException("Índice inválido");
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bia", "Caio"};
        trocar(nomes, 0, 2);
        System.out.println(Arrays.toString(nomes));
    }
}
