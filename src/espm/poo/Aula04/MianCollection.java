package espm.poo.Aula04;
import java.util.Set;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class MianCollection {

    public static void main(String[] args){
        Set<Integer> inteiros = new TreeSet<Integer>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(inteiros).toArray()));

        List<Integer> linteiros = new ArrayList<>();
        linteiros.add(3);
        linteiros.add(2);
        linteiros.add(1);
        linteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(inteiros).toArray()));

        Set<Aluno> salunos = new TreeSet<>();
        salunos.add(new Aluno(10, "Dezmini"));
        salunos.add(new Aluno(2, "Doismini"));
        salunos.add(new Aluno(10, null));
        System.out.println(Arrays.toString(Arrays.asList(inteiros).toArray()));

        List<Aluno> lalunos = new ArrayList<>();
        lalunos.add(new Aluno(10, "Dezmini"));
        lalunos.add(new Aluno(2, "Doismini"));
        lalunos.add(new Aluno(10, null));
        System.out.println(Arrays.toString(Arrays.asList(inteiros).toArray()));

        Map<Integer, Aluno> mapa = new HashMap<>();
        mapa.put(10, new Aluno(10, "Dezmini"));
        mapa.put(2, new Aluno(1, "Doismini"));
        mapa.forEach((k,v) -> System.out.println(k + " -> " + v));




    }
    
}
