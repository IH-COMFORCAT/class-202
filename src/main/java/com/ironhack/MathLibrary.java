package com.ironhack;

import java.util.List;

public class MathLibrary {

    public int add(int i, int x) {
        return i + x;

    }

    public  int sumList(List<Integer> nums) {
        int result = 0;
        for (Integer num: nums) {
            result += num;
        }

        return result;
    }



}
