package week1lecture2.HomeWorkLecture2;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(task5());

    }

    private static int task5() {
        int count = 0;
        for(int k = 100000; k <= 999999; k++){
            int number1 = k/100000; //2
            int number2 = (k%100000)/10000;
            int number3 = (k%10000)/1000;
            int number4 = (k%1000)/100;
            int number5 = (k%100)/10;
            int number6 = (k%10);

            if(number1 + number2 + number3 == number4 + number5 + number6){
                count++;
            }

        }

        return count;
    }

}
