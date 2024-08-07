import java.util.Scanner;

public class sinif3 {

	public static void main(String[] args) {
	
		/*Dik Üçgende Hipotenüs Bulan Program*/
		
		int dikKenar1;
		int dikKenar2;
		int  h;
		double hipotenus;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("birinci dik kenar değerini giriniz:");
		dikKenar1 = input.nextInt();
		System.out.print("ikinci dik kenar değerini giriniz:");
		dikKenar2 = input.nextInt();
		
		h = (dikKenar1*dikKenar1) + (dikKenar2*dikKenar2);
		hipotenus= Math.sqrt(h);
	   
		System.out.print("hipotenus değeri:" + hipotenus + "\n");
		
		double ucgencevresi = dikKenar1+dikKenar2+hipotenus ;
		System.out.print("üçgenin çevresi:" + ucgencevresi + "\n");
		
		double ucgenalan = (dikKenar1*dikKenar2)/2;
		System.out.print("üçgenin alanı:" + ucgenalan);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
