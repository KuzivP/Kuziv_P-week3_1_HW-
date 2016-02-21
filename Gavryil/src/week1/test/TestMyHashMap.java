package ua.artcode.week1.test;



import ua.artcode.week1.ds.tree.MyHashMap;

import java.util.Map;

/**
 * Created by gavri on 20.02.2016.
 */
public class TestMyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>();
        System.out.println(map.put(2,"OOO"));
        System.out.println(map.put(1,"AAA"));
        System.out.println(map.put(2,"AAA"));
        System.out.println(map.put(18,"CCC"));
        System.out.println( map.remove(18));


    }
}
