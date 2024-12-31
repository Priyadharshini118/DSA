package Array;

import java.util.Scanner;

public class Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		int[] arr=new int[n];
		
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("Sum of Array:"+ sum);
	}

}
