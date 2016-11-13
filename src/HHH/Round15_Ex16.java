package HHH;

import java.util.*;

abstract class ABCD{
	public abstract void disp();
}


class AB extends ABCD{
	public void disp(){
		System.out.println("AA");
	}
}

class CD extends ABCD{
	public void disp(){
		System.out.println("CC");
	}
}
public class Round15_Ex16 {
	public static void main(String ar[]){
		AB a=new AB();
		CD b=new CD();
		String c=new String("C");
		
		
		HashSet hs=new HashSet();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println("obj="+obj);
		}
		
		HashSet hs1=new HashSet();
		hs1.add(a);
		hs1.add(b);
		
		Iterator it1=hs1.iterator();
		
		while(it1.hasNext()){
			ABCD oo=(ABCD)it1.next();
			System.out.println("obj="+oo);
			oo.disp();
		}
	}

}
