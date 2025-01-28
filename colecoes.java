import java.util.*;
import java.util.stream.Collectors;

public class colecoes {
    public static void main(String[] args) {
        String[] nomes = {"Guilherme Dias", "Luana Ferreira", "Carlos Silva", "Ana Souza", "Bruno Oliveira"};
        List<String> listaNomes = Arrays.stream(nomes)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nNomes em ordem alfabética:");
        listaNomes.forEach(System.out::println);

        String[] nomesComGenero = {
                "Guilherme Dias - M",
                "Luana Ferreira - F",
                "Carlos Silva - M",
                "Ana Souza - F",
                "Bruno Oliveira - M"
        };

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String item : nomesComGenero) {
            String[] partes = item.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toUpperCase();
                if ("M".equals(genero)) {
                    masculinos.add(nome);
                } else if ("F".equals(genero)) {
                    femininos.add(nome);
                }
            }
        }

        System.out.println("\nGrupo Masculino:");
        masculinos.forEach(System.out::println);

        System.out.println("\nGrupo Feminino:");
        femininos.forEach(System.out::println);
    }
}
