package Map;

import java.util.Scanner;

//public class Array {
//	public static void main(String[] args) {
//		
//	
//    int arr[]= new int[5];
//    Scanner sc=new Scanner(System.in);
//    for(int i=0; i<arr.length; i++) {
//    	 arr[i]=sc.nextInt();
//    }
//    
//    for(int i=0; i<arr.length; i++) {
//    	System.out.println(arr[i]);
//    }
//	}
//}

public class Array{
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		/*jagged array*/
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

