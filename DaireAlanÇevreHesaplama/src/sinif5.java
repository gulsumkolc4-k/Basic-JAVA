import java.util.Scanner;

public class sinif5 {

	public static void main(String[] args) {
/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/

		int yaricap;
		double cevre;
		double alan1;
		double alan2;
		double pi=3.14;
	    int a;
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("dairenin yarıçapını giriniz:");
		yaricap=input.nextInt();
			
		alan1 = pi*yaricap*yaricap;
		cevre=2*pi*yaricap;
		
		System.out.print("dairenin alanı:" + alan1);
		System.out.print("\ndairenin çevresi:" + cevre);
	
		System.out.print("\nmerkez açısının ölçüsünü giriniz:");
		a=input.nextInt();
		 
		alan2=(pi * (yaricap*yaricap) * a) / 360;
		
		System.out.print("merkez açısının ölçüsünü" + a + "olan daire diliminin alanı: " + alan2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
