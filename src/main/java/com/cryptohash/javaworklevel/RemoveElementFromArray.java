package com.cryptohash.javaworklevel;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4,4};

        printArray(array);
        /**
         * Traditional Approach
         */

        System.out.println("Traditional Approach");
        int[] output = removeElementData(array, 2);
        printArray(output);

        /**
         * Apache Common Lang
         */
        System.out.println("Apache common lang");
        int[] remove = ArrayUtils.remove(array, 1);
        printArray(remove);

        System.out.println("Remove multiple element using indices from array  at time");
        int[] removeAll = ArrayUtils.removeAll(array, 1, 2, 3);
        printArray(removeAll);

        System.out.println("Remove element with out index from array only first occurence");
        int[] oArray = ArrayUtils.removeElement(array, 4);
        printArray(oArray);

        System.out.println("Remove multiple element with out index from array");
        int[] oArrayMultiple = ArrayUtils.removeElements(array, 4,2,3);
        printArray(oArrayMultiple);

        System.out.println("Remove element with out index from array only all occurence");
        int[] oArrayMultipleAllOccurence = ArrayUtils.removeAllOccurences(array, 4);
        printArray(oArrayMultipleAllOccurence);





    }

    private static int[] removeElementData(int[] array, int i) {
        int[] arrayOutput = new int[array.length - 1];
        int k=0;
        for (int j = 0; j < array.length; j++) {
            if (j == i) {
                continue;
            }

            arrayOutput[k] = array[j];
            k++;
        }
        return arrayOutput;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
