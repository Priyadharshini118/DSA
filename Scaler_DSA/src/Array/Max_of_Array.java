package Array;

import java.util.Scanner;

public class Max_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		for(int i:arr) {
			max=Math.max(max, i);
		}
		System.out.println(max);
		sc.close();
		//:)
	}

}
