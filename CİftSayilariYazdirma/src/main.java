import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan kod*/
		
		Scanner input = new Scanner(System.in);
		
		int sayi;
		System.out.print("sayi giriniz:");
		sayi=input.nextInt();
		int toplam=0;
		double ort;
		
		System.out.print("çift sayılar:");
		for(int i=0; i<sayi; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + ",");
			}
		}
		
		/* döngüler ile 0'dan girilen sayıya kadar olan 
		 * sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program.*/
		
		System.out.println();
		System.out.print("sayi giriniz:");
		sayi=input.nextInt();
		
		int j=0;
		for(int i=1; i<sayi; i++)
		{
			if(i%3==0 && i%4==0)
			{
				toplam+=i;
				j++;
			}
		}
		
		ort= toplam/j;
		System.out.println("\n3 ve 4'e tam bölünen sayıların toplamı:"+ toplam);
		System.out.println("ortalaması:"+ ort);
	}

}
