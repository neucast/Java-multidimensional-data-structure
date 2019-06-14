package org.java.datastructure;

import java.util.HashMap;
import java.util.Map;

public class MultidimensionalHashMap {

    public static void main(String[] args) {

        // Define table.
        Map<Integer, Map<Integer, Double>> table = new HashMap<Integer, Map<Integer, Double>>();

        // Create test hashmap.

        int counter = 0;

        for (int x = 1; x <= 2; x++) {

            System.out.println("x:: " + x);

            Map<Integer, Double> yMap = new HashMap<Integer, Double>();

            for (int y = 1; y <= 2; y++) {
                counter++;
                System.out.println("y:: " + y);
                System.out.println("counter:: " + counter);
                double value = counter * 2.0;
                System.out.println("value:: " + value);
                yMap.put(y, value);
            }

            table.put(x, yMap);
        }

        System.out.println("table size:: " + table.size());
        System.out.println("table values:: " + table.values());
        System.out.println("table.toString:: " + table.toString());

        System.out.println("table(2,2)::" + table.get(2).get(2));
    }


}
