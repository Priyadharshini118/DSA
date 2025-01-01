package Array;

import java.util.Scanner;

public class subarrays_of_arraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int si=0;si<n;si++) {
			for(int ei=si;ei<n;ei++) {
				for(int k=si;k<=ei;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
//4
//1 2 3 4
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//2 
//2 3 
//2 3 4 
//3 
//3 4 
//4 
