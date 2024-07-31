import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double sayi1;
	    double sayi2;
		int secim;
		
		System.out.print("birinci sayı değerinni giriniz:");
		sayi1=input.nextInt();
		
		System.out.print("ikinci sayı değerinni giriniz:");
		sayi2=input.nextInt();
		
		System.out.println("seçim yapınız:\n1-bölme\n2-çarpma\n3-toplama\n4-çıkarma");
		secim=input.nextInt();
		
		switch (secim) {
		case 1: {
			if(sayi2==0)
			{
				System.out.println("geçersiz değer girişi!!!");
				break;
			}
			else {System.out.println("sonuc:" + (sayi1/sayi2));}
			break;
		}
        case 2: {
			System.out.println("sonuc:" + (sayi1*sayi2));
			break;
		}
        case 3: {
			System.out.println("sonuc:" + (sayi1+sayi2));
			break;
		}
        case 4: {
			System.out.println("sonuc:" + (sayi1-sayi2));
			break;
		}
		default:
			throw new IllegalArgumentException("Geçersiz değer: " + secim);
		}
	}

}
