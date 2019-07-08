package com.cryptohash.javaworklevel;

import net.openhft.chronicle.map.ChronicleMap;


/**
 * not done
 */

public class KeyValueChronicalMap {
    public static void main(String[] args) {
        ChronicleMap<Long,String> inMememoryMap = ChronicleMap.of(Long.class,String.class)
                .name("country-map").entries(50).averageValue("america").create();


    }
}
