package nothesaplama;
import java.util.Scanner;
public class main {
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
		if(mat>0 && mat<100){
			toplam+=mat;
		}
		if(fzk>0 && fzk<100){
			toplam+=fzk;
		}
		if(kimya>0 && kimya<100){
			toplam+=kimya;
		}
		if(tarih>0 && tarih<100){
			toplam+=mat;
		}
		if(turkce>0 && turkce<100){
			toplam+=turkce;
		}
		ortalama= toplam / 5;
		System.out.print("ortalamanız\t\n" + ortalama + "\n");
		if(ortalama<55){
			System.out.println("Kaldı!");
		}
		else if(ortalama>=55){
			System.out.println("geçtiniz");
		}
		else System.out.println("geçersiz not girişi!!!");
	}
}
