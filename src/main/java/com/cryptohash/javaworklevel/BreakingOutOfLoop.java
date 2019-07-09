package com.cryptohash.javaworklevel;

public class BreakingOutOfLoop {
    public static void main(String[] args) {


        String result = "";
        myBreakLabel:
        for (int i = 0; i < 2; i++) {
            result = result + "outer";
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    result = result + "inner";
                    break myBreakLabel;
                }
            }
        }
        System.out.println(result);

        System.out.println(getValue());
    }

    private static String getValue() {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result = result + "outer";
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    result = result + "inner";
                    return result;
                }
            }
        }
        return result;
    }
}
