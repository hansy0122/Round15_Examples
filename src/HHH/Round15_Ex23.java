package HHH;
import java.util.*;

public class Round15_Ex23 {
	public static void main(String ar[]){
		String str="aaa,bbb,ccc,ddd,eee,fff,ggg:hasy1111:qwdwqdwq";
		StringTokenizer stk=new StringTokenizer(str,",:",true); //true �� �������� ���̴� �����ڸ� ����Ұ��ΰ� �ƴѰ��̴�.
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
	}
}
