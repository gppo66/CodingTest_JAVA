package maxnumber;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 //input
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        scanner.nextLine();
        String[][] arr = new String[tc][10];
        int[][] answer = new int[tc][10];
        for(int i = 0 ; i < tc ; i++) {
        	arr[i] = scanner.nextLine().split(" ");
        }
        for(int i = 0 ; i < tc ; i++) {
        	for(int j = 0 ; j < 10 ; j++) {
        		answer[i][j] = Integer.parseInt(arr[i][j]);
        	}
        }
        
        for(int i = 0 ; i < tc ; i++) {
        	Arrays.sort(answer[i]);
        	for(int j = 0 ; j < answer[i].length ; j++) {
        		System.out.print(answer[i][j] + " ");
        	}
        	System.out.println("\n");
        	System.out.println(answer[i][answer[i].length-3]);
        }
	}
}
