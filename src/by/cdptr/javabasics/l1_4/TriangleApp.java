package by.cdptr.javabasics.l1_4;

public class TriangleApp {

    public static void main(String[] args) {

        double a = 32;
        double b = 47;

        System.out.printf("Гипотенуза треугольника - " + "%.2f",Triangle.hypo(a,b));
        System.out.printf("\nПлощадь треугольника - " + "%.2f",Triangle.square(a,b));

    }

}
