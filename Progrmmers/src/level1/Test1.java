package level1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Test1().solution(147);
	}
	
	public String solution(int num) {
		String answer = "";
		
		answer = Integer.toString(num);
		
		String[] engNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] engToNum = {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i = 0; i < engNum.length; i++) {
			answer = answer.replaceAll(engToNum[i],engNum[i]);
		}
		
		return answer;
	}

}
