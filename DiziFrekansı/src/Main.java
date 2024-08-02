

public class Main {

	public static void main(String[] args) {
		//dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program

		int[] numbers= {2,5,2,2,2,4,5,4,2,4};
	
		print(numbers);
		
		frekans(numbers);
	}
		
	//dizi elemanlarını yazdır
	static void print(int numbers[]) {
		
		System.out.println("dizi elemanları: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
	}
	
	//dizi elemanlarını sırala
	static void frekans(int numbers[]) {
		
		int again=0;
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers.length; j++) {
				
				if(numbers[i]==numbers[j]) {
					again++;
				}
			}
            if(numbers[i]!=numbers[i+1]){
                System.out.println(numbers[i]+" sayısı "+again+" kere tekrar edildi.");
            }
            again=0;
	
		}
	
		
		
	}
	
}	
	//-------------------------------------------------------------------
	
/*
import java.util.Arrays;

public class MAİN {

		    static boolean isFrequence(int[] arr, int n) {
		    	
		        boolean[] visited = new boolean[n];
		        Arrays.fill(visited, false);

		        for (int i = 0; i < n; i++)
		        {

		            if (visited[i] == true)
		                continue;

		            int count = 1;
		            for (int j = i + 1; j < n; j++) {
		                if (arr[i] == arr[j]) {
		                    visited[j] = true;
		                    count++;
		                }
		            }
		            if (count >= 1) {
		                System.out.println(arr[i] + " sayısı " + count+" kere tekrar edildi. ");
		            }
		        }
		        return false;
		    }


		    public static void main(String[] args) {
		        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

		        int n = list.length;
		        System.out.println("----------------------------------------");
		        System.out.println("Dizi : " + Arrays.toString(list));
		        System.out.println("----------------------------------------");

		        System.out.println("Tekrar Sayıları :");
		        isFrequence(list, n);

		    }

		
	}
*/