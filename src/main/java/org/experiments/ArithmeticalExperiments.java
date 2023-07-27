package org.experiments;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic focused on arithmetical operations.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 *
 * In context of arithmetics the product supports:
 * <ul>
 *  <li>all numeric data types</li>
 *  <li>binary arithmetical operators (<b>+</b>, <b>-</b>, <b>*</b> and <b>/</b>)</li>
 *  <li>unary arithmetical operators (<b>++</b> and <b>--</b>)</li>
 *  <li>comparison operators (<b>==</b>, <b>!=</b>, <b>></b>, <b><</b>, <b>>=</b>, <b><=</b>)</li>
 * </ul>
 */
public class ArithmeticalExperiments {

    public int doSmth1(int arg1, int arg2, int arg3, int arg4) {

        return (19 + arg1) * 5  + --arg2 * ((arg3 - 3) / arg4);
    }

    public int doSmth2(int arg1, int arg2, int arg3) {

        int r = arg1 + arg2++;
        if (r > -78) {
            return --arg3 + 45;
        }
        return -934;
    }

    public int doSmthComplex1(boolean flag, int arg1) {

        int b = 1;
        if (arg1 > 500) {
            if (flag) {
                b = 300;
            } else {
                b = 7;
            }
        }
        return b;
    }

     public static int doSmthComplex2(int arg1, boolean arg2) {

        int v = 10;
        if (arg1 < 5) {
            return 67;
        } else if (arg1 < 50) {
            if (arg2) {
                arg1 = arg1 + 30;
            } else {
                v = arg1 * 5;
            }
            if (v > 50) {
                return v;
            }
            return arg1;
        } else {
            return 29;
        }
    }


    public int doSmthComplex3(boolean flag, int arg1, int arg2) {

        int b = 11;
        int c = arg2 * arg1;
        if (arg2 != 105) {
            b = arg2 + 20 / arg1 - arg1 + 54 * arg1;
        } else {
            b = arg1 - 1 + arg2 / 2;
        }
        return arg1 + b + 10 * c - 15;
    }

    public int doSmthComplex4(int arg1, int arg2) {

        int m = arg1 * arg2;
        int c = 0;
        if (m > 1200) {
            c = 1;
            if (arg2 > 4) {
                return 5;
            }
        }
        return c;
    }

}