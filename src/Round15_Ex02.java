class AA extends Thread{
	public void run(){
		System.out.println("AA Start");
		System.out.println("AA ������"+Thread.activeCount());
		System.out.println("���� ������"+Thread.currentThread());
		System.out.println();
		
		Thread[] th=new Thread[Thread.activeCount()];
		Thread.enumerate(th);   // ����Ȱ�� ���� ��� thread �� �迭�� �����ϴ� ���
		for(int i=0;i<th.length;i++){
			System.out.println("IIIIIIIII===="+th[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("AA end");
	}
}


public class Round15_Ex02 {
	public static void main(String ar[]){
		System.out.println("main start");
		int x=Thread.activeCount();
		System.out.println("������"+x);
		System.out.println("���� ������"+Thread.currentThread());
		try {
			Thread.sleep(3000);             //��ü Thead�� �ð����� ((currentThread�� ���ؼ�))
	}catch(InterruptedException ee){}           //�ð����� method 
		
		
		
		
		
		AA ap=new AA();
		ap.setPriority(Thread.MIN_PRIORITY); // start ���� �����ؾ���. ++ 10~1 ���� ����. max 10 min 1 �̰� ���ڰ� �������� �켱������ ����.
		ap.setDaemon(true); //Daemon���� �����ع���. main �� ������ Thread�� ����.
		ap.start();
		ap.interrupt();
		Thread.currentThread().interrupt();
		for(int i=1;i<100;i++){
			System.out.print(i);
			if(i%10==0)	{System.out.println();}
			else {System.out.print("\t");} 
		}
	}
}
