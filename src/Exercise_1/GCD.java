//package Exercise_1;
import java.util.*;
/**
 * This method takes two positive integers and finds their gcd using
 * Euclid's algorithm
 * @param a
 * @param b
 * @return
 */
public class GCD{
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,  a%b );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        int answer = new GCD().gcd(a,b);
        System.out.println("GCD is "+answer);
    }
}