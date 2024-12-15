import java.util.Arrays;
import java.util.List;

public class Nomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana");

        nomes.forEach(n -> System.out.println("Olá, " + n + "!"));
    }
}
