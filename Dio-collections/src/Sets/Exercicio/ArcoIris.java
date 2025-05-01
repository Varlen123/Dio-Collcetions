package Sets.Exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto de cores que pertencem ao arco-íris");
        Set<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Indigo");
        cores.add("Violeta");
        System.out.println(cores);

        System.out.println("Mostre as cores uma embaixo da outra");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("--------");

        System.out.println("Exiba em ordem alfabética");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("--------");

        System.out.println("Exiba em ordem inversa da que foi informada");
        List<String> coresArcoIrisList = new ArrayList<>(cores);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("--------");

        System.out.println("Exiba todas que comecem com a letra v");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        System.out.println("--------");

        System.out.println("Limpe o conjunto");
        cores.clear();
        System.out.println(cores);

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}