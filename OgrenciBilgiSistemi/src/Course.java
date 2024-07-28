public class Course { 
	Teacher courseTeacher; 
	String name; 
	String code;
	String prefix; 
	double yazili; 
	double sozlu;
	double ortalama;
	
	
	public Course(String name, String code, String prefix) { 
		this.name = name; 
		this.code = code; 
		this.prefix = prefix;
		} 
	
	public void addTeacher(Teacher t) { 
		if (this.prefix.equals(t.branch)) { 
			this.courseTeacher = t; 
			System.out.println("İşlem başarılı"); 
			} 
		else { 
			System.out.println(t.name + " Akademisyeni bu dersi veremez."); 
			} 
		} 
	
	public void printTeacher() { 
		if (courseTeacher != null) { 
			System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name); 
			} 
		else {
			System.out.println(this.name + " dersine Akademisyen atanmamıştır."); 
			}
		}
	
	public void ortalama_hesapla(Student derStudent,String name ,double sozlu, double yazili) {
	
		 this.ortalama=sozlu*(0.2) + yazili*(0.8);
		
		System.out.println(derStudent.name + " öğrencinin " + this.name + " dersinin ortalaması :" + this.ortalama);
		
		
	}
	
	
	
	} 