package etkinlik;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
     /*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/
		
		int sicaklik;
		Scanner input = new Scanner(System.in);
		System.out.print("sıcaklık değeri giriniz:");
		sicaklik = input.nextInt();
		
		if(sicaklik<5)
		{
			System.out.println("kayak");
		}
		else if(sicaklik<25)
		{
			if(sicaklik<15) {
				System.out.println("sinema");
			}
			if(sicaklik>15)
			{
				System.out.println("piknik");
			}
		}
		else System.out.println("yüzme");
		
		
		
	}

}
