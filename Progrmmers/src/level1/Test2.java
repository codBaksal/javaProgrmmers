package level1;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] prices = {3,2,4,8,7};
		int[] prices = {3,1,0,0,0};
		
		new Test2().solution(prices);
	}

	public int solution(int[] prices) {
        int answer = 0;
        
        int maxPri = prices[0]; // 4
        int minPri = prices[0]; // 2
        int highest = 0;
        
	    for(int i = 0; i < prices.length; i++) {
	    	
	    	if(prices[i] > maxPri) {
	    		maxPri = prices[i];
	    		if(highest < maxPri - minPri) {
	    			highest = maxPri - minPri;
	    		}
	    	} else if(prices[i] < minPri) {
	    		minPri = prices[i];
	    		maxPri = 0;
	    	} 	    	
	    }
	    
	    answer = highest;
	    
	    System.out.println(answer);
	    
        return answer;
    }
}
