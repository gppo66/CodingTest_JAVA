package maxnumber;
import java.util.*;

public class Main {
 
	
	
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		double ave = 0;
		double[] total = new double[n];
		double sum = 0;
		
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			String[] ss = scanner.nextLine().split(" ");
			sum = 0;
			double[] score = new double[ss.length-1];	
			for(int j = 0 ; j < ss.length-1 ; j++) {
				score[j] = Integer.parseInt(ss[j+1]);
				sum += score[j];
				//System.out.println("sum : " + sum);
			}
			ave = sum/score.length;
			//System.out.println("ave : " + ave);
			for(int k = 0 ; k < score.length ; k++) {
				if(score[k] > ave) count++;
				//System.out.println("score : " + score[k] + " count : " + count + " score.length : " + score.length);
			}
			total[i] = ((double)count/(double)score.length)*100.0;
			//System.out.println("total : " + total[i]);
			count = 0;
		}
		for(int i = 0 ; i < total.length ; i++) {
			System.out.println(String.format("%.3f", total[i])+"%");
		}
	}
}