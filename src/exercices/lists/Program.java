package exercices.lists;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(0, 5);
        list.add(3);
        list.add(6);
        list.add(10);
        list.remove(1);
        list.removeIf(x -> x == 3);
        for(Integer n : list){
            System.out.println(n);
        }
    }
}
