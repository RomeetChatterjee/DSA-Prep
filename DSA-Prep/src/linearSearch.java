public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12,56,78,15,35,8};
        int check = 15;
        int afterCheckIndex = linearSearchIndex(arr,2,4,check);
        System.out.println(afterCheckIndex);
    }

    static int linearSearchIndex(int [] array,int startIndex, int endIndex,int element) {
        if (array.length == 0) {
            return -1;
        }
        for (int Index = startIndex;Index<=endIndex;Index++) {
            if (array[Index] == element) {
                return Index;
            }
        }
        return -1;
    }
    static boolean linearSearchCheck(int[] array,int startIndex, int endIndex,int element) {
        if (array.length ==0) {
            return false;
        }
        for (int i=startIndex;i<=endIndex;i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
