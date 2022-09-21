package week1lecture2.HomeWorkLecture2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(task3(17));
        System.out.println(task3(9));
        System.out.println(task3(18));
    }

    private static boolean task3(int value) {
        boolean result = false;
        int divider = 2;
        if (value == 2) {
            return true;
        }
        while (value != divider){
            if (value % divider++ == 0) {
                return false;
            } else {
                result = true;
            }
        }
        return result;
    }
}
