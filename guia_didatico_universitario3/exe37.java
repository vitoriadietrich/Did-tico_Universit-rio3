import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class exe37 {
    static String lerArquivo() throws IOException {
        return Files.readString(Paths.get("texto.txt"));
    }

    public static void main(String[] args) {
        try {
            System.out.println(lerArquivo());
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo: " + e.getMessage());
        }
    }
}
