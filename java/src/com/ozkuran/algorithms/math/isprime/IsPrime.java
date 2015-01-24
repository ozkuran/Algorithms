package com.ozkuran.algorithms.math.isprime;

/**
 * @version 0.1.2
 * Created by MahmutAli on 1/1/2013.
 * Last Update by MahmutAli on 1/24/2015.
 * Returns if given number is a Prime Number
 */
public class IsPrime {
    public boolean isPrime(long input) {
        if (input == 1)
            return false;
        if (input < 4)
            return true;
        if (input % 2 == 0)
            return false;
        if (input < 9)
            return true;
        if (input % 3 == 0)
            return false;
        long r = (long) (Math.sqrt(input));
        int f = 5;
        while (f <= r) {
            if (input % f == 0)
                return false;
            if (input % (f + 2) == 0)
                return false;
            f += 6;
        }
        return true;
    }
}
