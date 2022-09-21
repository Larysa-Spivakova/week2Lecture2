package week1lecture2;

public class App {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a); //a = 5
        System.out.println("b = " + b); //b = 3
    }
}
