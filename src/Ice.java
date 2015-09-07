import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ice {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		  
	      int testcase=Integer.parseInt(in.nextLine());
	      
	      while (testcase--!=0) {
	    	  	int sum=Integer.parseInt(in.nextLine());
				int _a_size = Integer.parseInt(in.nextLine());
				int[] _a = new int[_a_size];
				int _a_item;
				String next = in.nextLine();
				String[] next_split = next.split(" ");
				for (int _a_i = 0; _a_i < _a_size; _a_i++) {
					_a_item = Integer.parseInt(next_split[_a_i]);
					_a[_a_i] = _a_item;
				}
				IndexOfFlavor(_a,_a_size,sum);
				
			}


		
	}

	private static void IndexOfFlavor(int[] _a, int _a_size, int sum) {
	//	int[] index=new int[_a_size];
		
		
		Map<Integer , Integer> index= new HashMap<Integer ,Integer>();
		int end =_a_size-1;
		
		
		
		int start=0;
		int i,lower_end=-1,upper_end=-1;
		for(i=0;i<_a_size;i++){
			index.put((Integer)_a[i], (Integer)i);
		}	
			
			
	
		for(i=0;i<_a_size;i++){
			
			if(index.get((Integer)(sum-_a[i]))!=null)
			{
			lower_end=i+1;
			upper_end=index.get(sum-_a[i])+1;
			if(lower_end!=upper_end)
			break;
			}
		}
		System.out.println(lower_end+" "+upper_end);	
		
	}
	
	
      
  

}
