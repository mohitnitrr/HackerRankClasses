import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class IceCreamParlor {

	
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
		
		
		Map<Integer , Integer[]> index= new HashMap<Integer ,Integer[]>();
		int end =_a_size-1;
		
		int start=0;
		int i,lower_end=-1,upper_end=-1;
		for(i=0;i<_a_size;i++){
			Integer[] value= new Integer[2];
			
			if(index.containsKey(_a[i])){
			value=index.get(_a[i]);
			value[1]=i+1;
			index.put(_a[i], value);
			}
			
			else{
			value[0]=i+1;
			index.put(_a[i], value);
			}
		}	
			Arrays.sort(_a);
			
		while(true){
			if(_a[start]+_a[end]>sum)
				end--;
			else if(_a[start]+_a[end]<sum)
				start++;
			else{
				if(_a[start]==_a[end]){
					lower_end=index.get(_a[start])[0];
					upper_end=index.get(_a[start])[1];
					break;
				}
				else{
				lower_end=index.get(_a[start])[0];
				upper_end=index.get(_a[end])[0];
				break;
				}
			}
		}
			
		System.out.println(lower_end+" "+upper_end);	
		
	}
	
	
      
  

}
