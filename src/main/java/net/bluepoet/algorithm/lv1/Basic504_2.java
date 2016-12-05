package net.bluepoet.algorithm.lv1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


/**
 * Created by bluepoet on 2016. 12. 5..
 */
public class Basic504_2 {
    public static void main(String[] args) {
        Map<String, Integer> resultMap = new HashMap<>();

        IntStream.iterate(1, i -> i + 1).limit(1000).forEach(
                i -> {
                    if(i > 9) {
                        String share = Integer.toString(i / 10);
                        for (int x = 0; x < share.length(); x++) {
                            putData(resultMap, Character.toString(share.charAt(x)));
                        }
                    }

                    String rest = Integer.toString(i % 10);
                    putData(resultMap, rest);
                }
        );

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }
    }

    private static void putData(Map<String, Integer> map, String data) {
        if (map.get(data) == null) {
            map.put(data, 1);
        } else {
            map.put(data, map.get(data) + 1);
        }
    }
}
