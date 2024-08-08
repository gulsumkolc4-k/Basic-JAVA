import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Minesweeper {

	String[][] matriStrings; 
	char[][] matrisChar;
	Scanner inputScanner= new Scanner(System.in);
	Random rand = new Random();
	int row;
	int column;
	int total_mines;
	
	public Minesweeper(String[][] matriStrings,char[][] matrisChar) {
		this.matrisChar=matrisChar;
		this.matriStrings=matriStrings;
		this.row=row;
		this.column=column;
		this.total_mines=total_mines;
	}
	

	
	public void run(int row, int column) {

		
		int loopsize;
		
		//fonksiyonları çağır
		complete(row,column);
		minefield(row, column);
		print(row,column);
		
	   /*//mayınların konum kontrolü
		System.out.println("LOCATION OF MINES : ");
		for(int i=0; i<row; i++) {
    		for(int j=0; j<column; j++) {
    		System.out.print(this.matrisChar[i][j]);
    		}
    		System.out.println();
    	}
	   */
		
		// mayın olmayan boş kutuların sayısı
		loopsize = (row*column) -((row*column)*25)/100; 
		
		
	  
		int line;
		int column2;
		//Mayın kontrolü yap
		do {
			 
		   total_mines=0;
		   System.out.println("Enter coordinates: (row, column) : ");
		   System.out.print("Row : ");
		   line=inputScanner.nextInt()-1;
		   System.out.print("Column : ");
		   column2=inputScanner.nextInt()-1;
		    
		   //if(column+1>=sutun && sutun>0 && row+1>=satir && satir>0) {
		   if( column>=column2 && row>=line && line>=0 && column2>=0 ) {
			   
		
			   
			    if(matrisChar[line][column2]=='*') {
					System.out.println("GAME OVER..");
       	    	break;
       	        }
			    else {
			    	
                    if(column2-1>=0 && line-1>=0) {
                    	if( matrisChar[line-1][column2-1]=='*') {
   		            	 total_mines++;
      	                }
                    }
		            
                    if(line-1>=0) {
                    	if(matrisChar[line-1][column2]=='*' ) { 
   		            	 total_mines++;
      	                }
                    }
                    
		            if(line-1>=0 && column2+1<column) {
		            	if(matrisChar[line-1][column2+1]=='*' ) {
			            	 total_mines++;
			            	 
	   	                }
		            }
		            
		            if(column2-1>=0){
		            	if( matrisChar[line][column2-1]=='*' ) {
		        			 total_mines++;
		        		}
		            }
	        		
		            if(column>column2+1) {
		            	if(matrisChar[line][column2+1]=='*') {
		        			 total_mines++;
		        		}
		            }
	        		
		            if(line+1<row &&  column2-1>=0) {
		            	if(matrisChar[line+1][column2-1]=='*') {
		        	    	 total_mines++;
		        		}
		            }
	        	    
		            if(line+1<row) {
		            	if(matrisChar[line+1][column2]=='*') { 
		        			 total_mines++;
		        		}
		            }
	        		
		            if(line+1<row && column2+1<column) {
		            	 if(matrisChar[line+1][column2+1]=='*') {
		        	    	 total_mines++;
		        		}
		            }
		            matriStrings[line][column2]= String.valueOf(total_mines);
		        	print(row,column);
	        	   
			    }
		   }
		   else {
               System.out.println("INVALID ENTRY");
           }
		   System.out.println("=======================");
		   loopsize--;
		   
		   if(loopsize==0) {
			   System.out.println("YOUR WIN!!!!");
			   System.out.println("LOCATION OF MINES : ");
				for(int i=0; i<row; i++) {
		    		for(int j=0; j<column; j++) {
		    		System.out.print(this.matrisChar[i][j]);
		    		}
		    		System.out.println();
		    	}
			   
		   }  
		
		
		}while(loopsize>0);
		
		
		
	}
		
		
		
	
	
	//matrisleri doldur.
    public void complete(int row , int column) {
    	
    	matriStrings = new String[row][column];
		matrisChar= new char[row][column];
		
    	for(int i=0; i<row; i++) {
    		for(int j=0; j<column; j++) {
    			matriStrings[i][j]="-";
    			matrisChar[i][j]='-';
    			
    		}
    	}
    }
	
	
    
	//matris yazdır.
	public void print(int row, int column) {
		for(int i=0; i<row; i++) {
    		for(int j=0; j<column; j++) {
    		System.out.print(this.matriStrings[i][j]);
    		}
    		System.out.println();
    	}
		
		System.out.println();
		
	}
	
	
	//mayınları yerleştir.
     public void minefield(int row, int column) {
	
     int number_of_mines=((row*column)*25)/100; //toplam mayın sayısı
  
     for(int i=0; i<number_of_mines; i++) {
    	  int randomX = rand.nextInt(row);
          int randomY = rand.nextInt(column); 
          
          if(matrisChar[randomX][randomY]=='*') {
        	  --i;
          }

          matrisChar[randomX][randomY]='*';
          
     }
	
	}
	
	
	
	
}
