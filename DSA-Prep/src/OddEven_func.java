import java.util.Scanner;

public class OddEven_func {
    public static void main(String []Args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the the number ");
        int a = input.nextInt();
        if (cal(a)==1) {
            System.out.print("Your number is a even number");
        }
        else System.out.print("Your nunmber is no a even number");
    }

    static int cal(int num) {
        int check;
        if (num%2==0) {
            check=1;
        }
        else check=0;
        return check;
    }
}