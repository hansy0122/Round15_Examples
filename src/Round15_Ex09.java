class O {
	public void aaa() throws Exception{
		throw new Exception("aaa()");
		
	}
	public void bbbb()throws Exception{
		aaa();
	}
}
public class Round15_Ex09 {
public static void main(String ar[]) throws Exception{
	O op=new O();
	op.bbbb();
} 
}
