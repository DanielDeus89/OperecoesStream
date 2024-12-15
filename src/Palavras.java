import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palavras {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

        List<Integer> tamanhos = palavras.stream()
                .map(t -> t.length())
                .collect(Collectors.toList());

        System.out.println(tamanhos);
    }
}
