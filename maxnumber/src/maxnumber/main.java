package maxnumber;
import java.util.*;
public class main {
	public static String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        
        for(int i = 0 ; i < num.length; i++){
            num[i] = numbers[i]+"";
        }
        
        Arrays.sort(num, new Comparator<String>(){
            public int compare(String o1, String o2){
            	System.out.println("o1 : " + o1 + "  o2 : " + o2);
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        for(int i = 0 ; i< numbers.length ; i++){
        	System.out.println("num["+i+"] :  " + num[i]);
            answer += num[i];
        }
        return answer.charAt(0) == '0' ? "0" : answer;
    }
	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		System.out.println(solution(numbers));
	}

}
