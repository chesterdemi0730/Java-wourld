import java.util.Date;
import java.util.Locale;

public class TimeDemo {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.printf("2计24 (玡干02): %tH%n",date);  
		   
		System.out.printf("2计12 (玡干02): %tI%n",date);  
		
		System.out.printf("2计24: %tk%n",date);  
		  
		System.out.printf("2计12: %tl%n",date);  
		  
		System.out.printf("2计だ牧 (玡干02): %tM%n",date);  
		  
		System.out.printf("2计 (玡干02): %tS%n",date);  
		  
		System.out.printf("3计睝 (玡干03): %tL%n",date);  
		  
		System.out.printf("9计睝计 (玡干09): %tN%n",date); 
		
		String str = String.format(Locale.US, "糶ダとと夹癘: %tp" , date);
		System.out.println(str);
		
		System.out.printf ("糶ダとと夹癘: %tp%n",date);  
		   
		System.out.printf("癸GMTRFC822跋熬簿秖: %tz%n",date);  
		  
		System.out.printf("跋罽糶才﹃: %tZ%n",date);  
		  
		System.out.printf("1970-1-1 00:00:00 瞷┮竒筁计: %ts%n",date);  
		  
		System.out.printf("1970-1-1 00:00:00 瞷┮竒筁睝计: %tQ%n",date); 
		
	}
}
