class A extends Thread{ //���� ���
		public void run(){ //main methods ������ ��.
			System.out.print("A");
		}
	
}

class B implements Runnable { //���߻��
	public void run(){ //main methods ������ ��.
		System.out.print("B");
	}
}



public class Round15_Ex01 {
	public static void main(String ar[]){ //�� main method
		System.out.println("main");
		A ap= new A();
		B bp= new B();
		Thread th= new Thread(bp);      // ����ϴ� ���.
		//ap.run();  //method ȣ����.  --> thread�� �ƴ�. ������� �����������.
		
		ap.start(); //thread ȣ��. �غ��� �ð��� �ʿ�.������� �����������.
		
		
		//bp.run(); //method ȣ��
		// bp.start(); �Ұ�����. 
		
		th.start();
		
	
		for(int i=1;i<100;i++){
			System.out.print(i);
			if(i%10==0)	{System.out.println();}
			else {System.out.print("\t");} 
		}
	}
}
