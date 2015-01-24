package com.ozkuran.algorithms.math.gcd;

/**
 * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Greatest Common Divisor Calculator
 */
public class GCD {
    /**
     * @version 0.1.13
     * @param first
     * @param second
     * @return
     * @should return Greatest Common Divisor of first and second
     *
     */
    public int gcd(int first, int second) {
        if (first == 0 || second == 0) {
            return 0;
        }
        else
        {
            if (first >= second){
                if(first % second == 0) return second;
                return gcd(second, first % second);
            }
            else {
                if(second % first == 0) return first;
                return gcd(first, second % first);
            }
        }
    }
}
