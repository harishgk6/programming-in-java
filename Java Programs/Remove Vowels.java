import java.util.Scanner;
public class removevow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char[] arr=st.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
		continue;
	}
else{
System.out.print(arr[i]);
}
}
}
}
