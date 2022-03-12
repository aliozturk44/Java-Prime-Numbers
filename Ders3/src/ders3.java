

import java.util.Scanner;
public class ders3 {
	

	
	public static void  main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the a value: ");
		int number=scan.nextInt();
		
	for(int j=2; j<=number;j++) {
	
			isPrime(j);
		
		
	}
	
}
	public static void isPrime(int number) {
		for(int i=2;i<=number;i++) {
		if(number==i) {
			System.out.println( number + "'den küçük asal sayýlar: " +number);
		}	
		if(number%i==0) {
			break;
		}
		}
	}
		
	
	}

	
