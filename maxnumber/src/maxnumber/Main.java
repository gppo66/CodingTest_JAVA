package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();

        
        String answer = "";
        //logic
        String[] s = b.split(" ");
        if(a == s.length) {
        int[] sp = new int[s.length];
        for(int i = 0 ; i < sp.length ; i++)
        	sp[i] = Integer.parseInt(s[i]);
        Arrays.sort(sp);
        answer = sp[0] + " " + sp[sp.length-1];
        
        //output
        System.out.println(answer);
        }
	}

}