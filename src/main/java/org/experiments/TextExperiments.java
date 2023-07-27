package org.experiments;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic focused on operations with test and symbols.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 *
 * In context of operations with text the product supports:
 * <ul>
 *  <li>char data type</li>
 *  <li>String data type (with part of methods)</li>
 *  <li>operations with char values</li>
 *  <li>part of operations with String values:
 *  <ul>
 *      <li>operator +</li>
 *      <li>method chatAt</li>
 *      <li>method length</li>
 *      <li>method concat</li>
 *      <li>method equals</li>
 *      <li>method contains</li>
 *  </ul></li>
 * </ul>
 */
public class TextExperiments {

    public String doSmth1(int arg2) {

        return "r" + (10 + arg2);
    }

    public int doSmth2(String arg1) {

        return 10 * arg1.length() + "?%".length();
    }

    public char doSmth3(String arg1) {

        char c = (arg1 + "-=").charAt(4);
        if (c > 44) {
            return '@';
        } else {
            return c;
        }
    }

    public static String doSmthComplex1(short arg1, String arg2) {

        String r = null;
        if (arg2.length() < 6) {
            return  "result " + arg1;
        } else if (arg1 > 30) {
            r = "symbol";
        }
        return r;
    }

    public char doSmthComplex2(char arg1, short arg2) {

            short v;
            if (arg1 > 50) {
                v = (short) (arg1 * 2 - 70);
            } else {
                arg1++;
                v = 0;
            }
            v += 1000 + arg1;
            return (char) (v / 10);
    }


    public static double doSmthComplex3(char arg1, short arg2) {

        int v;
        if (arg1 > '-') {
            v = arg1 * 2 - 70;
        } else {
            if (arg1 < '"') {
                arg1++;
                v = arg1 + arg2;
            } else {
                v = arg2 * 15 / 12;
            }
        }
        return (double) v * 20 / 13;
    }


    public int doSmthComplex4(String arg1) {

        if (arg1.contains("IL")) {
            if (arg1 == null) {
                return 50;
            } else{
                return 'F';
            }
        }
        return 90;
    }

}