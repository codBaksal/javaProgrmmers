package level1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] d = {1,3,2,5,4};
		
		int budget = 9;
		
		
		System.out.println(new Budget().solution(d, budget));
		
	}
	
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
        	if(budget >= d[i]) {
        		budget -= d[i];
        		answer++;
        	}
        }
        	
        
        
        return answer;
    }

}
