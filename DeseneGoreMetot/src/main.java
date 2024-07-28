import java.util.Scanner;

public class main {

	/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın*/
/*
	 static void Pattern(int number) {
	        if (number <= 0) {
	            System.out.println(number);
	            return;
	        }

	        System.out.println(number);
	        Pattern(number - 5);
	        System.out.println(number);
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int n = scan.nextInt();
	        Pattern(n);
	        scan.close();
	    }
	
	*/
	
	
	
	 public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int sayi;
		System.out.print("sayı giriniz:");
		sayi=scan.nextInt();
		metot(sayi,sayi ,false);
		
	}
	
     static void metot(int n,int sayi,boolean istatus) {
	
	   if(n<=sayi) {
		   System.out.println(n);
		   if(n>0 && !istatus) {
			 
			    metot(n-5,sayi,false);
		   }
		   else {
			  
			    metot(n+5,sayi,true);
			  
		   }
	   }
	   
	}
	
}
     
     
	
	/*
	static int metot(int n,int sayi) {
		
		System.out.print(n+" ");
		if(n<=0) {
			metot2(n,sayi);
			return 1;
		}
		return metot(n-5,sayi);
	}
	
     static int metot2(int n,int sayi) {
		
    	 if(n<=0) {
    	 }
    	 else 	System.out.print(n+" ");
    
		if(n==sayi) {
			return 1;
		}
		
		return metot2(n+5,sayi);
	}
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int sayi;
		System.out.print("sayı giriniz:");
		sayi=scan.nextInt();
		metot(sayi,sayi);
		
	}
*/

