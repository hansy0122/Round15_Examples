import java.io.*;
public class Round15_Ex15 {
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x=");
		int x=Integer.parseInt(in.readLine());
		
		
		assert x>5: "5 up";
		if(x>5){
			System.out.println("5 크다");
		}
		else{
			System.out.println("5 작다");
		}
		
		
	}

}
