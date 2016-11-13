package HHH;
import java.util.*;
public class Round15_Ex24 {
	public static void main(String ar[]){
		ArrayList al=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		
		
		/*for(int i=0;i<al.size();i++){
			String imsi=(String)(al.get(i));          //object를 string 으로 형변환
			System.out.println(imsi);*/
		
		for(Object o:al){							//우선 무엇인지 모르니 object 로 0를 선언
			System.out.println((String)o);            //String으로 형변환 후에 출력 
			}
		
		/* generic 은 입력과 출력이 정해져있을때 !! 
		  package HHH;
import java.util.*;
public class Round15_Ex24 {
public static void main(String ar[]){
	ArrayList<String> al=new ArrayList();
	al.add("aaa");
	al.add("bbb");
	al.add("ccc");
	
	
	
	for(String o:al){							//우선 무엇인지 모르니 object 로 0를 선언
		System.out.println(o);            //String으로 형변환 후에 출력 
		 
		 */
		
		 // 배열에서도 사용가능 
		String str[]={"abc","def","fwef"};
		for(String s:str){
			System.out.println(s);
		}
		
	}
}
