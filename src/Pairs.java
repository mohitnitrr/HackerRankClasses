import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Pairs {

	public static void main(String[] args) {
	
				Scanner in = new Scanner(System.in);
				int _a_size = in.nextInt();
				int diff=in.nextInt();
				
				int[] _a = new int[_a_size];
				int _a_item;
				
				for (int _a_i = 0; _a_i < _a_size; _a_i++) {
					_a_item = in.nextInt();
					_a[_a_i] = _a_item;
				}
		Pair(_a,_a_size,diff);
				
	}

	private static void Pair(int[] _a, int _a_size, int diff) {
		HashMap<Integer,Integer> value= new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<_a_size;i++){
			value.put(_a[i], 1);
		}
		
		Iterator<Integer> pair=	value.keySet().iterator();
		while(pair.hasNext()){
		if(value.get(pair.next()+diff)!=null)
			count++;
		}
		System.out.println(count);
	}


}
