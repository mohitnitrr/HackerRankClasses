import java.util.Scanner;


public class MaxAverage {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		int [] array=new int[length];
		int i=0;
		while(length--!=0){
			array[i]=in.nextInt();
			i++;
		}
		float avg_so_far = 0;
		float avg_ending_here = 0;
		int count=0;
		
		for( i=0;i<=array.length-1;i++){
			avg_ending_here=((avg_so_far*count+array[i])/(count+1));
			if(avg_ending_here<0){
				avg_ending_here=0;
				count=0;
			}
			else if(avg_so_far<avg_ending_here){
				avg_so_far=avg_ending_here;
				count++;
			}
		}
		
		System.out.println((int)Math.floor(avg_so_far));
	}

}
