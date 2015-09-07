import java.util.Arrays;
import java.util.Scanner;


public class TwoArray {
	
	public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int testcase=stdin.nextInt();
        
        while(testcase--!=0){
        
        int n=stdin.nextInt(),k=stdin.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        for(int i=0;i<n;i++) arr1[i]=stdin.nextInt();
        for(int i=0;i<n;i++) arr2[i]=stdin.nextInt();
        
        checkPermutation(arr1,arr2,n,k);
        
        }
  }

	private static void checkPermutation(int[] arr1, int[] arr2, int n, int k) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int end=n-1;
		int i;
		for(i=0;i<n;i++){
			if(arr1[i]+arr2[end-i]<k){
				System.out.println("NO");
				break;
			}
		}
		
		if(i==n)
		System.out.println("YES");
	}

}
