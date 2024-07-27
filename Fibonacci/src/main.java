import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*Fibonacci Serisi*/
		int eleman;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("kaç eleman yazdırılacak?");
		eleman=inp.nextInt();
		
		int birinci=0;
		int ikinci=1;
		int toplam=0;
		for(int i=0; i<=eleman; i++) {   
			toplam+=birinci;
			birinci=ikinci;
			ikinci=toplam;
           
		}
		 System.out.println(toplam);
	}
}
