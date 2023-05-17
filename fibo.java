import java.util.Scanner;

public class fibo {
    static int fibo(int n ){
        if( n <= 1)
            return 1;
        return fibo(n-2) + fibo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.print(fibo(i)+ ", ");
        }
    }
}
