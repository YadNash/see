import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calSquares(n);
        System.out.println("Total number of Squares:"+ans);
    }

    public static int calSquares(int n){
        int total = 0;
        for (int i = 1; i <=n ; i++) {
            total += i*i;
        }
        return total;
    }
}
