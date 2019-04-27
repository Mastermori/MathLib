package de.mathlib;

public class Utils {

    public static boolean binaryCheck(int b1, int b2) {
        return (b1 & b2) != 0;
    }

    public static float clamp(float val, float min, float max) {
        return val < min ? min : val > max ? max : val;
    }

}
