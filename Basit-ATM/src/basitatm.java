import java.util.Scanner;
public class basitatm {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		    
		    int bakiye=2000;
		    int sifre=57;
		    int denemehakki=0;
		    boolean giris=false;
		    int secim;
		    int cekilecekmik=0;
		    int yatirilacakmik=0;

		    
		    
		    int i=0;
		    while(!giris) {
		    	
		    	System.out.print("şifrenizi giriniz:");
		        sifre=input.nextInt();
		        
		    	if(sifre==57){
		    		giris=true;
		    		break;
		    	}
		    	else {
		    		denemehakki=(2-i);
		    		System.out.println("kalan deneme hakkınız:" + denemehakki);
		    		if(denemehakki==0){
		    			System.out.println("Kartınız Bloke olmuştur!");
		    			break;
		    		}
		    		i++;
		    	}
		    }
				
		    
		    
				if(giris) {
					System.out.println("MENU\n-----------"
							+ "\n1-Para Çekme" 
							+ "\n2-Para Yatırma"
							+ "\n3-Hesap Bilgileri"
							+ "\n4-Çıkış");
					
					do {
						
					secim=input.nextInt();
						
					switch (secim) {
					case 1: {
						System.out.print("Çekmek istediğiniz miktarı giriniz:");
		            	cekilecekmik=input.nextInt();
		            	
		            	while(bakiye<cekilecekmik) {
		            		System.out.println("Bakiyeniz yetersiz. Tekrar miktar giriniz..");
		            		cekilecekmik=input.nextInt();
		            		} 
		            	if(bakiye>=cekilecekmik) {
		            		System.out.print("işlem başarılı!");
		            		bakiye-=cekilecekmik;
		            	   System.out.println("kalan bakiyeniz:" + bakiye);
		            	   }
		            	
		            	System.out.println("MENU\n-----------"
		    					+ "\n1-Para Çekme" 
		    					+ "\n2-Para Yatırma"
		    					+ "\n3-Hesap Bilgileri"
		    					+ "\n4-Çıkış");
						break;
					}
		            case 2: {
		            	System.out.print("Yatırmak istediğiniz miktarı giriniz:");
		            	yatirilacakmik=input.nextInt();
		            	System.out.print("işlem başarılı!");
		        		bakiye+=yatirilacakmik;
		        	    System.out.println("mevcut bakiyeniz:" + bakiye);
		        	    System.out.println("MENU\n-----------"
		    					+ "\n1-Para Çekme" 
		    					+ "\n2-Para Yatırma"
		    					+ "\n3-Hesap Bilgileri"
		    					+ "\n4-Çıkış");
						break;
					}
		            case 3: {
		            	  System.out.println("mevcut bakiyeniz:" + bakiye);
		            	  System.out.println("MENU\n-----------"
			    					+ "\n1-Para Çekme" 
			    					+ "\n2-Para Yatırma"
			    					+ "\n3-Hesap Bilgileri"
			    					+ "\n4-Çıkış");
		   				break;
					}
		            case 4: {
						System.out.println(" “Uygulamadan başarıyla çıkıldı” ");
						break;
					}
					default:  {
						System.out.println("Geçerli Değer Giriniz!!!");
					}
					
					System.out.println("MENU\n-----------"
							+ "\n1-Para Çekme" 
							+ "\n2-Para Yatırma"
							+ "\n3-Hesap Bilgileri"
							+ "\n4-Çıkış");
				
					}
					}while(secim!=4);
				}
			
		
	}

}
