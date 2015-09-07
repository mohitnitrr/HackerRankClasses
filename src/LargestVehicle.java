import java.util.Scanner;


public class LargestVehicle {
	private static final int segmentSize = 1000;
	private static int [] segmentWidth=new int [segmentSize];
	 ;
	
	public static void main(String[] args) {
	int i=0;
	Scanner in = new Scanner(System.in);
	int length=in.nextInt();
	int testCases=in.nextInt();
	int m=length;
	while(length--!=0)
		segmentWidth[i++]= in.nextInt();
		
	
	while (testCases--!=0) {
		int inside = in.nextInt();
		int outside = in.nextInt();
		System.out.println(sizeOfVehicle(inside, outside));
	}
	}

	private static int sizeOfVehicle(int inside,int outside) {
		//int loop=outside-inside+1;
		int size=3;
		for(int i=inside;i<=outside;i++){
			if(size>segmentWidth[i])
				size=segmentWidth[i];
		}
		return size;
	}

}
