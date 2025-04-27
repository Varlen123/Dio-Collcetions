package Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//ArrayList deve ser usado onde mais operações de pesquisas são necessárias, e LinkedList quando mais operações de inserção e remoção forem necessárias
public class TestesLists {
        public static void main(String[] args) {
            System.out.println("Crie uma lista e adicione 7 notas");

         List<Double> notas = new ArrayList<Double>();
            notas.add(7.0);
            notas.add(8.5);
            notas.add(9.3);
            notas.add(5.0);
            notas.add(7.0);
            notas.add(0.0);
            notas.add(3.6);
        System.out.println(notas.toString()); //toString transforma o array em string
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));   //indexOf retorna a posição da nota
            notas.add(4, 8.0); //adiciona uma posição na lista e depois a nota que eu quero adc
         System.out.println(notas.toString());
            notas.set(notas.indexOf(5.0), 6.0); //substitui a nota 5.0 pela 6.0
        System.out.println(notas);
        System.out.println(("o objeto 9.3 está na lista?" + notas.contains(9.3))); //contains verifica so objeto 9.3 esta na lista
                   System.out.println("Exiba todas as notas na ordem em que foram informados");
            for (Double nota : notas) {
                System.out.println(nota);
            }

            System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
            System.out.println(notas.toString());
            System.out.println("Exiba a menor nota: " + Collections.min(notas));
            System.out.println("Exiba a maior nota: " + Collections.max(notas));
            
    }
}