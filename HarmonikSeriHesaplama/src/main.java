import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		double formulseri=0.0;
		System.out.print("sayi değeri giriniz:");
		sayi = input.nextInt();
	    for(int i=1; i<sayi; i++) {
	    	formulseri+=(1.0/i);
	    }
	    System.out.println(formulseri);
	}

}
