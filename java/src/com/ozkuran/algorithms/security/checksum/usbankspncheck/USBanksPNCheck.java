package com.ozkuran.algorithms.security.checksum.usbankspncheck;

import java.util.ArrayList;

/**
 * @version 0.1.2
 * Created by MahmutAli on 4/4/2003.
 * Created by MahmutAli on 2/26/2015.
 * Implementation of US Banks Nine Digit Processing Number Check Method
 */
public class USBanksPNCheck {
    ArrayList<Integer> _numberList;

    public USBanksPNCheck(ArrayList<Integer> input) {
        _numberList = input;
    }

    public boolean check() {
        boolean result = false;
        int modSum = 0;
        if(_numberList.size() == 9) {
            modSum = _numberList.get(0)*3 + _numberList.get(1)*7 + _numberList.get(2) +
                     _numberList.get(3)*3 + _numberList.get(4)*7 + _numberList.get(5) +
                     _numberList.get(6)*3 + _numberList.get(7)*7 + _numberList.get(8);
        }
        if ((modSum % 10) == 0){
            result = true;
        }
        return result;
    }
}
