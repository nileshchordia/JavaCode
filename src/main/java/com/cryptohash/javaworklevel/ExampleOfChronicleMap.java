package com.cryptohash.javaworklevel;

import net.openhft.chronicle.map.ChronicleMapBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * facing issue with chronicle map, don't use
 * Chronicle map is used for in-memory and persist to disk,
 * so it can load from file for persisted data
 */


public class ExampleOfChronicleMap {
    public static void main(String[] args) {
        Map<CharSequence, Integer> map = createMap();
        System.out.println("Map Length  " + map.size());
        map.put("india", 1);
        map.put("USA", 2);
        map.put("china", 3);
        map.put("japan", 4);
        map.put("canada", 5);
        System.out.println("Map Length  After Inserting " + map.size());
        System.out.println(map.get("india"));
        System.out.println(map.get("USA"));
        System.out.println(map.get("china"));


    }

    private static Map<CharSequence, Integer> createMap() {

        ChronicleMapBuilder<CharSequence, Integer> chronicleMap = ChronicleMapBuilder.of(CharSequence.class, Integer.class);
        try {
            File file = new File("/home/nilesh.chordia/idea/JavaCode/src/main/resources/map.dat");
            chronicleMap.createPersistedTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
