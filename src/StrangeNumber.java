import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class StrangeNumber {
	
	static Map<Long, Integer> noList= new HashMap<Long, Integer>();
	int countList=0;
	
	
	
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		      
	    while (testcase--!=0) {
	        int count=0;	
	    	long l=in.nextLong();
	        long r=in.nextLong();
	        
	        for(long i=l;i<=r;i++)
	        	if(i>=0&&i<=10||StrangeNumber(i)){
	        		noList.put(i,1);
	        		count++;
	        	}
	        
	        System.out.println(count);
	    }
 }
	 

	private static boolean StrangeNumber(long i) {
		
		if(i<=10)
			return true;
		else if(noList.containsKey(i))
			return true;
			
		else{	
			
	/*	Iterator<Long> l=noList.keySet().iterator();
			while(l.hasNext()){
				long next= l.next();
				if(next>i)
					return false;
			}
	*/
		int len=(int) Math.log10(i) + 1;
		long qutionent=i/len;
		long remaider=i%len;
		
		if(i%len==0)
			return StrangeNumber(qutionent);
		else
		return false;
		}
	}

}
