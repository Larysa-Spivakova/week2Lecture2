package week1lecture2.HomeWorkLecture2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(task2(462));
    }

    private static int task2(int value) {
            int result = 0;
            do {
                result += value % 10;
            }
            while ((value /= 10) != 0);
            return result;


        }
    }

