package com.cryptohash.javaworklevel;

import java.util.ArrayList;
import java.util.List;

public class MatrixTranspose {
    public static void main(String[] args) {
        List<List<String>> listList = new ArrayList<>();
        listList.add(List.of("1", "2", "3", "4"));
        listList.add(List.of("5", "6", "7", "8"));
        listList.add(List.of("9", "10", "11", "12"));
        listList.add(List.of("13", "14", "15", "16"));

        List<List<String>> transpose = transpose(listList);
        transpose.forEach(System.out::println);

    }

    private static List<List<String>> transpose(List<List<String>> listList) {
        List<List<String>> transposeList = new ArrayList<>();

        for (int i = 0; i < listList.get(0).size(); i++) {
            List<String> list = new ArrayList<>();
            for (List<String> stringList : listList) {
                list.add(stringList.get(i));
            }
            transposeList.add(list);
        }
        return transposeList;
    }

}
