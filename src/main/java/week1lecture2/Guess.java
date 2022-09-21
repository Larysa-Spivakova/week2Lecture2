package week1lecture2;

import java.io.IOException;

public class Guess {

    public static void main(String[] args) throws IOException {

        char ch, answer = 'K';

        System.out.println("This letter from A-Z");
        System.out.println("Try to guess it: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println(" *** Right! *** ");
        else System.out.println(" Sorry, you don't guess");

    }
}
