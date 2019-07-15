package com.cryptohash.javaworklevel;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.ejml.simple.SimpleMatrix;


/**
 * EJML is performing fast
 */


public class MatrixMultiply {
    public static void main(String[] args) {


        /**
         * Traditional Approach
         */

        System.out.println("TRADITIONAL APPROACH");
        double[][] arrayA = new double[][]{{1, 2}, {3, 4}};
        printArray(arrayA);
        System.out.println("--------------------");
        double[][] arrayB = new double[][]{{5, 6}, {7, 8}};
        printArray(arrayB);
        double[][] c = new double[arrayA.length][arrayB[0].length];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB[0].length; j++) {
                int x = 0;
                for (int k = 0; k < arrayA[i].length; k++) {
                    x += arrayA[i][k] * arrayB[k][j];
                }
                c[i][j] = x;
                System.out.println(i + "" + j + " -->" + x);
            }
        }


        /**
         * Efficient Java Matrix Library (EJML)
         *
         */

        System.out.println("-----------EJML------------");

        SimpleMatrix firstMatrix = new SimpleMatrix(arrayA);
        SimpleMatrix secondMatrix = new SimpleMatrix(arrayB);
        SimpleMatrix outputMatrix = new SimpleMatrix(c);

        SimpleMatrix multMatrix = firstMatrix.mult(secondMatrix);
        System.out.println("OUTPUT OF MULTIPLICATION");
        System.out.println("Is Identical ? " + multMatrix.isIdentical(outputMatrix, 0));

        /**
         * Deep Learning Library ND4J
         */

        /**
         * APACHE COMMON MATH -3
         */
        System.out.println("Apache Common Math");

        RealMatrix firstM = new Array2DRowRealMatrix(arrayA);
        RealMatrix secondM = new Array2DRowRealMatrix(arrayB);
        RealMatrix multiply = firstM.multiply(secondM);
        printArrayApache(multiply);

        /**
         * COLT
         */

        /**
         * LA4J
         */

        /**
         * Bench Marking --> performance testing  --> (JMH library)
         */


    }

    private static void printArrayApache(RealMatrix multiply) {
        for (int i = 0; i < multiply.getRowDimension(); i++) {
            for (int j = 0; j < multiply.getColumnDimension(); j++) {
                System.out.println(multiply.getEntry(i, j));
            }
        }
    }


    private static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i + "" + j + " " + array[i][j]);
            }
        }
    }
}
