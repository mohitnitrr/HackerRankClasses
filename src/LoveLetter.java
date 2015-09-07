import java.util.Scanner;


public class LoveLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase=in.nextInt();
		while(testCase--!=0){
		String str= in.next();
		System.out.println(findMinChange(str));
		}
	}

	private static int findMinChange(String str) {
		int length=str.length();
		int start =0,end=length-1;
		int count=0;
		while(start<end){
			if(str.charAt(start)!=str.charAt(end))
				if(str.charAt(start)>str.charAt(end))
					count+=str.charAt(start)-str.charAt(end);
				else
					count+=str.charAt(end)-str.charAt(start);
		start++;
		end--;
		}
	return count	;
	}
}
