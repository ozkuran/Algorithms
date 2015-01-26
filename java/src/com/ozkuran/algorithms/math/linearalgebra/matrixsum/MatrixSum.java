package com.ozkuran.algorithms.math.linearalgebra.matrixsum;

/**
 * @version 0.1.3.3
 * Created by MahmutAli on 1/2/2009.
 * Last Update by MahmutAli on 1/26/2015.
 */

public class MatrixSum {
    public Integer[][] sum(Integer[][] m1, Integer[][] m2){
        Integer m = m1[0].length;
        Integer n = m1.length;
        if (m == m2[0].length && n == m2.length){
            Integer[][] output = new Integer[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    output[i][j] = m1[i][j] + m2[i][j];
                }
            }
            return output;
        }
        else{
            return m1;
        }
    }

    public Double[][] sum(Double[][] m1, Double[][] m2){
        Integer m = m1[0].length;
        Integer n = m1.length;
        if (m == m2[0].length && n == m2.length){
            Double[][] output = new Double[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    output[i][j] = m1[i][j] + m2[i][j];
                }
            }
            return output;
        }
        else{
            return m1;
        }
    }

}
