import java.util.Scanner;


public class MaxAverageArraay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		int [] array=new int[length];
		int i=0;
		while(length--!=0){
			array[i]=in.nextInt();
			i++;
		}
		int max=array[0];
		for(i=1;i<=array.length-1;i++){
			if(array[i]>max)
				max=array[i];
		}
		System.out.println(max);
	}
}
