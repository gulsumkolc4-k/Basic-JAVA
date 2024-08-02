import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//Sayi tahmin oyunu

public class Main {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
        Random rand = new Random();

		//rastgele sayı belirle
	    int value =rand.nextInt(10);
	    //int value = (int) (Math.random() * 100);
		//System.out.print(value);
        
	    //kullanıcıdan tahmin al.
		int guess;
		int test=0;
		int[] Guess = new int[5];
		boolean isWin = false;
		
		
		//kullanıcının 5 deneme hakkı var
		while(test<5) {
			
			System.out.print("\nTahmininizi giriniz:");
			guess=input.nextInt();
			if(guess==value) {
				 isWin = true;
				 break;
			}
			else {
				
				
					
					if(value<guess) {
						System.out.print("Daha küçük bir tahmin yapınız.");
					}
					else {
						System.out.print("Daha büyük bir tahmin yapınız.");
					}
					Guess[test++]=guess;
					System.out.print("\nKalan tahmin hakkınız: " + (5-test));
				
				
			}

		
		}
		
		if(isWin) {
			System.out.print("\nTebrikler doğru tahmin!");
		}
		else {
			
			System.out.print("\nTahmin hakkınız bitti.");
			
			//tahminler
			System.out.print("\nTahminleriniz:");
			for(int i : Guess ) {
				System.out.print(i+ " ");
			}
			
			
		}
		

	}

}
