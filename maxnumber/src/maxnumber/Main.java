package maxnumber;


import java.util.*;

public class Main {
	  
	  static int[][] check;
	  static boolean[] checked;
	  static int n;
	  static int m;
	  static int count=0;
	  
	  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  m = sc.nextInt();
	  
	  check = new int[n+1][n+1];
	  checked = new boolean[n+1];
	  
	  for(int i = 0; i < m; i++) {
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    check[x][y] = check[y][x] = 1;
	  }
	  
	  bfs(1);
	  System.out.println(count);
	}
	
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		checked[start] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 0 ; i <= n ; i++) {
				if(check[temp][i] == 1 && checked[i] == false) {
					queue.offer(i);
					checked[i] = true;
					count++;
				}
			}
		}
	}
}