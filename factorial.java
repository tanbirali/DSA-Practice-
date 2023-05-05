import java.util.*;

class factorial{

    public static long fact(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number you want to find the factorial of");
     int n = sc.nextInt();
     long res = fact(n);
     System.out.println("The factorial is : "+ res);   
    }
}