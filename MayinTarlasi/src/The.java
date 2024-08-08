import java.util.Scanner;

public class The {

	public static void main(String[] args) {
		
		
		int row;
		int column;
		
		Scanner inputScanner= new Scanner(System.in);
		
		System.out.println("Welcome to minesweeper game!");
		 do {
			 System.out.println("Please enter size (at least 2x2):");
				System.out.print("Enter line:");
				row=inputScanner.nextInt();
				System.out.print("Enter column:");
				column=inputScanner.nextInt();
		  if(row<2 || column<2) {
					System.out.println("Invalid size input!!!");
		   }
	       }while(column<2 || row<2);
	  
		 
		String[][] matriStrings = new String[row][column]; //kullanıcıya gösterilecek olan
		char[][] matrisChar= new char[row][column]; //yalnızca bizim göreceğimiz dizi
		
		Minesweeper minesweeper = new Minesweeper(matriStrings,matrisChar);
		minesweeper.run(row,column);

	}

}
