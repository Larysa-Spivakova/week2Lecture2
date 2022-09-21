package week1lecture2.HomeWorkLecture2;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(task1(462, 1071));
        System.out.println(task1(1071, 462));
    }



        public static int task1 ( int a, int b){
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;


        }
    }