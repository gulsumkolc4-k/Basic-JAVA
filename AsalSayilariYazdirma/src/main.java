public class main {

	public static void main(String[] args) {
		/*Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/
	
		boolean asalMi=false;	
		
    for(int i=2; i<100; i++ ) {
    	
    	if(i==2) {
    		System.out.println("2 ");
    	}
    	
    	for(int j=2; j<i; j++) {
    		if(i%j==0) {
        		asalMi=false;
        		break;
        	}
        	 else {
        	    asalMi=true;
        	    }
        	}
    	if(asalMi==true) {
        	System.out.println(i);
        }
    	}
    }
	}


