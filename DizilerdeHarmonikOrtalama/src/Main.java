import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

          Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

		 */
		Scanner input = new Scanner(System.in);

		int n;

		System.out.print("eleman sayısı giriniz:");
		n=input.nextInt();
		
		double[] harmonik = new double[n];
		
		double harmonik_ortalama;
		double toplam=0;
		
		for(int i=0; i<n; i++) {
			harmonik[i]=1.0/(i+1);
			toplam+=harmonik[i];
			System.out.println( (i+1) + ". eleman : "+ harmonik[i]);
		}
	
		System.out.println(toplam);
		harmonik_ortalama=n/toplam;
		
		System.out.println(harmonik_ortalama);
		
		
		
		
		
		
	}

}
