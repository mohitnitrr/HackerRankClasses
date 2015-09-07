import java.util.Arrays;
import java.util.Scanner;


public class ClosestDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		int[] array=new int[length];
		int i;
		for(i=0;i<length;i++){
			array[i]= in.nextInt();
		}
		Arrays.sort(array);
		int diff=array[1]-array[0];
		for(i=0;i<length-1;i++){
			if((array[i+1]-array[i])<diff)
				diff=array[i+1]-array[i];
		}
		for(i=0;i<length-1;i++){
			if((array[i+1]-array[i])==diff){
				System.out.print(array[i]+" "+array[i+1]);
				System.out.print(" ");
				
			}
			
		}
		
	}

}
