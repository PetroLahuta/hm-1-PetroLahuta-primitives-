package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = 4;
        byte a1 = 5;
        byte a2 = (byte) (a + a1);
        byte a3 = (byte) (a1 - a);
        byte a4 = (byte) (a * a1);
        byte a5 = (byte) (a4 / 2);

        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        short b = 1000;
        short b1 = 500;
        short b2 = (short) (b + b1);
        short b3 = (short) (b2 - 3000);
        short b4 = (short) (b2 * b1);
        short b5 = (short) (b2 / b1);

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        long c = 200000L;
        long c1 = (long) (c + 50000L);
        long c2 = c + c1;
        long c3 = c2 - c;
        long c4 = c * c1;
        long c5 = c3 / 50000L;

        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        double d = 10;
        double d1 = d + 0.1;
        double d2 = d + d1;
        double d3 = d1 - d;
        double d4 = d3 * d1;
        double d5 = d1 / d;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        float e = 2.8F;
        float e1 = e + 0.3F;
        float e2 = e + e1;
        float e3 = e2 - e;
        float e4 = e1 * e2;
        float e5 = e2 / e;

        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

    }
}
