import java.util.Date;
import java.util.Locale;

public class DateDemo2 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		String str = String.format(Locale.US, "�^����²��: %tb",date);
		System.out.println(str);
		
		
		System.out.printf("���a���²��: %tb%n",date);  
		str = String.format(Locale.US,"�^��������: %tB",date);  
		System.out.println(str);  
		  
		System.out.printf("���a�������: %tB%n",date);  
		str = String.format(Locale.US,"�^��P����²��: %ta",date);  
		System.out.println(str);  
		  
		System.out.printf("���a�P����²��: %tA%n",date);  
		  
		System.out.printf("�~���e���Ʀr (�e��0��2��): %tC%n",date);  
		  
		System.out.printf("�~������Ʀr (�e��0��2��): %ty%n",date);  
		  
		System.out.printf("�@�~�����Ѽ� (�Y�~���ĴX��): %tj%n",date);  
		  
		System.out.printf("���Ʀr����� (�e��0��2��): %tm%n",date);  
		  
		System.out.printf("���Ʀr���� (�e��0��2��): %td%n",date);  
		  
		System.out.printf("�������: %te",date); 
		
	}

}
