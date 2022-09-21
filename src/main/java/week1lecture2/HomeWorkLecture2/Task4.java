package week1lecture2.HomeWorkLecture2;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(task4(8));

    }
    public static int task4(int number) {
        int sum = 1;
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0) {
                sum -= fact(i);
            } else {
                sum += fact(i);
            }
        }
        return sum;
    }
    static int fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
