import java.math.BigInteger;
import java.util.Scanner;


public class FillingJars {
	
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer size=in.nextInt();
		BigInteger sizeB=new BigInteger(size.toString());
		int cases=in.nextInt();
		BigInteger sum=new BigInteger("0");
		Long temp;
		long count=0;
		while(cases--!=0){
			int a=in.nextInt();
			int b=in.nextInt();
			int k=in.nextInt();
			temp=(long)(Math.abs(a-b)+1)*k;
			BigInteger bg=new BigInteger(temp.toString());
			sum=sum.add(bg);
		}
		sum=sum.divide(sizeB);
		System.out.println(sum);
	}
}
