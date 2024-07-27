import java.util.Scanner; 

public class main { 
	static void topla() { 
Scanner scan = new Scanner(System.in);
		
		System.out.print("Kaç adet sayı gireceksiniz :"); 
		int counter = scan.nextInt(); 
		
		int number;
		int result = 0; 
		
		for (int i = 1; i <= counter; i++) { 
			
			System.out.print(i + ". sayı :"); 
			number = scan.nextInt();
			
			if (i == 1) {
				result += number; 
				continue; 
			} 
			result += number; 
		 } 
		System.out.println("Sonuç : " + result);
		/*
		Scanner scan = new Scanner(System.in);
		int number; 
		int result = 0;
		int i = 1;
		
		
		while (true) { 
			System.out.print(i++ + ". sayı :"); 
			number = scan.nextInt(); 
			if (number == 0) { 
				break; 
			} 
			result += number; 
		 } 
		 */
	} 
	
	    static void cikar() {
	    	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kaç adet sayı gireceksiniz :"); 
		int counter = scan.nextInt(); 
		
		int number;
		int result = 0; 
		
		for (int i = 1; i <= counter; i++) { 
			
			System.out.print(i + ". sayı :"); 
			number = scan.nextInt();
			
			if (i == 1) {
				result += number; 
				continue; 
			} 
			result -= number; 
		 } 
		System.out.println("Sonuç : " + result);
	} 
	    static void carpma() { 
	    	
		Scanner scan = new Scanner(System.in);
		
		int number;
		int result = 1;
		int i = 1; 
		while (true) {
			
			System.out.print(i++ + ". sayı :"); 
			number = scan.nextInt(); 
			
			if (number == 1) 
				break; 
			if (number == 0) { 
				
				break; 
			} 
			result *= number; 
		} 
		System.out.println("Sonuç : " + result);
	} 
	    static void bolme() { 
	    	
			Scanner scan = new Scanner(System.in);
			System.out.print("Kaç adet sayı gireceksiniz :"); 
			int counter = scan.nextInt(); 
			
			double number;
			double result = 0.0; 
			
			for (int i = 1; i <= counter; i++) { 
				System.out.print(i + ". sayı :"); 
			    number = scan.nextDouble(); 
			    
			if (i != 1 && number == 0) { 
				System.out.println("Böleni 0 giremezsiniz."); 
				continue;
				}
			if (i == 1) {
				result = number; 
				continue; 
				}
			result /= number;
		   }
			System.out.println("Sonuç : " + result);
	}
		 static void kuvvet_alma() {
			 
			Scanner scan = new Scanner(System.in); 
			
			System.out.print("Taban değeri giriniz :"); 
			int base = scan.nextInt();
			
			System.out.print("Üs değeri giriniz :");
			int exponent = scan.nextInt();
			
			int result = 1; 
			for (int i = 1; i <= exponent; i++) {
				result *= base; 
				}
			System.out.println("Sonuç : " + result);
			}
		static void factorial() { 
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Sayı giriniz :"); 
			int n = scan.nextInt(); 
			
			int result = 1;
			
			for (int i = 1; i <= n; i++) {
				result *= i; 
				}
			System.out.println("Sonuç : " + result); 
			}
		static void mod() {
			Scanner scan = new Scanner(System.in);
			System.out.print("2 adet sayı giriniz.");  
			
			int number1;
			int number2;
			int result = 0; 
			
			number1=scan.nextInt();
			number2=scan.nextInt();
			
			result=number1%number2;
			System.out.println("Sonuç : " + result);
			
		}
        static void cevre_alan() {
        	Scanner scan = new Scanner(System.in);
        	
            int en;
            int boy;
            int alan;
            int cevre;
            int result=0;
            
			System.out.print("dikdörtgenin en değerini giriniz:");  
	        en=scan.nextInt();
			System.out.print("dikdörtgenin boy değerini giriniz:");  
		    boy=scan.nextInt();
		    
		    alan=en*boy;
		    cevre=(en*2)+(boy*2);
		    
		    System.out.println("dikdörtgenin alanı:" + alan);
		    System.out.println("dikdörtgenin cevresi:" + cevre);
			
		}
		
		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			
			int select; 
			
			String menu = 
			  "1- Toplama İşlemi\n" 
			+ "2- Çıkarma İşlemi\n" 
			+ "3- Çarpma İşlemi\n" 
			+ "4- Bölme işlemi\n"
			+ "5- Üslü Sayı Hesaplama\n" 
			+ "6- Faktoriyel Hesaplama\n"
			+ "7- Mod Alma\n" 
			+ "8- dikdörtgen alan ve çevre hesabı\n"
			+ "0- çıkış"; 
			
			do {
				
             System.out.println(menu); 
             System.out.print("Lütfen bir işlem seçiniz :"); 
             select = scan.nextInt(); 
             
             switch (select) { 
             case 1: 
            	 topla(); 
            	 break; 
             case 2:
            	 cikar(); 
                 break; 
             case 3: 
            	 carpma();
            	 break; 
             case 4: 
            	 bolme(); 
            	 break; 
             case 5: 
            	 kuvvet_alma(); 
            	 break; 
             case 6: 
            	 factorial(); 
            	 break; 
             case 7: 
            	 mod(); 
            	 break; 
             case 8: 
            	 cevre_alan(); 
            	 break; 
             case 0 : 
            	 System.out.println("çıkış yapılıyor..0");
            	 break; 
             default: 
            	 System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz."); 
            	 } 
             } while (select != 0); 
			
		} 
	}
