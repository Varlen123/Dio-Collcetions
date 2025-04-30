package Sets.ConhecendoMetodos;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrimeiraParte {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjnto: " + notas.contains(5d));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota" + Collections.max(notas));
    Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
    while (iterator.hasNext()) {
        Double next = iterator.next();
            soma += next;
            System.out.println("A soma dos valores é" + soma);
        }
       System.out.println("a média é" + (soma/notas.size())); 
       notas.remove(0d);
       System.out.println("nota 0 removida");

       Iterator<Double> iterator2 = notas.iterator();
       while (iterator.hasNext()) {
        Double next = iterator2.next();
        if (next <= 7) iterator2.remove();
        System.out.println("notas");
       }

       Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
       Set<Double> notas3 = new TreeSet<>(notas2);
       System.out.println(notas3);
       System.out.println("Apague todo o conjunto");
       notas.clear();

       System.out.println("Verifique se o conjunto está vazio: " + notas2.isEmpty());
       System.out.println("Verifique se o conjunto está vazio: " + notas.isEmpty());

    }    
}
