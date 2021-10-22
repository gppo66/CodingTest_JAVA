package maxnumber;
import java.util.*;

public class Main {
 
	
	
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] j = new int[3];
		int n = b;
		for(int i = 0 ; i < j.length ; i++) {			
			j[i] = n%10;
			n = n/10;
		}
		System.out.println(a*j[0]);
		System.out.println(a*j[1]);
		System.out.println(a*j[2]);
		System.out.println(a*b);
		
	}
}