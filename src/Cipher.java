import java.util.Scanner;


public class Cipher {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	int size=in.nextInt();
	int repeat= in.nextInt();
	int lengthCipher=size+repeat-1;
	String encode=in.next();
	char [] encodeArray=encode.toCharArray();
	int[] cipherInt=new int[lengthCipher];
	
	for(int i=0;i<lengthCipher;i++){
		cipherInt[i]=Character.getNumericValue(encodeArray[i]);
		
	}
	int[] textInt=new int[size];
	textInt[0]=cipherInt[0];
	for(int i=1;i<size;i++){
		int x=0;
		int count=1;
		for(int j=i-1;j>=0&&count<repeat;j--,count++){
			x=x^textInt[j];
			
		}
		textInt[i]=x^cipherInt[i];
	}
	for(int i:textInt){
		System.out.print(i);
	}
	}
}
