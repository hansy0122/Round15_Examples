import java.io.*;

public class Round15_Ex06 {
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		   int x=0,y=0;
		   double t;
		   boolean bool=false;
		 
		   
		   do{
			   bool=false;
		
		   System.out.println("x=");
		   try{
		   x=Integer.parseInt(in.readLine());}catch(NumberFormatException n){
			   System.out.println("x must be number");
			   bool=true;
		   }
		   }while(bool);
		 
		   
		   do{
			   bool=false;
		
		   System.out.println("y=");
		   try{
		   y=Integer.parseInt(in.readLine());}catch(NumberFormatException n){
			   System.out.println("y must be number");
			   bool=true;
		   }
		   }while(bool);
		   
		   try{
			   t=(double)x/y;
		   }catch(ArithmeticException a){
			   t=x;
		   }
		   System.out.println(""+x+"\t"+y+"\t"+t);
		   
		   
	}

}
