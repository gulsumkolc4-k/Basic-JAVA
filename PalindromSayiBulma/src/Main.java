import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

	Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/
			
			 Scanner input= new Scanner(System.in);
			 
			 int sayi;
	         System.out.print("bir sayi giriniz:");
		     sayi= input.nextInt();
		     palindrom(sayi);
		 
		}	

	public static void palindrom(int sayi) {
		
	     int yedek=sayi;
		 int sayac=0;
		 int basamak=0;
	     int ters_Sayi=0;
	     int gecici=sayi;
	     
		 //sayının kaç basamaklı olduğunu bulma
	     while(yedek!=0) {
	    	 yedek/=10;
	    	 sayac++; 
	     }
	
	     //sayıyı ters çevir
	     for(int i=1; i<=sayac; i++) 
	     {
	         basamak=sayi%10; //4 
	         for(int j=0; j<sayac-i; j++) {
	        	 basamak*=10;
	         }
	         ters_Sayi+=basamak;
	         sayi/=10; 
	     }
	     
	    //palindrom kontrol
	     if(gecici==ters_Sayi) {
	    	 System.out.println(gecici+" palindrom sayıdır.");
	    	 return;
	     }
	     else {
	    	 System.out.println(gecici+" palindrom sayı değildir.!");
	    	 return;
	     }
	     
	  
	     
	}
	
	
	/*palindrom sayı bulma farklı yöntem
	 * 
	 * 
	 * static boolean isPalindrom(int number){
	 * 
	 * int temp = number, reversenumber=0,lastnumber;
	 * while (temp!=0){
	 * 
	 * lastnumber=temp%10;
	 * reversenumber =(reversenumber*10)+lastnumber;
	 * temp/=10;
	 *
	 * }
	 *
	 * if(number==reversenumber){
	 * return true;
	 * }
	 * else {
	 * return false;
	 * }
	 * }
	 }
	 */
	
	
}
	
	

	