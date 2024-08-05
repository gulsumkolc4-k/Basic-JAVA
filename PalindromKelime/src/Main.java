import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// bir kelimenin palindrom olup olmadığını bulma
		
		Scanner inputScanner= new Scanner(System.in);
		
		String kelime;
        
		
		System.out.print("Kelime giriniz:");
		kelime=inputScanner.nextLine();
		System.out.println(kelime);
		boolean is_palindrom=true;
		
		
		char[] harf= new char[kelime.length()];
		char[] reverse_harf= new char[kelime.length()];
		
	
		for(int i=0; i<harf.length; i++) {
			
			harf[i]=kelime.charAt(i);
			//System.out.println(harf[i]);
		}
		 
         for(int i=harf.length-1 , j=0; i>=0; i--,j++) {
			
			reverse_harf[j]=harf[i];
			//System.out.println(reverse_harf[j]);
		}
		
		for(int i=0; i<harf.length; i++) {
			
			if(reverse_harf[i]!=harf[i]) {
				is_palindrom=false;
				break;
			}
			else {
				is_palindrom=true;
			}
		}
		
		if(is_palindrom) {
			System.out.println("Kelime palindromdur.");
		}
		else System.out.println("Kelime palindrom değildir.");

         
	}

}
