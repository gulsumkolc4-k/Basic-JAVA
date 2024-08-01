import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//döngüler kullanılarak yıldızlar ile üçgen yapma
				/*
		     *        
		    ***       
		   *****      
		  *******     
		 *********    
		***********  
			    */
				/*
				 Scanner klavye = new Scanner(System.in);
			        System.out.println("Bir Sayı Giriniz :");
			        int n = klavye.nextInt();

			        for (int i = 0; i <= n ; i++) {
			            for (int j = 0; j < (n - i); j++) {
			                System.out.print(" ");
			            }
			            for (int k = 1; k <= (2 * i + 1); k++) {
			                System.out.print("*");
			            }
			            System.out.println(" ");
			        }
			        */
			        /*
			       döngüler kullanarak yıldızlar ile elmas yapımı 
			         *
		            *** 
		           ***** 
		          ******* 
		         ********* 
		          *******
		           ***** 
		            *** 
		             *
			      
			         */
			        
			        Scanner klavye = new Scanner(System.in);
			        System.out.println("Bir Sayı Giriniz :");
			        int n = klavye.nextInt();

			        for (int i = 0; i <= (n/2) ; i++) {
			        	
			            for (int j = 0; j < ((n/2) - i); j++) {
			                System.out.print(" ");
			            }
			            for (int k = 1; k <= (2 * i + 1); k++) {
			                System.out.print("*");
			            }
			            System.out.println(" ");
			        }
			        
			        int y=0;
			        
			        for (int i = (n/2)-1; i >=0 ; i--) {
			        	
			        for (int t =0 ; t <y+1; t++) {
		                System.out.print(" "); 
		            }
			        y++;
		            for (int m =0; m <(2*i)+1; m++) {
		                System.out.print("*");
		            }
		            System.out.println(" ");
		           
			        }
			    
	}

}
