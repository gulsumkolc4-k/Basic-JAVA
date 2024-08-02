import java.util.Arrays;

public class Main {
	
	static boolean isFind(int arr[] , int value){
		for(int i : arr) {
			if(i==value) { //dizinin i. elemanı gönderilen değere eşitse false döndür.
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] list= {3,7,3,3,2,9,10,21,1,33,9,1};
		int[] duplicate=new int[list.length];
		int startindex=0;
		for(int i=0; i<list.length; i++) {
			 
			for(int j=0; j<list.length; j++) {
				
			if((i!=j) && (list[i]==list[j])) {
			
				if(!isFind(duplicate, list[i])) {
					duplicate[startindex++]=list[i];
				}
				break;
			}
			}
		}
		System.out.print("Tekrar eden sayılar :");
		for(int value: duplicate) {
			if(value!=0) {
				System.out.print( value + " ");
			}
		}
		System.out.println();
		int again=0;
		int j=0;
		while(duplicate[j]!=0)
		{
			again=0;
			for(int i=0; i<list.length; i++) {
				if(list[i]==duplicate[j]) {
					again++;
					continue;
				}
			}
			System.out.println(duplicate[j] + " " +  again + " kez tekrar etti.");
			j++;
		}
			//System.out.println(Arrays.toString(duplicate));
	}
}
