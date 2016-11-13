import java.util.*;
import java.text.*;
class AAA extends Thread{
	public void run(){
		while(true){
			SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			Date d=new Date();
			String str=format.format(d);
			System.out.println("현재시간="+str);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
			
		}
	}
}
public class Round15_Ex03 {
	public static void main(String ar[]){
		System.out.println("main Start");
		AAA ap=new AAA();
		ap.setDaemon(true);
		ap.start();
		try{
			ap.join(5000); //ap 너 혼자만 실행해 Waits for this thread to die.
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		
		System.out.println("main end");
	}

}
