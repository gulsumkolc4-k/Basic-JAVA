
public class main {
	
	/*Java'da "Employee" adında fabrika çalışanlarının maaş bilgisini veren program */
	
	
	public static  void main(String[] args) {
		
		Employee employee = new Employee("Ahmet", 1000, 42, 2002);
		employee.tax();
		employee.bonus();
		employee.raiseSalary();
		employee.to_string();
		
		
		

	}

}
