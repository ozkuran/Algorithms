package com.ozkuran.algorithms.security.checksum.tendigitisbncheck;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 0.1.2
 * Created by MahmutAli on 1/4/2001.
 * Created by MahmutAli on 2/26/2015.
 * Implementation of IBM Check Method
 */
public class TenDigitISBNCheck {
    ArrayList<Integer> _isbnNumber;

    public TenDigitISBNCheck (ArrayList<Integer> isbnNumber){
        _isbnNumber = isbnNumber;
    }

    public boolean check(){
        boolean result = false;
        int size = _isbnNumber.size();
        if (size != 10){
            return false;
        }
        int modSum = 0;
        for(int i = 0; i < size; i++){
                modSum += _isbnNumber.get(i) * (size - i);
        }
        if ((modSum % 10) == 0){
            result = true;
        }
        return result;
    }
}
