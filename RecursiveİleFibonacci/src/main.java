import java.util.Scanner;

public class main {
 
	static int Fibo(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return Fibo(n-1) + Fibo(n-2);
	}
		
	public static void main(String[] args) {
		
		Scanner inputScanner= new Scanner(System.in);
		
		int n;
		System.out.print("kaçıncı eleman yazdırılacak?");
		n=inputScanner.nextInt();
		System.out.println(Fibo(n));
		
	}
}
