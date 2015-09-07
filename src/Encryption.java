import java.util.Scanner;


public class Encryption {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String text=in.nextLine();
		int dimen1= (int)(Math.ceil(Math.sqrt((double)text.length())));
		int dimen2=(int)(Math.floor(Math.sqrt((double)text.length())));
		char[] textarray=text.toCharArray();
		int row,col;
		
		if(dimen1>dimen2){
			col=dimen1;
			row=dimen2;
		}
		else{
			col=dimen2;
			row=dimen1;
		}
		if(row*col<textarray.length)
			row++;
		int k=0;
		char [][] encypttext=new char[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col&&k<textarray.length;j++){
				
				if(textarray[k]==' ')
						{ }
				else
					encypttext[i][j]=textarray[k];
				
				k++;
				
			}
		}
		
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				if(encypttext[j][i]=='\u0000')
					continue;
				else	
				System.out.print(encypttext[j][i]);
			}
		System.out.print(" ");
		}
		
	}
}
