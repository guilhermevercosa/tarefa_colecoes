import java.util.*;
import java.util.stream.Collectors;

public class colecoes {
    public static void main(String[] args) {
        // Parte 1: Nomes pré-definidos e ordenados
        String[] nomes = {"Guilherme Dias", "Luana Ferreira", "Carlos Silva", "Ana Souza", "Bruno Oliveira"};
        List<String> listaNomes = Arrays.stream(nomes)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nNomes em ordem alfabética:");
        listaNomes.forEach(System.out::println);
    }
}