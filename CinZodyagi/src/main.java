import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.*/

		int tarih;
		int kalan;
		Scanner input = new Scanner(System.in);
		 
		System.out.print("doğum tarihinizi giriniz:");
		tarih=input.nextInt();
		
		kalan = tarih%12;
		
		System.out.print("burcunuz:");
		switch (kalan) {
		case 0: {
			System.out.println("maymun");
			break;
		}
		case 1: {
			System.out.println("horoz");
			break;
		}
		case 2: {
			System.out.println("köpek"); 
			break;
		}
		case 11: {
			System.out.println("koyun");
			break;
		}
		case 4: {
			System.out.println("fare");
			break;
		}
		case 5: {
			System.out.println("öküz");
			break;
		}
		case 6: {
			System.out.println("kaplan");
			break;
		}
		case 7: {
			System.out.println("tavşan");
			break;
		}
		case 8: {
			System.out.println("ejderha");
			break;
		}
		case 9: {
			System.out.println("yılan");
			break;
		}
		case 10: {
			System.out.println("at");
			break;
		}
		}
	}

}
