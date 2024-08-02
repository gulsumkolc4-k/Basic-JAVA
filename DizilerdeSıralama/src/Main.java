import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
		//Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
		
		Scanner inputScanner= new Scanner(System.in);
		int size;
		
		System.out.println("Kaç eleman gireceksiniz?: " );
		size=inputScanner.nextInt();
		
		int[] array=new int[size];
		
		

		System.out.println("Elemanları Giriniz:\n"
				+ "------------------------------");
		
		for(int i=0; i<size; i++) {
			System.out.print((i+1) + ". elemanı giriniz:");
			array[i]=inputScanner.nextInt();
		}	
		    sirala(array);
	}

	
	
	static void sirala(int array[]) {
		System.out.println("Elemanların Sıralı Hali:\n"
				+ "-------------------------------");
 
        int gecici;
        
        
        for(int i=0; i<array.length-1; i++) {
        	
        	for(int j=i+1; j<array.length; j++) {
        		
        		if(array[j]<array[i]){
        			
        			gecici=array[i];
        			array[i]=array[j];
        			array[j]=gecici;
        		}
        }
        	}
        	for(int k = 0; k < array.length; k++)
            {
                System.out.print(array[k] + " ");
            }
     
			
		
	}
	
	
	
	
	
	
	
	
	
}
		
		


