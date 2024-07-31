
public class Main {

	public static void main(String[] args) {
		// Dizilerdeki elemanların ortalamasını hesaplayan program
		int[] array = {1,2,3,4,5};
		 
		double ortalama;
		int toplam=0;
		
		System.out.println("dizi elemanları:");
		for(int i=0; i<array.length; i++) {
			toplam+=array[i];
			System.out.print(array[i] + " ");
		}
		ortalama=toplam/array.length;
		System.out.println("\nortalama :" + ortalama);

	}

}
