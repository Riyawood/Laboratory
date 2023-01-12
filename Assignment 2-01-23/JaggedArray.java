package ArrayTutorial;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]= new  int[3][];
		
		Scanner sc = new Scanner(System.in);
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		
		//initializing the jagged array
		int count=1;
		System.out.println("Enter the elements of jagged array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		//printing jagged array
		System.out.println("Jagged Array ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();// new line
		}

	}

}
