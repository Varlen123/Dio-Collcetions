import java.util.*;
import java.util.stream.Collectors;

public class StreamExemplo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Pedro", "Joana", "Bia", "João");

        List<String> resultado = nomes.stream() 
            .filter(nome -> nome.length() > 4) 
            .map(String::toUpperCase)         
            .sorted()                         
            .collect(Collectors.toList());   

        System.out.println(resultado); 
    }
}
