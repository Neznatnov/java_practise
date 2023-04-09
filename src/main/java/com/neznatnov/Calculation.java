package com.neznatnov;

public class Calculation {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 4.9F;
        double f = 4.9;
        boolean g = true;
        boolean h = false;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - c));
        System.out.println("a * b = " + (a * d));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
        System.out.println("a && b = " + (g && h));
        System.out.println("a || b = " + (g || h) );
        System.out.println("!(a && b) = " + !(g && h));
        // int + double
        System.out.println("f + c = " + (f + c));
        System.out.println("f - c = " + (f - c));
        System.out.println("f * c = " + (f * c));
        System.out.println("f / c = " + (f / c));
        System.out.println("f % c = " + (f % c));
        System.out.println("c % f = " + (c % f));
        System.out.println("f++   = " +  (f++));
        System.out.println("f--   = " +  (f--));
        System.out.println("c++   = " +  (c++));
        System.out.println("++c   = " +  (++c));
    }
}
