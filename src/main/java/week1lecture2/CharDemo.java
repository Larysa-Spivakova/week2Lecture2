package week1lecture2;

public class CharDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;//инкрементируем переменную ch - 'Y' - это следующий по порядку символ в Unicode
        System.out.println("теперь ch содержит " + ch);

        ch = 90; // присваиваем значение 'Z'
        System.out.println("теперь ch содержит " + ch);
    }
}
