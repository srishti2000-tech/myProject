package coding;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Element to be found");
		int find =sc.nextInt();
		 for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]+arr[j]==find){
	                    System.out.print("["+i+","+j+"]");

	                }
	            }
	        }
		
	}

}
