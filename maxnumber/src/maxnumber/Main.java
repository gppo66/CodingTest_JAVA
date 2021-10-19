package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        int min = 0;
        
        for(int i = m ; i <= n ; i++) {
        	for(int j = 2 ; j <= i ; j++) {
        		if(j == i) {
        			sum += i;
        			if(min == 0) min = i; 
        		}
        		if(i % j == 0) break;
        	}
        }
        if(sum == 0) {
            System.out.println(sum-1);        	
        }
        else {
            System.out.println(sum);        	
        	System.out.println(min);
        }
	}
}
