import java.util.Scanner;


public class GameOfThrone1 {
	
	 public static void main(String[] args) {
		 	int[] fre=new int[26];
	        Scanner myScan = new Scanner(System.in);
	        String inputString = myScan.nextLine();
	        int len=inputString.length();
	        String ans;
	        int evenCount=0,oddCount=0;
	        for(char c:inputString.toCharArray()){
	        	fre[c-'a']++;
	        }
	        for(int i=0;i<26;i++){
	        	if(fre[i]%2==0)
	        		evenCount++;
	        	else 
					oddCount++;	
	        }
	        if(len%2==0&&oddCount>0)
	        	ans="NO";
	        else if(len%2!=0&&oddCount>1)
	        	ans="NO";
	        else
	        	ans="YES";
	        System.out.println(ans);
	        myScan.close();
	    }
}
