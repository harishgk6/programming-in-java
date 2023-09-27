import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MergeArr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the first array: ");
        	int n1 = sc.nextInt();
        	int[] arr1 = new int[n1];
		System.out.println("Enter elements of the first sorted array:");
        	for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> mergedList = mergeArrays(arr1, arr2);
	   int[] arr3 = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            arr3[i] = mergedList.get(i);
        }

        System.out.println("Merged Array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
	public static List<Integer> mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        return mergedList;
    }
}
        

    
