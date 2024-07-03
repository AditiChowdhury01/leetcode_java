
import java.util.*;
public class Main
{
    public int tribonacci(int n){
        if (n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        else{
            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Main m = new Main();
	    System.out.println(m.tribonacci(n));
	}
}