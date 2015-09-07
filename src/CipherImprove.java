import java.util.Scanner;


public class CipherImprove {	
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
int j=0;
for(int i=1;i<size;i++){
	
	if(i<repeat)
		textInt[i]=cipherInt[i]^cipherInt[i-1];
	else{
		textInt[i]=cipherInt[i]^cipherInt[i-1]^textInt[j];
		j++;
	}
}

for(int i:textInt){
	System.out.print(i);
}
}

}
