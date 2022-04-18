package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// copyOf copyOfRange ToString fill equals binarySerach
		// verilen eded arrayin icinde olub olmadığını yoxlayaq
		Scanner scanner=new Scanner(System.in);
		System.out.println("eded daxil edin");
		int number=scanner.nextInt();
		
		int[] arr=new int[] {2,5,7,10,9,8};
		
		
		boolean check=false;
		
		
//		for(int i=0;i<arr.length;i++) {// 0 1 2 3 4 5
//			arr[i]=12;//arr[0]=12; arr[1]=12 arr[2]=12 ... arr[5]=12
//		}

		for(int i=0;i<arr.length;i++) { // 0 1 2 3 4 5
			if(arr[i]==number) {// i=0
				check=true;
				System.out.println("daxil etdiyiniz eded arrayin  daxilindedi");
				break;
			}
		}
		
		if(true) {
	     	System.out.println("eded arrayin daxilinde deyil");
		}
		

	}

}
