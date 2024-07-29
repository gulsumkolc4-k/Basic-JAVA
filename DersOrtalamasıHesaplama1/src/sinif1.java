
import java.util.Scanner;

public class sinif1 {

	public static void main(String[] args) {
		
		
		int mat, fzk, kimya, turkce , tarih;
		double ortalama;
		int toplam=0;
		
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("matematik notunuzu giriniz: ");
		mat = girdi.nextInt();
		
		System.out.print("fizik notunuzu giriniz: ");
		fzk = girdi.nextInt();
	
		System.out.print("kimya notunuzu giriniz: ");
		kimya = girdi.nextInt();
		
		System.out.print("türkçe  notunuzu giriniz: ");
		turkce = girdi.nextInt();
		
		System.out.print("tarih notunuzu giriniz: ");
		tarih = girdi.nextInt();
		
		toplam= mat + fzk + kimya + turkce + tarih ;
		ortalama= toplam / 5;
		 
		System.out.print("ortalamanız\t\n" + ortalama + "\n");
		
		boolean durum = (ortalama>60);
	   
		String str = durum ? "geçti" : "kaldı";
		System.out.println(str);
		
	}
}
