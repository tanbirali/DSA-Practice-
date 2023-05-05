// Use recursion to count the number of stairs

import java.util.Scanner;

public class staircase {
    static int numOfStairs( int n ){
        int res = 0;
        if(n<=1)
        return 1;
        else 
        res = numOfStairs(n-1) + numOfStairs(n-2);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int n = sc.nextInt();
        int ans = numOfStairs(n+1);
        System.out.println("The number of stairs needed are " + ans);
   }
}
