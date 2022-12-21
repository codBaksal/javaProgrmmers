package level1;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test3().solution(15));
	}
	
	public long[] solution(long n) {
		long[] answer = {0,0};
		
		long quo = n / 7 * 2;
		long rem = n % 7;
		
		if(rem == 0) {
			answer[0] = quo * 2;
			answer[1] = quo * 2;
		} else {
			answer[0] = quo * 2;
			answer[1] = quo * 2 + 1;
		}
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

}
