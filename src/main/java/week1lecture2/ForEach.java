package week1lecture2;

public class ForEach {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 56, 7, 8, 9, 10 };
        int sum = 0;

        // use for-each style for to display sum the value
        for(int x : nums) {
            System.out.println(" Value is: " + x);
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}
