package HHH;
import java.io.*;
import java.util.ArrayList;


public class Round15_fianl {
public static void main(String ar[])throws IOException{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	ArrayList al=new ArrayList();
	while(true){
		System.out.print("1.�� 2.�簢�� 3.��ü���� 4.����");
		int x=System.in.read()-48;
		in.readLine();
		
		if(x==1){
			MyPoint mp=new MyCircle();
			mp.input();
			al.add(mp);	
			
		}
		else if(x==2){
			MyPoint mp=new MyRect();
			mp.input();
			al.add(mp);
		}
		else if(x==3){
			for(int i=0;i<al.size();i++){
				MyPoint mp=(MyPoint)al.get(i);     //object�� ���� ū�ű� ... �׾ȿ� mypoint �׾ȿ� myrect mycircle�ε� ��.. ���� ������Ʈ�� ���� mypoint�� ����ȯ ��Ŵ.. �� �ٵ� ������������ �����ؾ��ϴ°ǰ� ?
				mp.output();
			}
			
		}else if(x==4){
			System.out.println("�ý��� �����մϴ�.");
			System.exit(0);		
		}else{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		
		
	}

}
}
