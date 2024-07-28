public class Main {
	public static void main(String[] args) { 
		Course mat = new Course("Matematik"  ,  "MAT101" , "MAT"); 
		Course fizik = new Course(  "Fizik"  ,  "FZK101" , "FZK"); 
		Course kimya = new Course(  "Kimya"  ,  "KMY101" , "KMY"); 
		
		Teacher t1 = new Teacher("Mehmet", "90550000000" , "MAT"); 
		Teacher t2 = new Teacher("Ayşe"  , "90550000001" , "FZK"); 
		Teacher t3 = new Teacher("Ali"   , "90550000002" , "KMY"); 
		
		mat.addTeacher(t1); 
		mat.printTeacher();
		fizik.addTeacher(t2); 
		fizik.printTeacher();
		kimya.addTeacher(t3);
		kimya.printTeacher();
		
		System.out.println("---------------------------------------------------");
		Student s1 = new Student("Aslı", 4, "140144015", mat, fizik, kimya); 
		mat.ortalama_hesapla(s1,"Matematik", 89, 50);
		fizik.ortalama_hesapla(s1,"Fizik", 43, 50);
		kimya.ortalama_hesapla(s1,"Kimya", 55, 60);
		s1.isPass(); 
		//s1.addBulkExamNote(50,20,40); 
	
		
		System.out.println("---------------------------------------------------");
		Student s2 = new Student("Derya", 4, "2211133", mat, fizik, kimya); 
		mat.ortalama_hesapla(s2,"Matematik", 87, 58);
		fizik.ortalama_hesapla(s2,"Fizik", 54, 67);
		kimya.ortalama_hesapla(s2,"Kimya", 56, 40);
		s2.isPass();
		//s2.addBulkExamNote(100,50,40); 
		
		System.out.println("---------------------------------------------------");
		Student s3 = new Student("İsmail", 4, "221121312", mat, fizik, kimya); 
		mat.ortalama_hesapla(s3,"Matematik", 23 , 50);
		fizik.ortalama_hesapla(s3,"Fizik", 54, 36);
		kimya.ortalama_hesapla(s3,"Kimya", 42, 59);
		s3.isPass(); 
		//s3.addBulkExamNote(50,20,40); 
		
		} 
	} 