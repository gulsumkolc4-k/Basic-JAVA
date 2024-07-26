import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan program*/

		Scanner input= new Scanner(System.in);
    
	int sayi;
	int toplam=0;
	
    System.out.print("Sayı giriniz:");
    sayi=input.nextInt();
    
    for(int i=1; i<sayi; i++) {
    	if(sayi%i==0) {
    		toplam+=i;
    	}
    }
    if(toplam==sayi){
    	System.out.println(sayi+ " mükemmel sayıdır.");
    }
    else {
    	System.out.println(sayi+ " mükemmel sayı değildir.!");
    }
	}
}
