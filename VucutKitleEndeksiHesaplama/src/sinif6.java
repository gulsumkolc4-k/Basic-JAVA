import java.util.Scanner;

public class sinif6 {

	public static void main(String[] args) {
	/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının 
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173 */
		
		double boy;
		double kilo;
		double endeks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("kilonuzu(kg) giriniz:");
		kilo = input.nextDouble();
		
		System.out.print("boyunuzu(m)  giriniz:");
		boy = input.nextDouble();
		
		endeks =kilo/(boy*boy);
		System.out.print("vücut kitle endeksiniz:" + endeks);
	}

}
