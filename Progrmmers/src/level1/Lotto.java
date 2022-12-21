package level1;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] select_num = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		int[] result = new Lotto().solution(select_num, win_nums);
		System.out.println("result : " + Arrays.toString(result));
	}
	
	public int[] solution(int[] select_num, int[] win_nums) {
		System.out.println("select_num : " + Arrays.toString(select_num));
		System.out.println("win_nums : " + Arrays.toString(win_nums));
		
		int[] answer = new int[2];
		
		int minimum = 0;
		int maximum = 0;
		int zeroCount = 0;
		for(int check_num : win_nums) {
			for(int i = 0; i < 6; i++) {
				if(check_num == select_num[i]) {
					minimum++;
				}
			}
		}
		for(int i = 0; i < 6; i++) {
			if(select_num[i] == 0) {
				zeroCount++;
			}
		}
		maximum = zeroCount + minimum;
		System.out.println("minimum : " + minimum);
		System.out.println("maximum : " + maximum);
		
		if(minimum == 2) {
			answer[1] = 5;
		} else if(minimum == 3) {
			answer[1] = 4;
		} else if(minimum == 4) {
			answer[1] = 3;
		} else if(minimum == 5) {
			answer[1] = 2;
		} else if(minimum == 6) {
			answer[1] = 1;
		} else {
			answer[1] = 0;
		}
		
		if(maximum == 2) {
			answer[0] = 5;
		} else if(maximum == 3) {
			answer[0] = 4;
		} else if(maximum == 4) {
			answer[0] = 3;
		} else if(maximum == 5) {
			answer[0] = 2;
		} else if(maximum == 6) {
			answer[0] = 1;
		} else {
			answer[0] = 0;
		}
		
        return answer;
	}
}
