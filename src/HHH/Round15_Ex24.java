package HHH;
import java.util.*;
public class Round15_Ex24 {
	public static void main(String ar[]){
		ArrayList al=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		
		
		/*for(int i=0;i<al.size();i++){
			String imsi=(String)(al.get(i));          //object�� string ���� ����ȯ
			System.out.println(imsi);*/
		
		for(Object o:al){							//�켱 �������� �𸣴� object �� 0�� ����
			System.out.println((String)o);            //String���� ����ȯ �Ŀ� ��� 
			}
		
		/* generic �� �Է°� ����� ������������ !! 
		  package HHH;
import java.util.*;
public class Round15_Ex24 {
public static void main(String ar[]){
	ArrayList<String> al=new ArrayList();
	al.add("aaa");
	al.add("bbb");
	al.add("ccc");
	
	
	
	for(String o:al){							//�켱 �������� �𸣴� object �� 0�� ����
		System.out.println(o);            //String���� ����ȯ �Ŀ� ��� 
		 
		 */
		
		 // �迭������ ��밡�� 
		String str[]={"abc","def","fwef"};
		for(String s:str){
			System.out.println(s);
		}
		
	}
}
