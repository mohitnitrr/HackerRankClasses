package com.hackerrank2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JourneyToMoon {

	 public static void main(String[] args) throws Exception{
	        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	        String[] temp = bfr.readLine().split(" ");
	        int N = Integer.parseInt(temp[0]);
	        int I = Integer.parseInt(temp[1]);
	        
	        List<Set<Integer>> group=new ArrayList<Set<Integer>>();
	        
	        
	        for(int i = 0; i < I; i++){
	            temp = bfr.readLine().split(" ");
	            int a = Integer.parseInt(temp[0]);
	            int b = Integer.parseInt(temp[1]);
	            boolean flag=true;
	            int indexA=-1;
	            int indexB=-1;
	            for(Set<Integer>g:group){
	            
	            if(g.contains(a)){
	            	indexA=group.indexOf(g);
	            	
	            }
	            else if(g.contains(b)){
	            indexB=group.indexOf(g);
	            
	            }
	         }
		
	        	Set<Integer> newg1;
		        Set<Integer> newg2;	
	            		
	            if(indexA!=-1&&indexB!=-1){
	            	Set<Integer> merge;	
	            	merge=group.get(indexA);
	            	merge.addAll(group.get(indexB));
	            	
	            	newg1=group.get(indexA);
	            	newg2=group.get(indexB);
	            	
	            	
	            	group.remove(newg1);
	            	group.remove(newg2);
	            	group.add(merge);
	            	
	            }
	            else if(indexA!=-1){
	            newg1=group.remove(indexA);
	            newg1.add(b);
	            group.add(newg1);
	            }
	            else if(indexB!=-1){
	            	newg2=group.remove(indexB);
	            	newg2.add(a);
	            	group.add(newg2);
	            }
	            else{
	            	Set<Integer> newg = new HashSet<Integer>();
					newg.add(a);
					newg.add(b);
					group.add(newg);
	            }
	            	
	     }
	        
	        int[] sizeArray=new int[N];
	        int i=0;
	        int count=0;
	        for(Set<Integer>g:group){
	        	sizeArray[i]=g.size();
	        	count+=sizeArray[i];
	        	i++;
	        }
	        while(count<N){
	        	sizeArray[i]=1;
	        	count++;
	        	i++;
	        }

	   
	        long combinations = 0;

	        for(int j=0;j<=i;j++){
	        	
	        	for(int k=j+1;k<=i;k++){
	        		combinations+=sizeArray[j]*sizeArray[k];
	        	}
	        	
	        }
	       
	        System.out.println(combinations);

	    }
}

