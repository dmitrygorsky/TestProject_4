package by.cdptr.javabasics.l1_4;

public class Triangle {

    public static double hypo (double a, double b) {

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        return c;

    }

    public static double square (double a, double b) {

        double d = (a * b) / 2;

        return d;

    }

}
