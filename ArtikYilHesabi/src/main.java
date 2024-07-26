import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.*/
		
		int yil;
		Scanner input = new Scanner(System.in);
		
		System.out.print("yıl giriniz:");
		yil=input.nextInt();
		
		if(yil%4==0)
		{
			if(yil%100==0)
			{
				if(yil%400==0) {
					System.out.println(yil + " bir artık yıldır!");
				}
				else {
					System.out.println(yil + " bir artık yıl değildir!!");
				}
		    }
			else {
				System.out.println(yil + " bir artık yıldır!");
			}
		}
		else {
			System.out.println(yil+ " bir artık yıl değildir!!");
		}
	}

}
