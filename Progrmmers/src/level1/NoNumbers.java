package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(new NoNumbers().solution(numbers));

	}
	
	public int solution(int[] numbers) {
		int answer = 0;
		
		Arrays.sort(numbers);
		
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			newList.add(numbers[i]);
		}
		for(int j = 0; j < 10; j++) {
			if(!newList.contains(j)) {
				answer += j;
			}
		}
		
		return answer;
	}

}
