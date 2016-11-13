class A extends Thread{ //단일 상속
		public void run(){ //main methods 역할을 함.
			System.out.print("A");
		}
	
}

class B implements Runnable { //다중상속
	public void run(){ //main methods 역할을 함.
		System.out.print("B");
	}
}



public class Round15_Ex01 {
	public static void main(String ar[]){ //주 main method
		System.out.println("main");
		A ap= new A();
		B bp= new B();
		Thread th= new Thread(bp);      // 사용하는 방법.
		//ap.run();  //method 호출임.  --> thread가 아님. 순서대로 실행되지않음.
		
		ap.start(); //thread 호출. 준비할 시간이 필요.순서대로 실행되지않음.
		
		
		//bp.run(); //method 호출
		// bp.start(); 불가능함. 
		
		th.start();
		
	
		for(int i=1;i<100;i++){
			System.out.print(i);
			if(i%10==0)	{System.out.println();}
			else {System.out.print("\t");} 
		}
	}
}
