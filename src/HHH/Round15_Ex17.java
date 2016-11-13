package HHH;
import java.util.*;

class EF{}
class GH{}

public class Round15_Ex17 {
	public static void main(String ar[]){
		EF a=new EF();
		GH b=new GH();
		String c=new String("C");

		
		Hashtable ht=new Hashtable();
		ht.put("EF", a); // Å°, °ª
		ht.put("GH", b);
		ht.put("ST", c);
		
		 Enumeration enu=ht.elements();
		 while(enu.hasMoreElements()){
			 Object obj=enu.nextElement();
			 System.out.println("obj="+obj);
		 }
		 
		 //object obj=ht.get("EF");
		 
		 Enumeration enu1=ht.keys();
		 while(enu1.hasMoreElements()){
			 String name =(String)enu1.nextElement();
			 Object obj1=ht.get(name);
			 System.out.println(name+"--->"+obj1);
		 }
		 
		
	}

}
