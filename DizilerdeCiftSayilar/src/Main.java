
public class Main {

	public static void main(String[] args) {
		//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program 
		
		int[] numbers= {2,5,7,9,2,4,5,9,8,4};
		int number=0;
		int again=0;
		
		
		for(int i=0; i<numbers.length; i++) {
	
			if(numbers[i]%2==0) {
	           for(int j=0; j<i; j++) {
	        	   if(numbers[j]==numbers[i]) {
	        		   System.out.println("tekrar eden çift sayılar : " + numbers[j]);
	        	   }
	           }
			}
		}

	}

}
