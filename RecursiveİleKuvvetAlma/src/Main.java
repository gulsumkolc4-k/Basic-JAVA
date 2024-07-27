import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
 
		Scanner input=new Scanner(System.in);
		int n;
		int m;
		System.out.print("taban değeri giriniz:");
		n=input.nextInt();
		System.out.print("üs değeri giriniz:");
		m=input.nextInt();
		System.out.println("sonuç: " +  uslu_sayi_hesapla(n,m));

	}
	
	static int uslu_sayi_hesapla(int taban, int us) {
		if(us==0) {
			return 1;
		}
		
	     return taban*uslu_sayi_hesapla(taban, --us)   ;	
	}
	
	/*
	 * farklı bir fonksiyon ile
	static double pow(int base, int power) {
        if(power<0)
            return 1/pow(base,-power);

        if(power==0)
            return 1;

        return base * pow(base,--power);
    }
	*/
	
	

}
