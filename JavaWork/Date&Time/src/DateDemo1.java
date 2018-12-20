import java.util.Date;

public class DateDemo1 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		// 顯示所有日期與時間的信息 %tc , CST是時區
		System.out.printf("信息: %tc%n", date);
		
		// 顯示月/日/年的格式 %tD
		System.out.printf("月/日/年格式: %tD%n", date);
		
		// 顯示年-月-日的格式 %tF
		System.out.printf("年-月-日格式: %tF%n", date);
		
		// HH:MM:SS PM格式 (12時制) %tr
		System.out.printf("HH:MM:SS PM格式: %tr%n", date);
		
		// HH:MM:SS 格式 (24時制) %tT
		System.out.printf("HH:MM:SS 格式: %tT%n", date);
		
		// HH:MM 格式 (24時制) %tR
		System.out.printf("HH:MM 格式: %tR%n", date);
		
		// 年-月-日 HH:MM:SS 格式: %1$tF %1$tT
		System.out.printf("年-月-日 HH:MM:SS 格式: %1$tF %1$tT%n", date);
		
	}

}
