package HHH;
import java.util.*;
import java.text.*;
public class Round15_Ex22 {
	public static void main(String ar[]){
		Date d=new Date();
		System.out.println(d); // 현재시간 출력
		System.out.println("year"+d.getYear());
		System.out.println("month"+(d.getMonth()+1));
		System.out.println("year"+d.getDate());
		System.out.println("year"+d.getMinutes());
		System.out.println("year"+d.getSeconds());
		
		
		Calendar ca=Calendar.getInstance();
		System.out.println(ca);
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1);         //month는 +1 해줘야함.
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.MINUTE));
		System.out.println(ca.get(Calendar.SECOND));
		
		
		System.out.println();
		Date dd=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=format.format(dd);
		System.out.println(str);
		
	}
}
