import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.*/
		
		Scanner inputScanner = new Scanner(System.in);
		
		int sayi;
		int N;
		int min;
		int max;
		
		System.out.print("KAÇ ADET SAYI GİRECEKSİNİZ:");
		N=inputScanner.nextInt();

		System.out.print("1. sayiyi giriniz:");
		sayi=inputScanner.nextInt();

		min=sayi;
		max=sayi;
		
	    for(int i=2; i<=N; i++){
			System.out.print(i+". sayiyi giriniz:");
			sayi=inputScanner.nextInt();
			if(sayi>max) {
				max=sayi;
			}
			else if(sayi<min) {
				min=sayi;
			}
	    }
	    System.out.println("EN KÜÇÜK SAYI:" + min);
	    System.out.println("EN BÜYÜK SAYI:" + max);
	}
}
