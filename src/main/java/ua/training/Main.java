package ua.training;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 0, 4, 2, 4, 5, 7));
        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }

}
