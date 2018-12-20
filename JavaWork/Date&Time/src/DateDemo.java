import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws ParseException {
		
		// set date
		String setDate = "2009/12/1";
		
		// 準備輸出的格式 , 如: March 2018/05/05
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Date date = sdf.parse(setDate);
		System.out.println(date);
		
		// 直接格式化輸出 now date&time
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date current = new Date();
		System.out.println(sdFormat.format(current));
		
	}

}
