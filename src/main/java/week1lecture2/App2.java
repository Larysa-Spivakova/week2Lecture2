package week1lecture2;

public class App2 {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        a = a + b; // a = 8, b = 5
        b = a - b; // a = 8, b = 3
        a = a - b; // a = 5, b = 3

        System.out.println("a = " + a); //a = 5
        System.out.println("b = " + b); // b = 3
    }
}
