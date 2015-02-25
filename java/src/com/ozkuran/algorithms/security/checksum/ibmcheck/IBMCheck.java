package com.ozkuran.algorithms.security.checksum.ibmcheck;

import com.ozkuran.algorithms.math.sumofdigits.SumOfDigits;

import java.util.ArrayList;

/**
 * @version 0.1.2
 * Created by MahmutAli on 1/4/2001.
 * Created by MahmutAli on 2/26/2015.
 * Implementation of IBM Check Method
 */
public class IBMCheck {
    ArrayList<Integer> _numberList;

    public IBMCheck(ArrayList<Integer> input) {
        _numberList = input;
    }

    public boolean check() {
        boolean result = false;
        int modSum = 0;
        SumOfDigits sod = new SumOfDigits(0);
        for(int i = 0; i < _numberList.size(); i++){
            if ( (i % 2) == 0){
                modSum += sod.calculate(_numberList.get(i));
            }
            else{
                modSum += _numberList.get(i);
            }
        }
        if ((modSum % 10) == 0){
            result = true;
        }
        return result;
    }
}
