package StringBuilder;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		StringBuilder x=new StringBuilder(sb);
		sb.append("abc");	//׷��
		StringBuilder sbb=sb.append("de");
		sb.append("fg");
		sb.reverse();
		System.out.println(sbb.toString());
		sb.insert(0, "bc");
		System.out.println(sb);
		sb.delete(0, 2);		//ǰ���󲻰�
		System.out.println(sb);
	//----------------------------------------------------
		StringBuilder sbu=new StringBuilder();
		char []c=new char[16];
		sbu.append("abc");
		
		
	}
}
