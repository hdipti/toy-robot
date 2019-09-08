package com.au.play;

import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Test {





public static void main(String args[]){
	
	Solution solution = new Solution();
	int cost = solution.solution("10:00", "13:21");
	System.out.println("Cost is : " + cost);
	
}

}

class Solution {
	
	public int solution(String E, String L) {
        // write your code in Java SE 8
        
		int startTime = getTimeInDecimalFormat(E);
        int endTime = getTimeInDecimalFormat(L);
		
        int difference = startTime - endTime;
        
        
        int totalCost = 2; // Minimum entrance fee
       if(difference < 1){
    	   totalCost = totalCost + 3;
       } else {
    	 int moreThanOneHour = new BigDecimal(difference - 1).ROUND_HALF_UP;
    	 totalCost = totalCost + 3 + (4 * moreThanOneHour);
       }
		
        return totalCost;
        
        
    }
	
	private int getTimeInDecimalFormat(String time){
		StringTokenizer token = new StringTokenizer(time);
		
		String[] tokens = time.split(":");
		String newTime = tokens[0]+ "." + tokens[1];
		BigDecimal timeN = new BigDecimal(newTime);
        return timeN.intValue();
	}
	
}

