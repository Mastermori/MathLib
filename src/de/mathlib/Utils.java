package de.mathlib;

import java.util.List;

public class Utils {

    public static boolean binaryCheck(int b1, int b2) {
        return (b1 & b2) != 0;
    }

    public static float clamp(float val, float min, float max) {
        return val < min ? min : val > max ? max : val;
    }

    public static boolean allTrue(boolean[] bools) {
        for (boolean b : bools) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static int[] listToArray(List<Integer> list){
        int size = list.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
