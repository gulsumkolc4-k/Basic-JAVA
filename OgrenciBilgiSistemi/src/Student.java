public class Student {  
	
    String name,stuNo; 
    int classes; 
    Course mat; 
    Course fizik; 
    Course kimya; 
    
    double avarage; 
    boolean isPass; 
    int note=0;
    
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) { 
        this.name = name; 
        this.classes = classes; 
        this.stuNo = stuNo; 
        this.mat = mat; 
        this.fizik = fizik; 
        this.kimya = kimya; 
        calcAvarage(); 
        this.isPass = false; 
    } 
    /*
     public void addBulkExamNote(int mat, int fizik, int kimya ) { 
    	 if (mat >= 0 && mat <= 100) { 
    		 this.mat.ortalama = mat; 
    		 } 
    	 if (fizik >= 0 && fizik <= 100) { 
    		 this.fizik.ortalama = fizik; 
    		 } 
    	 if (kimya >= 0 && kimya <= 100) { 
    		 this.kimya.ortalama = kimya; 
    		 } 
    	 } */
    
     public void isPass() { 
    	 if (this.mat.ortalama == 0 || this.fizik.ortalama == 0 || this.kimya.ortalama == 0) { 
    		 System.out.println("Notlar tam olarak girilmemiş"); 
    		 } 
    	 else { 
    		 this.isPass = isCheckPass(); 
    		 printNote(); 
    		 System.out.println("Ortalama : " + this.avarage); 
    		 if (this.isPass) { 
    			 System.out.println("Sınıfı Geçti. "); 
    			 } 
    		 else { 
    			 System.out.println("Sınıfta Kaldı."); 
    			 } 
    		 } 
    	 } 
     public void calcAvarage() { 
    	 this.avarage = (this.fizik.ortalama + this.kimya.ortalama + this.mat.ortalama) / 3; 
    	 } 
     public boolean isCheckPass() { 
    	 calcAvarage(); 
    	 return this.avarage > 55; 
    	 } 
     public void printNote(){ 
    	 //System.out.println("-----------------"); 
    	 //System.out.println("Öğrenci : " + name); 
    	 //System.out.println("Matematik Notu : " + mat.ortalama); 
    	 //System.out.println("Fizik Notu : " + fizik.ortalama); 
    	 //System.out.println("Kimya Notu : " + kimya.ortalama); 
    	 } 
     } 
