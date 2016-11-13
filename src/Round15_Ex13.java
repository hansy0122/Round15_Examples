import java.io.*;

public class Round15_Ex13 {
	private static BufferedReader in;
	static{
		in =new BufferedReader(new InputStreamReader(System.in));
	}
	public static void main(String ar[])throws IOException{
		int su1=0,su2=0,tot=0;
		char yon=0,flag=0;
		while(true){
			do{
				flag=0;
				try{
					System.out.print("su1=");
					su1=Integer.parseInt(in.readLine());
				}catch(NumberFormatException n){
					System.out.println("only number available");
					flag=1;
				}
			}while(flag !=0);
				
				do{
					
				
				do{
					flag=0;
					String str="";
					
					try{
						System.out.print("YON(+,-,/,*)=");
						str=in.readLine();
						yon=str.charAt(0);
					}catch(StringIndexOutOfBoundsException siooe){
						System.out.println("뭐든 입력하세요");
						flag=1;
					}
					if(str.length() !=1){
						System.out.println("input only one available yon");
						flag=1;
					}
				}while(flag !=0 ||yon!='+'&&yon!='-'&&yon!='/'&&yon!='*');
				
				do{
					flag=0;
					try{
						System.out.print("su2=");
						su2=Integer.parseInt(in.readLine());
					}catch(NumberFormatException n){
						System.out.println("only number available");
						flag=1;
				}	
		}while(flag !=0);
				flag=0;
				try{
					switch(yon){
					case '+':tot=su1+su2;break;
					case '-':tot=su1-su2;break;
					case '/':tot=su1/su2;break;
					case '*':tot=su1*su2;break;
					}
				}catch(ArithmeticException ae){
						System.out.println("0으로 나눌수 없습니다.");
						flag=1;
					}
				}while(flag !=0);
				System.out.println(su1+""+yon+su2+"="+tot);
	}
		
	}
	
}
