package HHH;

public class Round15_Ex21 {
	public static void main(String ar[])throws Exception{
		String str=new String("Hello Java!");
		String str1="hello java!";
		
		char a=str.charAt(0);//0 ���� ������ H
		System.out.println(a); 
		
		boolean b=str.endsWith("va!");  //�����ڰ� �̷��� �����°�
		System.out.println(b);
		
		boolean c=str.equals(str1); // ���� �Ȱ���
		System.out.println(c);
		
		boolean d=str.equalsIgnoreCase(str1); //��ҹ��� ���� ���ϰ� ���� �Ȱ���
		System.out.println(d);
		
		
		byte e[]=str.getBytes("ISO8859_1");
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
		}
		System.out.println();
		
		
		System.out.println("o�� ��ġ"+str.indexOf("o"));
		System.out.println(str.length());
		System.out.println(str.startsWith("He"));
		System.out.println("6~10"+str.substring(6, 10));
		System.out.println(str.toUpperCase());
		System.out.println("                wdqdwq".trim());
		
		String str2="ABCD";
		str2.substring(2, 3);
		System.out.println(str2);
		
		StringBuffer str3=new StringBuffer("ABCD");
		str3.append("E");
		System.out.println(str3);
		
		
		
		
		
	}
}
