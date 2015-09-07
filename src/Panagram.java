import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Panagram {

public static void main(String[] args) {
			
		Scanner stdin=new Scanner(System.in);
		String str1 =stdin.nextLine();
		str1=str1.toLowerCase();
		
		panagram(str1);
		
	}

private static void panagram(String str1) {
	Map<Character, Integer> map1 = new HashMap<Character, Integer>();
	for(char c:str1.toCharArray()){
		if((c>='a'&&c<='z')&&!map1.containsKey(c))
			map1.put(c, 1);
		else
			continue;
			
	}
	if(map1.size()==26)
		System.out.println("pangram");
	else
		System.out.println("not pangram");
}
}
