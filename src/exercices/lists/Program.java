package exercices.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Arthur");
        list.add("Joca");
        list.add(0, "Luis");
        list.add("Julio");
        list.add("Igor");
        list.add("Antonio");
        list.add("Lucas");
        //list.remove(1);
        //list.remove("Lucas");
        //list.removeIf(x -> x.charAt(0) == 'A');
        /*for(String n : list){
            System.out.println(n);
        }*/
        System.out.println(list);
        List<String> n = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(n);
        String firstNameA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(firstNameA);
        int  indexA = list.indexOf(list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null));
        System.out.println(indexA);

    }
}
