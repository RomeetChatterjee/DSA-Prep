package DSAInterview;

public class CeilingofaNumber {//greatest element in array greater or = target

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceilingNoCheck(arr,target);
        System.out.println(arr[ans]);
//         Floor of a number would be same , as in ceiling we need to get the greatest number which is start=mid+1 , the thing which is not changing is end
//         So instead os start return end
    }
    static int ceilingNoCheck(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if (target>arr[end]){
            System.out.println("No cieling");
        }
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return end;
    }

}
