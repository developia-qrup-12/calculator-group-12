import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("for nece defe dovr etsin");
		 int number=sc.nextInt();
		 
		 int arr[] = new int[number];
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(i+" ci indexi daxil edin");
			 arr[i]=sc.nextInt();
		 }
		
		 System.out.println("Arrayin yekun elementleri");
		 for(int i=0; i<number; i++) {
			 System.out.print(arr[i]+" "); //arr[0] arr[1] arr[2] arr[3]
		 }
	
		 
		 
//		 for (int i : arr) {
//			 System.out.print(i+" ");
//		 }
		
		
		
		 /*
		 if (number%3==0) {
		 * System.out.println("eded 3-e tam bolunur"); if (number%2==0) {
		 * System.out.println("eded cutdur"); }
		 * 
		 * else if(number%2==1) { System.out.println("eded tekdir"); } } else if
		 * (number%3==1) { System.out.println("qaliq 1"); } else if(number%3==2) {
		 * System.out.println("qaliq 2"); }
		 */
		
			/*
			 * for(int i=1; i<=number; i++) { if(i==5) { continue; } System.out.println(i);
			 * }
			 * 
			 * int n=1; while(n>1) { n++; System.out.println(n+" Salam"); }
			 * 
			 * do { n++; System.out.println(n+" Salam"); }while(n<=1);
			 */
		
		
	}
}
