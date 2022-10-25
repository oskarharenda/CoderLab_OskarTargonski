package b_Zadania_Domowe.b_Dzien_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird","kobranocka", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");
        List<String> newList = filterList(list,e->e.length()>4 && e.contains("b") && e.endsWith("a"));
        System.out.println(newList);
    }

    static List<String> filterList(List<String> l, Predicate<String> p){
        List<String> list = new ArrayList<>();
        for(String el : l){
            if(p.test(el)){
                list.add(el);
            }
        }
        return list;
    }


}
