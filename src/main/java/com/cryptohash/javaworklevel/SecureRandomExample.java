package com.cryptohash.javaworklevel;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Standard JDK implementations of java.util.Random
 * use a Linear Congruential Generator (LCG) algorithm
 * for providing random numbers.
 * LCG is weak crypto algorithm
 * <p>
 * CSPRNG produces cryptographically strong random values
 * by using a cryptographically strong pseudo-random number generator (CSPRNG).
 */


public class SecureRandomExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();

        /**
         * generating random values
         */

        int i = secureRandom.nextInt();
        long l = secureRandom.nextLong();
        double v = secureRandom.nextDouble();
        float v1 = secureRandom.nextFloat();
        System.out.println(i + "  " + l + "  " + v + "  " + v1);

        /**
         * pass uppperbound as a parameter
         */

        int i1 = secureRandom.nextInt(10);
        System.out.println(i1);

        /**
         * generate stream values for int long double
         */
        IntStream ints = secureRandom.ints(5);
        DoubleStream doubles = secureRandom.doubles(2);
        LongStream longs = secureRandom.longs(1);
        ints.forEach(System.out::println);
        doubles.forEach(System.out::println);
        System.out.println(longs.sum());

        /**
         * stream size with inclusive origin and exclusive bound
         */

        IntStream ints1 = secureRandom.ints(3, 1, 4);
        ints1.forEach(System.out::println);


        /**
         * generate random sequence of bytes
         */


        byte[] values = new byte[124];
        secureRandom.nextBytes(values);
        for (byte value : values) {
            System.out.println(value);
        }

        /**
         * SecureRandom uses the SHA1PRNG algorithm
         */

        String algorithm = "NativePRNG";
        SecureRandom secureRandom1 = secureRandom.getInstance(algorithm);
        int i2 = secureRandom1.nextInt(3);
        System.out.println(i2);

        /**
         *
         * Every instance of SecureRandom is created with an initial seed.
         * It works as a base for providing random values and changes every time we generate a new value.
         * Remember that if we create two instances of SecureRandom with the same seed,
         * and the same sequence of method calls is made for each,
         * they will generate and return identical sequences of numbers.
         */


        secureRandom1.reseed();


    }
}
