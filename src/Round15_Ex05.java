import java.util.*;
import java.text.*;


class A5 extends Thread {
	public void run(){
		while(true){
			Date date=new Date();
			System.out.println("date="+date);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
			
		}
	}
}

class B6 extends Thread{
	public void run(){
		for(int i=0; i<1000;i++){
			System.out.println(i);
			try{
				Thread.sleep(400);
			}catch(InterruptedException ie){}
			
			
		}
	}
}
public class Round15_Ex05 {
	public static void main(String ar[]){
		System.out.println("main start");
		A5 ap=new A5();
		ap.start();
		B6 bp =new B6();
		bp.start();
		System.out.println("main end");
	}

}
