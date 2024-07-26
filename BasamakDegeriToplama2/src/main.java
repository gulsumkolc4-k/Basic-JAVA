import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		/*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.*/
		
		int sayi;
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi değeri giriniz:");
		sayi = input.nextInt();
		    int basNumber = 0;
	        int tempNumber = sayi;
	        int kalan=0;
	        int toplam=0;
	        while (tempNumber != 0) {
	            tempNumber /= 10;
	            basNumber++;
	        }
	        tempNumber = sayi;
		    for(int i=0; i<basNumber; i++)   
		    {	
		    	kalan=tempNumber%10;
		        toplam+=kalan;
		        tempNumber/=10; 
		    }
		    System.out.println(toplam);
	}

}
