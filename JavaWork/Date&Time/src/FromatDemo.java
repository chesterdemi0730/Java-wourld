
public class FromatDemo {
	public static void main(String[] args) {

		String str1 = null;  
		String str2 = null;
		
		// Αて才﹃  
		str1 = String.format("Α把计$ㄏノ%1$d,%2$d,%3$s", 99,44,"abc");  
		str2 = String.format("str2: %1$s,%2$d", "This is a test" , 100);
		
		// 块才﹃跑秖  
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.printf("陪ボタ璽计才腹%+d籔%d%n", 99,-99);  
		  
		System.out.printf("礚砞﹚0: %01d%n", 7);
		
		System.out.printf("砞﹚ㄢ0: %03d%n", 7);
		  
		System.out.printf("Tab龄狦琌% 8d%n", 7);  
		  
		System.out.printf("俱计だ舱狦琌%,d%n", 9989997);  
		  
		System.out.printf("セ基琌%2.2fじ%n", 49.8);
		
		System.out.printf("砞﹚计翴: %2.1fじ%n", 49.8);
		
	}

}
