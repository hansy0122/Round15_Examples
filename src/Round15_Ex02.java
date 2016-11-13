class AA extends Thread{
	public void run(){
		System.out.println("AA Start");
		System.out.println("AA 갯수는"+Thread.activeCount());
		System.out.println("지금 스레드"+Thread.currentThread());
		System.out.println();
		
		Thread[] th=new Thread[Thread.activeCount()];
		Thread.enumerate(th);   // 지금활동 중인 모든 thread 를 배열에 저장하는 기능
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
		System.out.println("갯수는"+x);
		System.out.println("지금 스레드"+Thread.currentThread());
		try {
			Thread.sleep(3000);             //전체 Thead에 시간지연 ((currentThread에 대해서))
	}catch(InterruptedException ee){}           //시간지연 method 
		
		
		
		
		
		AA ap=new AA();
		ap.setPriority(Thread.MIN_PRIORITY); // start 전에 설정해야함. ++ 10~1 까지 가능. max 10 min 1 이고 숫자가 높을수록 우선순위가 높음.
		ap.setDaemon(true); //Daemon으로 설정해버림. main 이 끝나면 Thread도 죽음.
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
