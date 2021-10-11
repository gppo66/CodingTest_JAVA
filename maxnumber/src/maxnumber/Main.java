package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        
        int answer = 0;
        //logic
        for(int i = 0 ; i < a ; i++){
        	int b = scanner.nextInt();
        	while(b > 0) {
        		int n = b%2;
        		b/=2;
        		if(n == 1) {
        			System.out.print(answer + " ");
        			answer++;
        		}else {
        			answer++;
        		}
        	}
        	answer = 0;
        	
        }
        //output

	}

}
