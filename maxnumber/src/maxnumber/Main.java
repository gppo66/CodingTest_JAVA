package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int answer = 0;
        int index = 1;
        for(int i = 1 ; i<= 10; i++) {
        	for(int j = 1 ; j < i+1 ; j++) {
        		System.out.print(i + "/" + index + " ");        		
        		if(index >= Integer.parseInt(a[0]) && index <= Integer.parseInt(a[1])) {
        			answer += i;
        		}
        		index++;
        	}
        }
        System.out.println("\n" + answer);
	}
}
