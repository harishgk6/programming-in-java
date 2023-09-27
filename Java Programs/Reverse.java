import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char str[]=s.toCharArray();
		int size=str.length;
		for(int i=size-1;i>=0;i--){
			System.out.print(str[i]);
		}
	}
}
