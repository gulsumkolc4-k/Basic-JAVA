import javax.swing.text.StyledEditorKit.BoldAction;

import org.w3c.dom.ls.LSOutput;

public class Ring {

	Fighter oyuncu1;
	Fighter oyuncu2;
	int minkg;
	int maxkg;
	int minyas;
	int maxyas;
	boolean kilokontrol=true;
	boolean yaskontrol=true;
	
	public Ring(Fighter oyuncu1,Fighter oyuncu2,int minkg,int maxkg,int minyas,int maxyas) {
		this.oyuncu1=oyuncu1;
		this.oyuncu2=oyuncu2;
		this.minkg=minkg;
		this.maxkg=maxkg;
		this.minyas=minyas;
	    this.maxyas=maxyas;
	}
	
	public void mac() {
		kilo_kontrol();
		yas_kontrol();

	    boolean head;
	    
	    
	    
	    
		if(basla()==1) {
			System.out.println(oyuncu2.vurus(oyuncu1));
			head=true;
		}
		else {
			System.out.println(oyuncu1.vurus(oyuncu2));
			head=false;
		}
	
	
		if(head) {
		while(oyuncu1.can>0 && oyuncu2.can>0) {
			
		
				System.out.println(oyuncu1.vurus(oyuncu2));
				if(oyuncu2.can<=0) {
					System.out.println("Maçı Kazanan : " + oyuncu1.name);
					break;
				}

				System.out.println(oyuncu2.vurus(oyuncu1));
				if(oyuncu1.can<=0) {
					System.out.println("Maçı Kazanan : " + oyuncu2.name);
					break;
				}
			
		}
		}
		else {
			while(oyuncu1.can>0 && oyuncu2.can>0) {
				
				System.out.println(oyuncu2.vurus(oyuncu1));
				if(oyuncu1.can<=0) {
					System.out.println("Maçı Kazanan : " + oyuncu2.name);
					break;
				}
				
				System.out.println(oyuncu1.vurus(oyuncu2));
				if(oyuncu2.can<=0) {
					System.out.println("Maçı Kazanan : " + oyuncu1.name);
					break;
				}
			}
			
		
		}
	}
		

	
	public void kilo_kontrol() {
	 if((this.oyuncu1.kg<=this.maxkg && this.oyuncu1.kg>=this.minkg) 
			 && (this.oyuncu2.kg<=this.maxkg && this.oyuncu2.kg>=this.minkg) ) {
		 //System.out.println("kilo kontrol");
		}
	 else {
		 System.out.println("Oyuncuların kilogramları uyuşmuyor!");
	 }
	}
	
	public void yas_kontrol() {
		 if((this.oyuncu1.yas<=this.maxyas &&  this.oyuncu1.yas>=this.minyas) 
		&& (this.oyuncu2.yas<=this.maxyas && this.oyuncu2.yas>=this.minyas) ) {
			 //System.out.println("yas kontrol");
			}
		 else {
			 System.out.println("Oyuncuların yaşları uyuşmuyor!");
		 }
	}
	
	
	public int basla() {
		
		double sec=Math.random()*2;
		if(sec>=1 && sec<2) {
			return 1;
		}
		else    {
			return 0;
		}
		
	}
	
	
}
	
	
	
	

