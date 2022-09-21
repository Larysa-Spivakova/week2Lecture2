package week1lecture2.HomeWorkLecture2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(task6()));
    }
    private static int[] task6() {
        int[] valueArr = new int[20];
        for (int j = 0; j < valueArr.length; j++) {
            if ((j == 0) || (j == 1)) {
                valueArr[j] = 1;
            } else {
                valueArr[j] = valueArr[j - 2] + valueArr[j - 1];
            }
        }
        return valueArr;
    }
}
