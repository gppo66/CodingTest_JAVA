package maxnumber;
import java.util.*;

public class Main {
 
	
	
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 666;
		int count = 1;
		int answer = 0;
		while(count != n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
				answer = num;
			}
		}
		System.out.println(answer);
	}
}