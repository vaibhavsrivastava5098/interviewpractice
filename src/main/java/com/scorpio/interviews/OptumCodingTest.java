package com.scorpio.interviews;

import java.util.Arrays;

//you can also use imports, for example:
import java.util.*;
import java.util.stream.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class OptumCodingTest {
/* public int solution(int[] A) {
     // write your code in Java SE 8
    List<Integer> locations = Arrays.stream(A).distinct().boxed().collect(Collectors.toList());
     locations.forEach(l->System.out.println(l));
     int minDays = Integer.MAX_VALUE;
     for(int i=0;i<A.length;i++)
     {
    	 List<Integer> tempLoc = new ArrayList<>(locations);
    	 int days = 0;
    	 for(int j=i;j<A.length;j++)
    	 {
    		 days++;
    		 if(tempLoc.contains(A[j]))
    			 tempLoc.remove(Integer.valueOf(A[j]));
    		 if(tempLoc.isEmpty())
    		 {
    			 if(days<minDays)
    				 minDays = days;
    			 break;
    		 }
    			 
    	 }
     }
     return minDays;
	 
	 
	
 }*/
	
	public int solution(String S, int[] C) {
        // write your code in Java SE 8
		char[] chars = S.toCharArray();
//		StringBuffer sb = new StringBuffer();
//		sb.append(chars[0]);
		int totalCostToRemove = 0;
		for(int i=0;i<chars.length-1;i++)
		{
			if(chars[i]==chars[i+1])
			{
				totalCostToRemove+=C[i];
			}
//			else
//			{
//				sb.append(chars[i]);
//			}
		}
	    return totalCostToRemove;
    }
 
 public static void main(String[] args)
 {
//	 int[] A = new int[8];
//	 A[0] = 7;
//     A[1] = 3;
//     A[2] = 7;
//     A[3] = 3;
//     A[4] = 1;
//     A[5] = 3;
//     A[6] = 4;
//     A[7] = 1;
      
     
     OptumCodingTest i = new OptumCodingTest();
     String s = "ababa";
     int[] c =  new int[] {10,5,10,5,10};
//     System.out.println("min days: "+i.solution(s,c));
     System.out.println("total cost to remove duplilcates is: "+i.solution(s,c));
 }
 
}

