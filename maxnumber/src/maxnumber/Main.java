package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(in[0]);
    	int num2 = Integer.parseInt(in[1]);
    	int gcd=0,lcm=0;
        for(int i = 2 ; i <= num1 && i <= num2; i++) {
        	if(num1%i==0 && num2%i==0) gcd = i;
        }
        lcm = num1 * num2 / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
	}
}
