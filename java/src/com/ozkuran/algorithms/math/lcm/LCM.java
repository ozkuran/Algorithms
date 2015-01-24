package com.ozkuran.algorithms.math.lcm;

import com.ozkuran.algorithms.math.gcd.GCD;

/**
 * @version 0.1.7
 * * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Greatest Least Common Multiplier
 */
public class LCM {
    /**
     * @param first
     * @param second
     * @return
     * @should return Least Common Multiplier of first and second
     *
     */
    public int lcm(int first, int second) {
        if (first == 0 && second == 0) {
            return 0;
        }
        else if (first == 0){
            return second;
        }
        else if (second == 0){
            return first;
        }
        else
        {
            GCD gcd = new GCD();
            return (Math.abs(first * second) / gcd.gcd(first, second));
        }
    }
}
