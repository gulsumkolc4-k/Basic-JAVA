
public class Main {

	public static void main(String[] args) {
		/*Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.*/
	
		Fighter fighter1=new Fighter("Marc", 90,32, 100, 30,50);
	
		Fighter fighter2=new Fighter("Alex",85,36,100,30,51);
      
		Ring ring=new Ring(fighter1, fighter2, 80, 100, 30, 40);
		ring.mac();
		

	}

}
