import java.lang.*; // 사실 자동 import 라 생략가능
public class Round15_Ex19 {
	public static void main(String ar[]){
		Boolean bool1=new Boolean(false);
		Boolean bool2=new Boolean("true");
		Boolean bool3=Boolean.FALSE;
		Boolean bool4=Boolean.valueOf(false);
		Boolean bool5=Boolean.valueOf("true");
		
		
		
		System.out.println(bool2.booleanValue());
		System.out.println(Byte.MAX_VALUE+","+Byte.MIN_VALUE);
		
		try{
			Class cl=Class.forName("Round15_Ex18"); 
			System.out.println(cl.getMethods());
		
		}catch(ClassNotFoundException ee){
			System.out.println("찾을수없다." );
		}
		
		System.out.println(Math.PI);
		
		float f=3.5f;
		System.out.println(Math.ceil(f));
		System.out.println(Math.round(f));
		System.out.println(Math.floor(f));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*11));
	
	}
}
