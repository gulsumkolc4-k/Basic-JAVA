
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Dizideki Elemanların Max ve Min Değerlerini Bulan Program
		int[] array= new int[]{45,32,6,7,256,17,657,-1};
		
		int max=array[0];
		int min=array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
			    min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		//-------------------------------------------------------
		//Dizideki elemanların girilen sayıdan küçük en yakın 
		//sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
		
		Scanner input = new Scanner(System.in);
		
		int n;

		System.out.print("sayı değeri giriniz: ");
        n=input.nextInt();		
        
        int maxfark=max-min; 
		int minfark=0;
		int fark;
		int fark2;
        
		for(int i=0; i<array.length; i++) {
        fark=array[i]-n; 
     
        if(fark<0) {
        	fark*=(-1);
        }
		if(fark<maxfark) {
				minfark=fark;
				maxfark=fark;
			}
		}
		
		
		for(int j=0; j<array.length; j++) {
			fark2=array[j]-n; 
	
	        if(fark2<0) {
	        	fark2*=(-1);
	        }
			
	        if(fark2==maxfark) {
	        	System.out.println("Girilen sayıdan küçük en yakın sayı:" +  array[j]);
	        }
		}
		//---------------------------------------------------------
		maxfark=max-min; 
		minfark=0;
		fark=0;
		fark2=0;
        
		for(int i=0; i<array.length; i++) {
	        fark=array[i]-n; 
	     
	        if(fark>0) {
	        	if(fark<maxfark) {
					minfark=fark;
					maxfark=fark;
				}
	        }
		}
			
			
			for(int j=0; j<array.length; j++) {
				fark2=array[j]-n; 
		     
				 if(fark2>0) {
					 if(fark2==maxfark) {
				        	System.out.println("Girilen sayıdan büyük en yakın sayı:" +  array[j]);
				        }
				 }
			}
			
		
		
		
	}

}

