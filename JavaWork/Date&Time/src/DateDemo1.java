import java.util.Date;

public class DateDemo1 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		// ��ܩҦ�����P�ɶ����H�� %tc , CST�O�ɰ�
		System.out.printf("�H��: %tc%n", date);
		
		// ��ܤ�/��/�~���榡 %tD
		System.out.printf("��/��/�~�榡: %tD%n", date);
		
		// ��ܦ~-��-�骺�榡 %tF
		System.out.printf("�~-��-��榡: %tF%n", date);
		
		// HH:MM:SS PM�榡 (12�ɨ�) %tr
		System.out.printf("HH:MM:SS PM�榡: %tr%n", date);
		
		// HH:MM:SS �榡 (24�ɨ�) %tT
		System.out.printf("HH:MM:SS �榡: %tT%n", date);
		
		// HH:MM �榡 (24�ɨ�) %tR
		System.out.printf("HH:MM �榡: %tR%n", date);
		
		// �~-��-�� HH:MM:SS �榡: %1$tF %1$tT
		System.out.printf("�~-��-�� HH:MM:SS �榡: %1$tF %1$tT%n", date);
		
	}

}
