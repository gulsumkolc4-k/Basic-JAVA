import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/* Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
Örnek
Basamak Sayısı : 10
******************* 
***************** 
*************** 
************* 
*********** 
********* 
******* 
***** 
*** 
*
		 */
		Scanner inp= new Scanner( System.in);
		int basamak;
		System.out.print("basamak değerini giriniz:");
		basamak=inp.nextInt();
		
		for(int i=basamak; i>0; i--) {
			for(int j=0; j<(i*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
