package lesson1;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // true,- chisht  false-sxal
        if (x < y) {
            System.out.println("x менше y ");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x teper ravno y ");

        }
        x = x * 2;
        if (x > y) {
            System.out.println("x teper bolshe y");
        }
        if (x == y) {
            System.out.println("x vi ne uvidite etogo");

        }
    }
}