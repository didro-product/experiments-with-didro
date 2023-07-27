package org.experiments;

import org.service.SomeService;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic with operation with objects of different classes. Any class except
 * String are being treated as third-party class and in case of some actions with instances of them mocks will be made.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 */
public class ObjectExperiments {

    public SomeService doSmth1(SomeService arg1, int arg2) {

        int v = arg1.getIntValue() + 10 + arg2;
        arg1.getGreaterIntValue(v);
        return arg1;
    }

    public int doSmth2(SomeService arg1, String arg2, int arg3) {

        if (30 < arg1.getGreaterIntValue(arg3)) {
            String s = arg1.getLongerStringValue(arg2);
            if (5 > s.length()) {
                return 66;
            }
        }
        return 45;
    }

    public SomeService doSmth3(String arg1, SomeService arg2) {

        int v = arg2.getIntValue();
        SomeService r = null;
        if (v > arg1.length()) {
            r = arg2;
        }
        return r;
    }

    public int doSmthComplex1(SomeService arg1) {

        String s = arg1.getStringValue();
        if (s == null) {
            return 301;
        } else if (s.length() < arg1.getIntValue()) {
            return 200;
        }
        return 100;
    }

     public int doSmthComplex2(SomeService arg1, String arg2, SomeService arg4) {

        SomeService s1 = arg1;
        if (s1 != null) {
            SomeService s2 = s1;
            if (s2.getIntValue() > 16) {
                return 101;
            }
            return arg4.getIntValue();
        }
        String r = arg4.getStringValue();
        return r.length();
    }

}