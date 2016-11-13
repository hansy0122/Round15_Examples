import java.io.*;

class My extends Exception{
	private String message;
	private Throwable cause;
	public My(){
		super(); //���� ������
	};
	
	public My(String msg){
		super(msg); // msg�� later retrieval Throwable.getMessage() method
		message=msg; 
	}
	
	public My(Throwable cause){
		super(cause); // cuase�� later retrieval by the Throwable.getCause() method
		this.cause=cause; 
	}
	
	public My(String msg,Throwable cause){
		super(msg,cause);
		this.message=msg;
		this.cause=cause;
	}
	
	public void setCause(Throwable cause){
		this.cause=cause;
	}
	
	public void setMessage(String message){
		this.message=message;	
	}
	
	public Throwable getCause(){
		return this.cause;
	}
	
	public String getMassage(){
		return this.message;
	}
	
	
	public void printStackTrace(){
		System.out.println("error happen");
		System.out.println("��������="+message);
		System.out.println("����Ŭ����="+cause);
		System.out.println("end");
		super.printStackTrace(System.out);
	}
	
	public void printStackTrace(PrintStream out){
		super.printStackTrace(out);
	}
	
	public void printStackTrace(PrintWriter out){
		super.printStackTrace(out);
	}
	
}

public class Round15_Ex12 {
	public static void main(String ar[]) throws Exception{
		int x=100;
		int y=0;
		int tot=0;
		try{
			tot=x/y;
		}catch(ArithmeticException ae){
			My me=new My("������",ae);
			me.printStackTrace();
		}
		System.out.println(tot);
		
	}
}
