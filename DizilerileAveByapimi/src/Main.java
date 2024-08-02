
public class Main {

	public static void main(String[] args) {
		
		
		// Yıldızlar ile A harfi yapımı
		String[][] letterA= new String[6][4];

		for(int i=0; i<letterA.length; i++) {
			
			for(int j=0; j<letterA[i].length; j++) {
				
				if(i==0 || i==2) {
					letterA[i][j]=" * ";
					}
				else if(j==0 || j==3) {
					letterA[i][j]=" * ";
				}
				else {
					letterA[i][j]="   ";
				}
				}
			}
		
		
		for(String[] row : letterA) {
			
			for(String column : row) {
				
				System.out.print(column);
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n");
		
		
		// Yıldızlar ile B harfi yapımı
				String[][] letterB= new String[7][4];

				for(int i=0; i<letterB.length; i++) {
					
					for(int j=0; j<letterB[i].length; j++) {
						
						if(i==0 || i==3 || i==6) {
							letterB[i][j]=" * ";
							}
						else if(j==0 || j==3) {
							letterB[i][j]=" * ";
						}
						else {
							letterB[i][j]="   ";
						}
						
						if((i==0 || i==3 || i==6) && (j==3))
						{
							letterB[i][j]="   ";
						}
						}
					}
				
				
				for(String[] row : letterB) {
					
					for(String column : row) {
						
						System.out.print(column);
					}
					System.out.println();
				}
		
		}
	}
