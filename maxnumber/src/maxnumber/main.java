package maxnumber;
import java.util.*;
public class main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int answer = 0;
        //logic
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0) count++;
            if(count == k){
                answer = i;
                 break;
            }
        }
        if(count < k) answer = 0;
        //output
        System.out.println(answer);
	}

}
