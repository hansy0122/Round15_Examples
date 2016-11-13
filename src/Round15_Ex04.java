class A4 implements Runnable{
	public void run(){
		System.out.println("i am here");
	}
}
public class Round15_Ex04 {
	public static void main(String ar[]){
		Thread mt=new Thread(new A4());
		mt.start();
	}
}
