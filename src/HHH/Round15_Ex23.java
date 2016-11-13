package HHH;
import java.util.*;

public class Round15_Ex23 {
	public static void main(String ar[]){
		String str="aaa,bbb,ccc,ddd,eee,fff,ggg:hasy1111:qwdwqdwq";
		StringTokenizer stk=new StringTokenizer(str,",:",true); //true 냐 안적느냐 차이는 구분자를 출력할것인가 아닌가이다.
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
	}
}
