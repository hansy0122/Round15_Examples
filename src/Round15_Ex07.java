import java.io.*;
public class Round15_Ex07 {
	
		public static int aaa(){
			BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
			int age=0;
			try{
				System.out.print("age=");
				age=Integer.parseInt(in.readLine());
				return age;
			}catch(NumberFormatException n){
				n.printStackTrace();
				System.out.println("error="+n.getMessage());
				return age;
			}catch(IOException i){
				return age;
			}finally{
				System.out.println("age="+age);
			}
		}
		public static void main(String ar[]){
			System.out.println("main start");
			aaa();
			System.out.println("main end");
			
		}
	}

