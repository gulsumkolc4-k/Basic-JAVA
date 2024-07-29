public class Fighter {

	String name;
	int kg;
	int can;
	int hasar;
	int yas;
	int savunma;
	String oyuncu1;
	String oyuncu2;
	String atak;
	
	
	public Fighter(String name,int kg,int yas,int can,int hasar,int savunma) {
		this.can=can;
		this.savunma=savunma;
		this.kg=kg;
		this.hasar=hasar;
		this.name=name;
		this.yas=yas;
	}
	
	public int vurus(Fighter atak) {
		
		    System.out.println("---------------");
			System.out.println(atak.name +" canı " +   atak.can);
			System.out.println(this.name + "=>" +atak.name + " " + this.hasar +" vurdu." );
			
			if(atak.savunma()) {
				System.out.println(atak.name + " gelen hasarı savurdu");
				return atak.can;
			}
			else {
				atak.can-= this.hasar;
				System.out.print(atak.name  +" kalan canı: " );
			}
			
		   if(atak.can<0) {
			   return 0;
		   }
			
			
			
		   return  atak.can;
	}
	
	public boolean savunma() {
		
		double randomdeger=Math.random()*100;
 
		
		return randomdeger<= this.savunma;
		
		
	}
	
	
	
	
}
