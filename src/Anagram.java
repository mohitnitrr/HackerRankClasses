import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Anagram {
	public static void main(String[] args) {
		
		int count;
		
		Scanner stdin=new Scanner(System.in);
		String str1 =stdin.nextLine();
		String str2= stdin.nextLine();
		
		count= countAnagram(str1,str2);
		System.out.println(count);
	}

	private static int countAnagram(String str1, String str2) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		int count=0;
		for(char c : str1.toCharArray()){
			if (map1.containsKey(c))
			    map1.put(c, map1.get(c) + 1);
			else
			    map1.put(c, 1);
				
		}
		
		for(char c : str2.toCharArray()){
			if (map2.containsKey(c))
			    map2.put(c, map2.get(c) + 1);
			else
			    map2.put(c, 1);
				
		}
		Iterator<Character> i1=map1.keySet().iterator();
		while(i1.hasNext()){
			char c=i1.next();
			if(map2.containsKey(c)){
					count+=Math.abs(map1.get(c)-map2.get(c));
					map2.remove(c);
			}
			else
				count+=map1.get(c);
		}
		if(map2.size()>0){
			Iterator<Character> i2=map2.keySet().iterator();
			while(i2.hasNext()){
			count+=	map2.get(i2.next());
			}
			
		}
		
		return count;
	}

}
