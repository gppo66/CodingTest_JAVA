package maxnumber;
import java.util.*;

public class Main {
 
	
	
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] score = new double[n];
		double av = 0;
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = scanner.nextInt();
		}
		Arrays.sort(score);
		for(int i = 0 ; i < score.length ; i++) {
			av += (score[i]/score[score.length-1])*100;
		}
		av = av/n;
		System.out.println(av);
		
		
		
		
	}
}