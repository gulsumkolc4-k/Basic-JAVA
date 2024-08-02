import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Main {

	public static void main(String[] args) {
		/* Çok boyutlu diziler ile oluşturulmuş matrisin transpozu
        Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı 
        satırları ile sütunlarının yer değiştirmesi demektir.
        */
		Scanner inpScanner= new Scanner(System.in);
	
		
		int[][] matris= new int[2][3];
		
		
		System.out.println("matrisi doldurunuz:");
		for(int i=0; i<matris.length; i++) {
			
			for(int j=0; j<matris[0].length; j++) {
				
			matris[i][j]=inpScanner.nextInt();
	
			}
		}
		
		System.out.println("matris:");
		
		for(int row[] : matris) {
			
			for(int column : row) {
				
				System.out.print(column + " ");
			}
			System.out.println();
		}

	
	   int[][] transpoz=new int[3][2];
		
	   for(int i=0; i<2; i++)
	   {
		   for(int j=0; j<3; j++) {
		    	
			   transpoz[j][i]=matris[i][j];
		    }
	   }
	   
	   
		System.out.println("transpoz matris:");
          for(int row[] : transpoz) {
			
			for(int column : row) {
				
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
		
		
		
		

		
		
	}

}
