import java.util.*;

class IJ{}
class KL{}
public class Round15_Ex18 {
public static void main(String ar[]){
	IJ a=new IJ();
	KL b=new KL();
	String c=new String("c");
	
	Vector vc=new Vector();
	ArrayList al=new ArrayList();
	vc.add(a); vc.add(b); vc.add(c);
	al.add(a); al.add(b); al.add(c);
	
	for(int i=0;i< vc.size();i++){
		Object obj=vc.elementAt(i);
		System.out.println(i+"--->"+obj);
	}
	System.out.println();
for(int i=0;i< al.size();i++){
	Object obj=al.get(i);
	System.out.println(i+"--->"+obj);
	}
	
}
}
