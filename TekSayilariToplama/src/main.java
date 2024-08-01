import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden 
		 * ve girilen değerlerden tek sayıları toplayıp 
		 * ekrana basan program */
		
		int sayi1;
		int sayi2;
		int toplam1=0;
		int toplam2=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi1 degerleri giriniz(negatif değer ile programı durdurunuz):");
	
		
		sayi1=input.nextInt();
		
		while(sayi1>0)
		{
			if(sayi1%2==1)
			{
				toplam1+=sayi1;
			}
			sayi1=input.nextInt();
			if(sayi1<0)
			{
				break;
			}
		}
		
		System.out.print(toplam1);
		
		/* döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift 
		 * ve 4'ün katları olan sayıları toplayıp ekrana basan program.
		 * */
		System.out.print("\nsayi2 degerleri giriniz(tek sayı değeri ile programı durdurunuz):");
		
		sayi2=input.nextInt();
		while(sayi2%2==0)
		{
			if(sayi2%4==0)
			{
				toplam2+=sayi2;
			}
			sayi2=input.nextInt();
			if(sayi2%2==1)
			{
				break;
			}
		}
		System.out.print(toplam2);
	}

}
