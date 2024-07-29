import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		/*
Ödev
Aynı örneği switch-case kullanmadan yapınız.

		 */
    
	Scanner input = new Scanner(System.in);
	int date;
	String month;
	System.out.print("doğduğunuz ayı giriniz:");
	month=input.nextLine();
	System.out.print("doğduğunuz tarihi giriniz:");
	date=input.nextInt();

    /*
	if( date>0 &&  date<31)
	{
		switch (month){
		
		case "ocak":{
			if(0<date && date<22) {
				System.out.println("oğlak burcu");
			}
			if(date<=30 && date>21) {
				System.out.println("kova burcu");
			}
			break;
		}
		case "şubat":{
			if(0<date && date<20) {
				System.out.println("kova burcu");
			}
			if(date<=30 && date>19) {
				System.out.println("balık burcu");
			}
			break;
		}
		case "mart":{
			if(0<date && date<21) {
				System.out.println("balık burcu");
			}
			if(date<=30 && date>=21) {
				System.out.println("koç burcu");
			}
			break;
		}
		case "nisan":{
			if(0<date && date<21) {
				System.out.println("koç burcu");
			}
			if(date<=30 && date>=21) {
				System.out.println("boğa burcu");
			}
			break;
		}
		case "mayıs":{
			if(0<date && date<22) {
				System.out.println("boğa burcu");
			}
			if(date<=30 && date>21) {
				System.out.println("ikizler burcu");
			}
			break;
		}
		case "haziran":{
			if(0<date && date<=22) {
				System.out.println("ikizler burcu");
			}
			if(date<=30 && date>22) {
				System.out.println("yengeç burcu");
			}
			break;
		}
		case "temmuz":{
			if(0<date && date<=22) {
				System.out.println("yengeç burcu");
			}
			if(date<=30 && date>22) {
				System.out.println("aslan burcu");
			}
			break;
		}
		case "ağustos":{
			if(0<date && date<=22) {
				System.out.println("aslan burcu");
			}
			if(date<=30 && date>22) {
				System.out.println("başak burcu");
			}
			break;
		}
		case "eylül":{
			if(0<date && date<=22) {
				System.out.println("başak burcu");
			}
			if(date<=30 && date>22) {
				System.out.println("terazi burcu");
			}
			break;
		}
		case "ekim":{
			if(0<date && date<=22) {
				System.out.println("terazi burcu");
			}
			if(date<=30 && date>22) {
				System.out.println("akrep burcu");
			}
			break;
		}
		case "kasım":{
			if(0<date && date<22) {
				System.out.println("akrep burcu");
			}
			if(date<=30 && date>21) {
				System.out.println("yay burcu");
			}
			break;
		}
		case "aralık":{
			if(0<date && date<22) {
				System.out.println("yay burcu");
			}
			if(date<=30 && date>21) {
				System.out.println("oğlak burcu");
			}
			break;
		}
		}
	}*/
	
	// switch-case kullanmadan-----------------------------------------------------
   if(month.equals("ocak"))
   {
	   if(0<date && date<22) {
			System.out.println("oğlak burcu");
		}
		if(date<=30 && date>21) {
			System.out.println("kova burcu");
		}
   }
   else if(month.equals("şubat"))
   {
	   if(0<date && date<20) {
			System.out.println("kova burcu");
		}
		if(date<=30 && date>19) {
			System.out.println("balık burcu");
		}
   }
   
   else if(month.equals("mart"))
   {
	   if(0<date && date<21) {
			System.out.println("balık burcu");
		}
		if(date<=30 && date>=21) {
			System.out.println("koç burcu");
		}
   }
   else if(month.equals("nisan"))
   {
	   if(0<date && date<21) {
			System.out.println("koç burcu");
		}
		if(date<=30 && date>=21) {
			System.out.println("boğa burcu");
		}
   }
   else if(month.equals("mayıs"))
   {
	   if(0<date && date<22) {
			System.out.println("boğa burcu");
		}
		if(date<=30 && date>21) {
			System.out.println("ikizler burcu");
		}
   }
   else if(month.equals("haziran"))
   {
	   if(0<date && date<=22) {
			System.out.println("ikizler burcu");
		}
		if(date<=30 && date>22) {
			System.out.println("yengeç burcu");
		}
   }
   else if(month.equals("temmuz"))
   {
	   if(0<date && date<=22) {
			System.out.println("yengeç burcu");
		}
		if(date<=30 && date>22) {
			System.out.println("aslan burcu");
		}
   }
   else if(month.equals("ağustos"))
   {
	   if(0<date && date<=22) {
			System.out.println("aslan burcu");
		}
		if(date<=30 && date>22) {
			System.out.println("başak burcu");
		}
   }
   else if(month.equals("eylül"))
   {
	   if(0<date && date<=22) {
			System.out.println("başak burcu");
		}
		if(date<=30 && date>22) {
			System.out.println("terazi burcu");
		}
   }
   else if(month.equals("ekim"))
   {
	   if(0<date && date<=22) {
			System.out.println("terazi burcu");
		}
		if(date<=30 && date>22) {
			System.out.println("akrep burcu");
		}
   }
   else if(month.equals("kasım"))
   {
	   if(0<date && date<22) {
			System.out.println("akrep burcu");
		}
		if(date<=30 && date>21) {
			System.out.println("yay burcu");
		}
   }
   else if(month.equals("aralık"))
   {
	   if(0<date && date<22) {
			System.out.println("yay burcu");
		}
		if(date<=30 && date>21) {
			System.out.println("oğlak burcu");
		}
    }
	}
}
