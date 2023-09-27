import java.util.Scanner;
public class indexvalue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char[] arr=st.toCharArray();
		char search=sc.next().charAt(0);
		int found=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				found=i+1;
				break;
			}
		}
		if (found!= -1) {
            System.out.println(search + " is found in string at index: " + found);
        } else {
            System.out.println(search + " is not found in the string.");
        }
	}
}
