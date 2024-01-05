import java.util.Scanner;

public class Argmno_func {
    public static void main(String [] args ){
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        if (a == Argm(a)) {
            System.out.println("It is a armgstrong number");
        }
        else System.out.print("It is not a armgstrong number");
    }
    static int Argm(int n) {
        int i,sum=0;
        for (i=1;i<=3;i++) {
            int no = n%10;
            n=n/10;
            int cube = no*no*no;
            sum = sum + cube;
        }
        return sum;
    }
}
