package HHH;
import java.io.*;
import java.util.ArrayList;


public class Round15_fianl {
public static void main(String ar[])throws IOException{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	ArrayList al=new ArrayList();
	while(true){
		System.out.print("1.원 2.사각형 3.전체보기 4.종료");
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
				MyPoint mp=(MyPoint)al.get(i);     //object가 제일 큰거구 ... 그안에 mypoint 그안에 myrect mycircle인데 흠.. 얻은 오브젝트를 작은 mypoint로 형변환 시킴.. 흠 근데 다형성적으로 생각해야하는건가 ?
				mp.output();
			}
			
		}else if(x==4){
			System.out.println("시스템 종료합니다.");
			System.exit(0);		
		}else{
			System.out.println("잘못된 수를 입력하셨습니다.");
		}
		
		
	}

}
}
