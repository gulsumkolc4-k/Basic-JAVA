
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int sayi;
		System.out.print("sayı giriniz:");
		sayi=input.nextInt();
		int durum=isPrime(sayi ,sayi/2);
		if(durum==0) {
			System.out.println(sayi + " asal değildir.");
		}
		else System.out.println(sayi + " asaldır.");
	}
	//rekürsif metot ile asal sayi bulma işlemi
	static int isPrime(int sayi, int  a) {
		
		if(sayi<2) {
		   return 0;
		}
		if(a==1) {
		   return 1;
		}
		else {
			if(sayi%a==0) 
				return 0;
			else isPrime(sayi,a-1); 
		}
	
		return isPrime(sayi,a-1); 
	}
	
}
