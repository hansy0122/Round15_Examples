class K extends Thread{
	private int x=100;
	public  synchronized void setX(int x){
		this.x+=x;
	}
	public synchronized int getX(){
		return x;
	}
	public void run(){
		synchronized(this){
		setX(200);
		System.out.println(getX());
		}
	}
}
public class Round15_Ex08 {
	public static void main(String ar[]){
	K kk=new K();
	K kk1=new K();
	kk.start();
	kk1.start();
	}
}
