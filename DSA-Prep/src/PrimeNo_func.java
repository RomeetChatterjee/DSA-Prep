import java.util.Scanner;

public class PrimeNo_func {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = input.nextInt();
        boolean check = isPrime(number);
        System.out.print(check);

    }
    static boolean isPrime(int n){
        if (n<=1){
            return true;
        }
        int c =2;
        while(c*c<=n) {
            if (n%2 == 0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}

