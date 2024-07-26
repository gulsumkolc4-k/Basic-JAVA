import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.*/
	
		Scanner input = new Scanner(System.in);
		
		float km;
		int age;
		int choose;
		double sum;
		double km_br=0.10;
		double sale=0;
		
		System.out.print("katedilen mesafeyi giriniz:");
		km=input.nextInt();
	
		System.out.print("yaşınızı giriniz:");
		age=input.nextInt();

		System.out.println("yolculuk tipi:\n1-Tek Yön\n2-Gidiş-Dönüş giriniz:");
		choose=input.nextInt();
		
		sum=km_br*km;
		
		System.out.println("uçuşun toplam fiyatı:" + sum);
		
		if((0>age) || (choose!=1 && choose!=2) || km<0)
		{
			System.out.println("Hatalı veri girdiniz!!!");
		}
		
		if(age<12)
		{
			sale=sum-sum*(0.5);
			if(choose==2)
			{
				sale=sale-sale*(0.2);
				sale*=2;
			}
			System.out.print("indirimli fiyat:" + sale );
		}
		else if(age<24)
		{
			sale=sum-sum*(0.1);
			if(choose==2)
			{
				sale=sale-sale*(0.2);
				sale*=2;
			}
			System.out.print("indirimli fiyat:" + sale );
		}
		else if(age<65)
		{
			if(choose==2)
			{
				sale=sale-sale*(0.2);
				sale*=2;
			}
			System.out.print("indirimli fiyat:" + sale );
		}
		else
		{
			sale=sum-sum*(0.3);
			if(choose==2)
			{
				sale=sale-sale*(0.2);
				sale*=2;
			}
			System.out.print("indirimli fiyat:" + sale );
		}
		
		
	}

}
