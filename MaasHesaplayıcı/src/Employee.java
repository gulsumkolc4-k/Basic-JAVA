public class Employee {
	String name;
    double salary;
	int workHours;
	int hireYear;
	double vergi=0;
	double bonus=0;
	int thisYear;
	double raise;
	

	    public Employee(String name,double salary,int workHours,int hireYear) { // Kurucu metot
		this.name=name;
	    this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		this.raise=0;
		this.thisYear=2021;
		
		
	}

	    //maaşın miktarına göre uygulanacak vergiyi bulan metot
	double tax() {
	
		if(this.salary<1000) {
			return this.vergi;
		}
		else {
			this.vergi=(this.salary*3)/100;
			return this.vergi;
		}
	}
	
	   //çalışma saatine göre yapılacak bonus ödemeyi hesaplayan metot
	double bonus(){
		if(this.workHours>40) {
			this.bonus=(this.workHours-40)*30;
			return this.bonus;
		}
		else {
			return this.bonus;
		}
	}
	
	//çalışılan yıl miktarına göre maaşa yapılacak zam miktarını hesaplayan metot
	 double raiseSalary() {
		 int year=this.thisYear-this.hireYear;
		 if(year<20 && year>=9) {
			 this.raise+=(this.salary*10)/100; 
			 if(year>=19) {
				 this.raise+=(this.salary*15)/100; 
			 }
			 if(year<10) {
				 this.raise+=(this.salary*10)/100;
			 }
		 }
	     if(year<=10) {
	    	this.raise+=(this.salary*5)/100;
	     }
		 return this.raise;
	 }
	
      // çalışanın bilgilerini ekrana yazdıran program
     void to_string() {
	
    	System.out.println("İsim : " +this.name);
		System.out.println("Maaş : " + (this.salary));
		System.out.println("Çalışma Saati :" +this.workHours);
		System.out.println("Başlangıç Yılı : " + this.hireYear);
		System.out.println("Toplam Çalışılan Yıl: " + ( this.thisYear-this.hireYear));
		System.out.println("Vergi : " + this.vergi );
		System.out.println("Bonus : " + this.bonus);
		System.out.println("Maaş Artışı(zam miktarı) : " + this.raise );
		System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary-this.vergi+this.bonus));
		System.out.println("Toplam Maaş : " + (this.salary-this.vergi+this.bonus + this.raise));
	
	
	}
	
	
	
	
	
	
}
