import java.util.Scanner;

public class WeekenOnline {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while (testcases-- != 0) {
			int angles = in.nextInt();
			float sum = 0;
			for (int i = 0; i < angles; i++)
				sum += in.nextFloat();

			float expected = 180 * (angles - 2);

			if (expected == sum)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
