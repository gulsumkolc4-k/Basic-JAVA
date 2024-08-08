import java.util.Scanner;


public class sinif {

	public static void main(String[] args) {
		/*
		 * Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz*/
		Scanner input=new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int ekok=0;
		int ebob=0;
		
		System.out.print("1. sayi değerini giriniz:");
		sayi1=input.nextInt();
		
		System.out.print("2. sayi değerini giriniz:");
		sayi2=input.nextInt();
		
		for(int i=sayi1; i>0; i--)
		{
			if(sayi1%i==0 && sayi2%i==0) {
				ebob=i;
				System.out.print("EBOB:"+ ebob);
				break;
			}
		}
       System.out.println();
       for(int j = 1; j<(sayi1*sayi2); j++){
    	   if(j%sayi1==0 && j%sayi2==0) {
    		   System.out.println("EKOK:"+j);
    		   break;
    	   }
       }
	}

}
