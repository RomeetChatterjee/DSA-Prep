import java.sql.Struct;

public class evenoddArray {
    public static void main(String[] args) {
        int[] arr = {2,345,12,6,-7896};
        int result = findnum(arr);
        System.out.println(result);
    }
    static int findnum(int[] array) {
        int count = 0;
        int i;
        for (i = 0; i <= array.length - 1; i++) {
            if (checkeven(array[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean checkeven(int num){
        int number = nofDigits(num);
        if ((nofDigits(num) % 2) == 0){
            return true;
        }
        return false;
    }

    static int nofDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}
