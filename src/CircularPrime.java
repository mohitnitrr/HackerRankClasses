import java.util.Scanner;


public class CircularPrime {
	static int[] primeList=new int [7];

public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	
	int limit = in.nextInt();
	long sum=0;
	for(int i=2;i<limit;i++){
		boolean flag=true;
		fillPrimeList(i);
		int len=(int) Math.log10(i) + 1;
		for(int j=0;j<len;j++){
			
			if(!checkPrime(primeList[j])){
			 flag=false;
			 break;
			}
		}
		if(flag==true)
		sum+=i;
	}
	
	System.out.println(sum);
}

private static boolean checkPrime(int number) {
	for(int i=2; i<=number/2; i++){
        if(number % i == 0){
            return false;
        }
    }
    return true;
}

private static void fillPrimeList(int i) {
	
	int len=(int) Math.log10(i) + 1;
	int no=i;
	int limit=len;
	int rotate=no;
	int pow=len-1;
	if(len==1)
		primeList[0]=no;
	else{
		for(int j=0;j<limit;j++){
			if(j==0){
			primeList[j]=no;
			//len--;
			}
			else{
				rotate=(rotate%10)*(int)Math.pow((double)10,(double)pow)+rotate/10;
				primeList[j]=rotate;
			//	len--;
			}
				
		}
	}
	
}
}
