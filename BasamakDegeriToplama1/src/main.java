import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*
		Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

		Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/

		Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int toplam=0;
        int basdeger;
		
	
        while (number != 0) {  // 1245
        	
            basdeger=number%10; 
            toplam+=basdeger;    
            number /= 10;  
        }

		
		System.out.println("toplam değer:" + toplam);
		
		
	}

}
