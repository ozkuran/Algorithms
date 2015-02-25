package com.ozkuran.algorithms.math.sumofdigits;

/**
 *  @version 0.1.3
 * Created by MahmutAli on 1/4/2001.
 * Last Updated by MahmutAli on 2/26/2015.
 * Calculates Sum of Digits
 */
public class SumOfDigits {
    int _input = 0;

    public SumOfDigits(int input){
        _input = input;
    }

    public int calculate(){
        int sum = 0;
        _input *=  2;
        while (_input != 0) {
            sum += _input % 10;
            _input /= 10;
        }
        return sum;
    }

    public int calculate(int input){
        _input = input;
        int sum = 0;
        _input *=  2;
        while (_input != 0) {
            sum += _input % 10;
            _input /= 10;
        }
        return sum;
    }
}
