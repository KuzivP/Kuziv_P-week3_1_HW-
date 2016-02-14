package ua.artcode.week1.test;

import ua.artcode.week1.ds.tree.MyHashMap;

import java.util.Map;

/**
 * Created by master on 13.02.16.
 */
public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<Integer,String>();



        map.put(1,"Kolia");
        // true desc
        boolean putRes = map.size() == 1;
        String inputPut = "map.put(1,\"Kolia\")";
        int expectedPut = 1;
        int actualPut = map.size();

        System.out.printf("result %s, input %s, expected size %d, actual size %d",
                                    putRes, inputPut, expectedPut, actualPut);


    }
}
